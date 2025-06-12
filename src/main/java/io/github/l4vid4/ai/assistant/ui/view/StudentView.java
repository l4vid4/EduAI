package io.github.l4vid4.ai.assistant.ui.view;

import io.github.l4vid4.ai.assistant.data.BookingDetails;
import io.github.l4vid4.ai.assistant.entity.UndergraInfo;
import io.github.l4vid4.ai.assistant.entity.VO.CourseGradeVO;
import io.github.l4vid4.ai.assistant.entity.VO.StudentInfoVO;
import io.github.l4vid4.ai.assistant.service.UndergraInfoService;
import io.github.l4vid4.ai.assistant.services.CustomerSupportAssistant;
import io.github.l4vid4.ai.assistant.services.FlightBookingService;
import io.github.l4vid4.ai.assistant.services.StudentInfoService;
import io.github.l4vid4.ai.assistant.ui.component.SeatSelector;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.messages.MessageList;
import com.vaadin.flow.component.messages.MessageListItem;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.Route;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

@Route("/stu")
public class StudentView extends SplitLayout {

    private StudentInfoService studentInfoService;
    private final CustomerSupportAssistant assistant;
    private Grid<StudentInfoVO> grid;
    private final String chatId = UUID.randomUUID().toString();
    private UI ui;

    public StudentView(
            StudentInfoService studentInfoService,
            CustomerSupportAssistant assistant
    ) {
        this.studentInfoService = studentInfoService;
        this.assistant = assistant;
        setSizeFull();
        setOrientation(Orientation.HORIZONTAL);
        setSplitterPosition(30);

        addToPrimary(createChatLayout());
        addToSecondary(createGrid());

        updateStudents();
    }


    private Component createChatLayout() {
        var chatLayout = new VerticalLayout();
        var messageList = new MessageList();
        var messageInput = new MessageInput();

        messageList.setMarkdown(true);
        chatLayout.setPadding(false);

        messageInput.setWidthFull();
        messageInput.addSubmitListener(e -> handleMessageInput(e.getValue(), messageList));

        chatLayout.addAndExpand(messageList);
        chatLayout.add(messageInput);
        return chatLayout;
    }

    private Component createGrid() {
        grid = new Grid<>(StudentInfoVO.class);
        grid.setSizeFull();
        grid.setColumns();
        grid.addColumn(StudentInfoVO::getStuNumber).setHeader("学号").setAutoWidth(true);
        grid.addColumn(StudentInfoVO::getStuName).setHeader("姓名").setAutoWidth(true);
        grid.addColumn(StudentInfoVO::getClassName).setHeader("班级").setAutoWidth(true);
        grid.addColumn(StudentInfoVO::getGender).setHeader("性别").setAutoWidth(true);
        grid.addColumn(StudentInfoVO::getMajor).setHeader("专业").setAutoWidth(true);
        grid.addColumn(StudentInfoVO::getEthnicity).setHeader("民族").setAutoWidth(true);
        grid.addColumn(StudentInfoVO::getPoliticalStatus).setHeader("政治面貌").setAutoWidth(true);
        grid.addColumn(StudentInfoVO::getContactNumber).setHeader("联系方式").setAutoWidth(true);

        return grid;
    }


    private void handleMessageInput(String userMessage, MessageList messageList) {
        var userMessageItem = new MessageListItem(userMessage, null, "You");
        userMessageItem.setUserColorIndex(1);
        messageList.addItem(userMessageItem);

        var first = new AtomicBoolean(true);
        var responseItem = new MessageListItem("", null, "Assistant");
        responseItem.setUserColorIndex(2);

        assistant.chat(chatId, userMessage, this)
            .doOnComplete(() -> ui.access(this::updateStudents))
            .subscribe(token -> ui.access(() -> {
                if (first.get()) {
                    responseItem.setText(token);
                    messageList.addItem(responseItem);
                    first.set(false);
                } else {
                    responseItem.appendText(token);
                }
            }));
    }

    @Tool(description = "根据学号展示学生成绩")
    public String showStudentGrades(String studentNumber) {
        CompletableFuture<String> showGradesFuture = new CompletableFuture<>();

        // 查询成绩
        List<CourseGradeVO> grades = studentInfoService.getCourseGradeByStudentCode(studentNumber);

        Dialog dialog = new Dialog();
        dialog.setModal(true);
        dialog.setHeaderTitle("学号 " + studentNumber + " 的成绩");

        dialog.setWidth("800px");
        dialog.setHeight("500px");

        VerticalLayout layout = new VerticalLayout();
        layout.setSpacing(false);
        layout.setPadding(false);

        if (grades.isEmpty()) {
            layout.add(new Paragraph("未找到该学生的成绩记录。"));
        } else {
            Grid<CourseGradeVO> gradeGrid = new Grid<>(CourseGradeVO.class, false);
            gradeGrid.setItems(grades);
            gradeGrid.addColumn(CourseGradeVO::getCourseName).setHeader("课程名").setAutoWidth(true);
            gradeGrid.addColumn(CourseGradeVO::getScore).setHeader("成绩").setAutoWidth(true);
            gradeGrid.addColumn(CourseGradeVO::getExamDate).setHeader("考试时间").setAutoWidth(true);
            gradeGrid.addColumn(CourseGradeVO::getTeacherName).setHeader("授课教师").setAutoWidth(true);
            gradeGrid.setWidthFull();
            layout.add(gradeGrid);
        }

        Button closeButton = new Button("关闭", event -> {
            dialog.close();
            dialog.removeAll(); // 清除所有子组件，避免残留
            showGradesFuture.complete("成绩查看完毕");
        });

        layout.add(closeButton);
        dialog.add(layout);

        ui.access(dialog::open);

        try {
            return showGradesFuture.get();  // 等待用户关闭弹窗
        } catch (Exception e) {
            throw new RuntimeException("显示成绩时出错", e);
        }
    }


    private void updateStudents() {
        grid.setItems(studentInfoService.getAllStudentInfo());
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        this.ui = attachEvent.getUI();
    }

    @Override
    protected void onDetach(DetachEvent detachEvent) {
        super.onDetach(detachEvent);
        this.ui = null;
    }
}

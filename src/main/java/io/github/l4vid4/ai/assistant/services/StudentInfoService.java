package io.github.l4vid4.ai.assistant.services;

import io.github.l4vid4.ai.assistant.entity.CourseGrade;
import io.github.l4vid4.ai.assistant.entity.UndergraInfo;
import io.github.l4vid4.ai.assistant.entity.VO.CourseGradeVO;
import io.github.l4vid4.ai.assistant.entity.VO.StudentInfoVO;
import io.github.l4vid4.ai.assistant.service.CourseGradeService;
import io.github.l4vid4.ai.assistant.service.UndergraInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoService {

    @Autowired
    UndergraInfoService undergraInfoService;

    @Autowired
    CourseGradeService courseGradeService;

    public List<StudentInfoVO> getAllStudentInfo(){
        return undergraInfoService.getAllStudentInfo();
    }

    public List<CourseGradeVO> getCourseGradeByStudentCode(String stuCode){
        return courseGradeService.getCourseGradeByStuCode(stuCode);
    }
}

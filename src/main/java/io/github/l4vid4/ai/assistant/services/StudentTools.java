package io.github.l4vid4.ai.assistant.services;

import io.github.l4vid4.ai.assistant.entity.CourseGrade;
import io.github.l4vid4.ai.assistant.entity.UndergraInfo;
import io.github.l4vid4.ai.assistant.mapper.CourseGradeMapper;
import io.github.l4vid4.ai.assistant.mapper.UndergraInfoMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentTools {

    @Autowired
    UndergraInfoMapper undergraInfoMapper;

    @Autowired
    CourseGradeMapper courseGradeMapper;

    @Tool(description = "根据学号获取学生信息")
    public UndergraInfo getStudentInfoByStuCode(String studentCode){
        try {
            UndergraInfo undergraInfo = undergraInfoMapper.selectOne(new LambdaQueryWrapper<UndergraInfo>().eq(UndergraInfo::getStuNumber, studentCode));
            if (undergraInfo == null) {
                return new UndergraInfo();
            }
            return undergraInfo;
        }catch (Exception e){
            return new UndergraInfo();
        }
    }

//    @Tool(description = "根据学号获取学生各科成绩")
//    public List<CourseGrade> getCourseGradeByStuCode(String studentCode){
//        try {
//            return courseGradeMapper.selectList(new LambdaQueryWrapper<CourseGrade>().eq(CourseGrade::getStuNumber, studentCode));
//        }catch (Exception e){
//            return new ArrayList<>();
//        }
//    }

    @Tool(description = "根据学生姓名查询学生信息")
    public List<UndergraInfo> getStudentInfoByStuName(String studentName){
        try{
            return undergraInfoMapper.selectList(new LambdaQueryWrapper<UndergraInfo>().eq(UndergraInfo::getStuName, studentName));
        }catch (Exception e){
            return new ArrayList<>();
        }
    }
}

package ai.spring.demo.ai.playground.services;

import ai.spring.demo.ai.playground.entity.CourseGrade;
import ai.spring.demo.ai.playground.entity.UndergraInfo;
import ai.spring.demo.ai.playground.entity.VO.CourseGradeVO;
import ai.spring.demo.ai.playground.entity.VO.StudentInfoVO;
import ai.spring.demo.ai.playground.service.CourseGradeService;
import ai.spring.demo.ai.playground.service.UndergraInfoService;
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

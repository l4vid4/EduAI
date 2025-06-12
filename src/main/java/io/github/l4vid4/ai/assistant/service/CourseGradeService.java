package ai.spring.demo.ai.playground.service;

import ai.spring.demo.ai.playground.entity.CourseGrade;
import ai.spring.demo.ai.playground.entity.VO.CourseGradeVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Lang
* @description 针对表【course_grade(画像-学生成绩-课程成绩)】的数据库操作Service
* @createDate 2025-06-11 16:21:45
*/
public interface CourseGradeService extends IService<CourseGrade> {
    List<CourseGradeVO> getCourseGradeByStuCode(String stuCode);
}

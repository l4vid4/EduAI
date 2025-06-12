package ai.spring.demo.ai.playground.mapper;

import ai.spring.demo.ai.playground.entity.CourseGrade;
import ai.spring.demo.ai.playground.entity.VO.CourseGradeVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author Lang
* @description 针对表【course_grade(画像-学生成绩-课程成绩)】的数据库操作Mapper
* @createDate 2025-06-11 16:21:45
* @Entity ai.spring.demo.ai.playground.entity.CourseGrade
*/
@Mapper
public interface CourseGradeMapper extends BaseMapper<CourseGrade> {

    List<CourseGradeVO> selectCourseGradeByStuCode(String stuCode);
}





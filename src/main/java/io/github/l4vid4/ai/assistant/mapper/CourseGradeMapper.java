package io.github.l4vid4.ai.assistant.mapper;

import io.github.l4vid4.ai.assistant.entity.CourseGrade;
import io.github.l4vid4.ai.assistant.entity.VO.CourseGradeVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author Lang
* @description 针对表【course_grade(画像-学生成绩-课程成绩)】的数据库操作Mapper
* @createDate 2025-06-11 16:21:45
* @Entity io.github.l4vid4.ai.assistant.entity.CourseGrade
*/
@Mapper
public interface CourseGradeMapper extends BaseMapper<CourseGrade> {

    List<CourseGradeVO> selectCourseGradeByStuCode(String stuCode);
}





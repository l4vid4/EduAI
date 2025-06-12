package io.github.l4vid4.ai.assistant.service.impl;

import io.github.l4vid4.ai.assistant.entity.VO.CourseGradeVO;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.l4vid4.ai.assistant.entity.CourseGrade;
import io.github.l4vid4.ai.assistant.service.CourseGradeService;
import io.github.l4vid4.ai.assistant.mapper.CourseGradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Lang
* @description 针对表【course_grade(画像-学生成绩-课程成绩)】的数据库操作Service实现
* @createDate 2025-06-11 16:21:45
*/
@Service
public class CourseGradeServiceImpl extends ServiceImpl<CourseGradeMapper, CourseGrade>
    implements CourseGradeService{

    @Autowired
    CourseGradeMapper courseGradeMapper;

    @Override
    public List<CourseGradeVO> getCourseGradeByStuCode(String stuCode) {
        return courseGradeMapper.selectCourseGradeByStuCode(stuCode);
    }
}





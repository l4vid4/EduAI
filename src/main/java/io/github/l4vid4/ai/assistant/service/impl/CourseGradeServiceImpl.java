package ai.spring.demo.ai.playground.service.impl;

import ai.spring.demo.ai.playground.entity.VO.CourseGradeVO;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ai.spring.demo.ai.playground.entity.CourseGrade;
import ai.spring.demo.ai.playground.service.CourseGradeService;
import ai.spring.demo.ai.playground.mapper.CourseGradeMapper;
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





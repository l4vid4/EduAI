package ai.spring.demo.ai.playground.service;

import ai.spring.demo.ai.playground.entity.UndergraInfo;
import ai.spring.demo.ai.playground.entity.VO.StudentInfoVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Lang
* @description 针对表【undergra_info(画像-学生成绩-学生信息)】的数据库操作Service
* @createDate 2025-06-11 16:29:11
*/
public interface UndergraInfoService extends IService<UndergraInfo> {

    List<StudentInfoVO> getAllStudentInfo();

}

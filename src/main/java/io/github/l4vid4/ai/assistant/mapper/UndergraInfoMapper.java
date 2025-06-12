package ai.spring.demo.ai.playground.mapper;

import ai.spring.demo.ai.playground.entity.UndergraInfo;
import ai.spring.demo.ai.playground.entity.VO.StudentInfoVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author Lang
* @description 针对表【undergra_info(画像-学生成绩-学生信息)】的数据库操作Mapper
* @createDate 2025-06-11 16:29:11
* @Entity ai.spring.demo.ai.playground.entity.UndergraInfo
*/
@Mapper
public interface UndergraInfoMapper extends BaseMapper<UndergraInfo> {

    List<StudentInfoVO> selectAllStudentInfo();
}





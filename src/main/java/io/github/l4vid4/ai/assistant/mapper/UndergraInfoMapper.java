package io.github.l4vid4.ai.assistant.mapper;

import io.github.l4vid4.ai.assistant.entity.UndergraInfo;
import io.github.l4vid4.ai.assistant.entity.VO.StudentInfoVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author Lang
* @description 针对表【undergra_info(画像-学生成绩-学生信息)】的数据库操作Mapper
* @createDate 2025-06-11 16:29:11
* @Entity io.github.l4vid4.ai.assistant.entity.UndergraInfo
*/
@Mapper
public interface UndergraInfoMapper extends BaseMapper<UndergraInfo> {

    List<StudentInfoVO> selectAllStudentInfo();
}





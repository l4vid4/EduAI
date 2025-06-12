package ai.spring.demo.ai.playground.service.impl;

import ai.spring.demo.ai.playground.entity.VO.StudentInfoVO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ai.spring.demo.ai.playground.entity.UndergraInfo;
import ai.spring.demo.ai.playground.service.UndergraInfoService;
import ai.spring.demo.ai.playground.mapper.UndergraInfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
* @author Lang
* @description 针对表【undergra_info(画像-学生成绩-学生信息)】的数据库操作Service实现
* @createDate 2025-06-11 16:29:11
*/
@Service
public class UndergraInfoServiceImpl extends ServiceImpl<UndergraInfoMapper, UndergraInfo>
    implements UndergraInfoService{


    @Autowired
    UndergraInfoMapper undergraInfoMapper;

    @Override
    public List<StudentInfoVO> getAllStudentInfo() {
        return undergraInfoMapper.selectAllStudentInfo();
    }
}





package ai.spring.demo.ai.playground.entity.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class StudentInfoVO {

    /**
     * 学号
     */
    private String stuNumber;

    /**
     * 学生姓名
     */
    private String stuName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 民族
     */
    private String ethnicity;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 政治面貌
     */
    private String politicalStatus;


    /**
     * 专业
     */
    private String major;

    /**
     * 班级名称
     */
    private String className;
}

package ai.spring.demo.ai.playground.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 画像-学生成绩-课程成绩
 * @TableName course_grade
 */
@TableName(value ="course_grade")
@Data
public class CourseGrade implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 学号
     */
    private String stuNumber;

    /**
     * 姓名
     */
    private String stuName;

    /**
     * 课程编号
     */
    private String courseId;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 考试日期
     */
    private String examDate;

    /**
     * 课程成绩
     */
    private BigDecimal score;

    /**
     * 绩点成绩
     */
    private BigDecimal gpaScore;

    /**
     * 学分
     */
    private BigDecimal credit;

    /**
     * 任课教师姓名
     */
    private String teacherName;

    /**
     * 任课教师工号
     */
    private String teacherNumber;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 备注
     */
    private String remark;

    /**
     * 
     */
    private String year;

    /**
     * 
     */
    private String semester;

    /**
     * 是否免修，1：是，0：否
     */
    private String isRepairFree;

    /**
     * 课程等级成绩
     */
    private String courseGradeLevel;

    /**
     * 课程类别名称
     */
    private String courseCategoryName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CourseGrade other = (CourseGrade) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStuNumber() == null ? other.getStuNumber() == null : this.getStuNumber().equals(other.getStuNumber()))
            && (this.getStuName() == null ? other.getStuName() == null : this.getStuName().equals(other.getStuName()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
            && (this.getExamDate() == null ? other.getExamDate() == null : this.getExamDate().equals(other.getExamDate()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getGpaScore() == null ? other.getGpaScore() == null : this.getGpaScore().equals(other.getGpaScore()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()))
            && (this.getTeacherName() == null ? other.getTeacherName() == null : this.getTeacherName().equals(other.getTeacherName()))
            && (this.getTeacherNumber() == null ? other.getTeacherNumber() == null : this.getTeacherNumber().equals(other.getTeacherNumber()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getSemester() == null ? other.getSemester() == null : this.getSemester().equals(other.getSemester()))
            && (this.getIsRepairFree() == null ? other.getIsRepairFree() == null : this.getIsRepairFree().equals(other.getIsRepairFree()))
            && (this.getCourseGradeLevel() == null ? other.getCourseGradeLevel() == null : this.getCourseGradeLevel().equals(other.getCourseGradeLevel()))
            && (this.getCourseCategoryName() == null ? other.getCourseCategoryName() == null : this.getCourseCategoryName().equals(other.getCourseCategoryName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStuNumber() == null) ? 0 : getStuNumber().hashCode());
        result = prime * result + ((getStuName() == null) ? 0 : getStuName().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getCourseName() == null) ? 0 : getCourseName().hashCode());
        result = prime * result + ((getExamDate() == null) ? 0 : getExamDate().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getGpaScore() == null) ? 0 : getGpaScore().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        result = prime * result + ((getTeacherName() == null) ? 0 : getTeacherName().hashCode());
        result = prime * result + ((getTeacherNumber() == null) ? 0 : getTeacherNumber().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getSemester() == null) ? 0 : getSemester().hashCode());
        result = prime * result + ((getIsRepairFree() == null) ? 0 : getIsRepairFree().hashCode());
        result = prime * result + ((getCourseGradeLevel() == null) ? 0 : getCourseGradeLevel().hashCode());
        result = prime * result + ((getCourseCategoryName() == null) ? 0 : getCourseCategoryName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stuNumber=").append(stuNumber);
        sb.append(", stuName=").append(stuName);
        sb.append(", courseId=").append(courseId);
        sb.append(", courseName=").append(courseName);
        sb.append(", examDate=").append(examDate);
        sb.append(", score=").append(score);
        sb.append(", gpaScore=").append(gpaScore);
        sb.append(", credit=").append(credit);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", teacherNumber=").append(teacherNumber);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", remark=").append(remark);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", isRepairFree=").append(isRepairFree);
        sb.append(", courseGradeLevel=").append(courseGradeLevel);
        sb.append(", courseCategoryName=").append(courseCategoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
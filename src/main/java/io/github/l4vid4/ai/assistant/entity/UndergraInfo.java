package ai.spring.demo.ai.playground.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 画像-学生成绩-学生信息
 * @TableName undergra_info
 */
@TableName(value ="undergra_info")
@Data
public class UndergraInfo implements Serializable {
    /**
     * 学生ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 学生姓名
     */
    private String stuName;

    /**
     * 学号
     */
    private String stuNumber;

    /**
     * 性别
     */
    private String gender;

    /**
     * 民族
     */
    private String ethnicity;

    /**
     * 身份证号码
     */
    private String idCardNumber;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 政治面貌
     */
    private String politicalStatus;

    /**
     * 籍贯省份
     */
    private String nativeProvince;

    /**
     * 籍贯城市
     */
    private String nativeCity;

    /**
     * 生源所在省份
     */
    private String originProvince;

    /**
     * 生源所在城市
     */
    private String originCity;

    /**
     * 家长姓名
     */
    private String parentName;

    /**
     * 家长联系电话
     */
    private String parentContactNumber;

    /**
     * 教育程度
     */
    private String educationLevel;

    /**
     * 入学年份（必须，课程分析需要）
     */
    private String enrollmentYear;

    /**
     * 所属学院
     */
    private String college;

    /**
     * 专业
     */
    private String major;

    /**
     * 专业代码
     */
    private String majorCode;

    /**
     * 班级ID
     */
    private String classId;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 班内职务
     */
    private String classPosition;

    /**
     * 其他职务
     */
    private String otherPosition;

    /**
     * 辅导员姓名
     */
    private String instructorName;

    /**
     * 辅导员工号
     */
    private String instructorNumber;

    /**
     * 辅导员联系电话
     */
    private String instructorContactNumber;

    /**
     * 本科生班导师姓名
     */
    private String undergraduateMentorName;

    /**
     * 本科生班导师工号
     */
    private String undergraduateMentorNumber;

    /**
     * 学生团队负责人姓名
     */
    private String studentTeamLeaderName;

    /**
     * 学生团队负责人工号
     */
    private String studentTeamLeaderNumber;

    /**
     * 社团编号
     */
    private String clubCode;

    /**
     * 社团所属部门
     */
    private String clubDepartment;

    /**
     * 社团职位
     */
    private String clubPosition;

    /**
     * 宿舍楼栋号
     */
    private String dormBuildingNumber;

    /**
     * 宿舍校区
     */
    private String dormCampus;

    /**
     * 宿舍区域
     */
    private String dormArea;

    /**
     * 宿舍房间号
     */
    private String dormRoomNumber;

    /**
     * 年级
     */
    private String grade;

    /**
     * 创建者
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
     * 更新者
     */
    private String updateBy;

    /**
     * 备注
     */
    private String remark;

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
        UndergraInfo other = (UndergraInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStuName() == null ? other.getStuName() == null : this.getStuName().equals(other.getStuName()))
            && (this.getStuNumber() == null ? other.getStuNumber() == null : this.getStuNumber().equals(other.getStuNumber()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getEthnicity() == null ? other.getEthnicity() == null : this.getEthnicity().equals(other.getEthnicity()))
            && (this.getIdCardNumber() == null ? other.getIdCardNumber() == null : this.getIdCardNumber().equals(other.getIdCardNumber()))
            && (this.getContactNumber() == null ? other.getContactNumber() == null : this.getContactNumber().equals(other.getContactNumber()))
            && (this.getPoliticalStatus() == null ? other.getPoliticalStatus() == null : this.getPoliticalStatus().equals(other.getPoliticalStatus()))
            && (this.getNativeProvince() == null ? other.getNativeProvince() == null : this.getNativeProvince().equals(other.getNativeProvince()))
            && (this.getNativeCity() == null ? other.getNativeCity() == null : this.getNativeCity().equals(other.getNativeCity()))
            && (this.getOriginProvince() == null ? other.getOriginProvince() == null : this.getOriginProvince().equals(other.getOriginProvince()))
            && (this.getOriginCity() == null ? other.getOriginCity() == null : this.getOriginCity().equals(other.getOriginCity()))
            && (this.getParentName() == null ? other.getParentName() == null : this.getParentName().equals(other.getParentName()))
            && (this.getParentContactNumber() == null ? other.getParentContactNumber() == null : this.getParentContactNumber().equals(other.getParentContactNumber()))
            && (this.getEducationLevel() == null ? other.getEducationLevel() == null : this.getEducationLevel().equals(other.getEducationLevel()))
            && (this.getEnrollmentYear() == null ? other.getEnrollmentYear() == null : this.getEnrollmentYear().equals(other.getEnrollmentYear()))
            && (this.getCollege() == null ? other.getCollege() == null : this.getCollege().equals(other.getCollege()))
            && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()))
            && (this.getMajorCode() == null ? other.getMajorCode() == null : this.getMajorCode().equals(other.getMajorCode()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getClassName() == null ? other.getClassName() == null : this.getClassName().equals(other.getClassName()))
            && (this.getClassPosition() == null ? other.getClassPosition() == null : this.getClassPosition().equals(other.getClassPosition()))
            && (this.getOtherPosition() == null ? other.getOtherPosition() == null : this.getOtherPosition().equals(other.getOtherPosition()))
            && (this.getInstructorName() == null ? other.getInstructorName() == null : this.getInstructorName().equals(other.getInstructorName()))
            && (this.getInstructorNumber() == null ? other.getInstructorNumber() == null : this.getInstructorNumber().equals(other.getInstructorNumber()))
            && (this.getInstructorContactNumber() == null ? other.getInstructorContactNumber() == null : this.getInstructorContactNumber().equals(other.getInstructorContactNumber()))
            && (this.getUndergraduateMentorName() == null ? other.getUndergraduateMentorName() == null : this.getUndergraduateMentorName().equals(other.getUndergraduateMentorName()))
            && (this.getUndergraduateMentorNumber() == null ? other.getUndergraduateMentorNumber() == null : this.getUndergraduateMentorNumber().equals(other.getUndergraduateMentorNumber()))
            && (this.getStudentTeamLeaderName() == null ? other.getStudentTeamLeaderName() == null : this.getStudentTeamLeaderName().equals(other.getStudentTeamLeaderName()))
            && (this.getStudentTeamLeaderNumber() == null ? other.getStudentTeamLeaderNumber() == null : this.getStudentTeamLeaderNumber().equals(other.getStudentTeamLeaderNumber()))
            && (this.getClubCode() == null ? other.getClubCode() == null : this.getClubCode().equals(other.getClubCode()))
            && (this.getClubDepartment() == null ? other.getClubDepartment() == null : this.getClubDepartment().equals(other.getClubDepartment()))
            && (this.getClubPosition() == null ? other.getClubPosition() == null : this.getClubPosition().equals(other.getClubPosition()))
            && (this.getDormBuildingNumber() == null ? other.getDormBuildingNumber() == null : this.getDormBuildingNumber().equals(other.getDormBuildingNumber()))
            && (this.getDormCampus() == null ? other.getDormCampus() == null : this.getDormCampus().equals(other.getDormCampus()))
            && (this.getDormArea() == null ? other.getDormArea() == null : this.getDormArea().equals(other.getDormArea()))
            && (this.getDormRoomNumber() == null ? other.getDormRoomNumber() == null : this.getDormRoomNumber().equals(other.getDormRoomNumber()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStuName() == null) ? 0 : getStuName().hashCode());
        result = prime * result + ((getStuNumber() == null) ? 0 : getStuNumber().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getEthnicity() == null) ? 0 : getEthnicity().hashCode());
        result = prime * result + ((getIdCardNumber() == null) ? 0 : getIdCardNumber().hashCode());
        result = prime * result + ((getContactNumber() == null) ? 0 : getContactNumber().hashCode());
        result = prime * result + ((getPoliticalStatus() == null) ? 0 : getPoliticalStatus().hashCode());
        result = prime * result + ((getNativeProvince() == null) ? 0 : getNativeProvince().hashCode());
        result = prime * result + ((getNativeCity() == null) ? 0 : getNativeCity().hashCode());
        result = prime * result + ((getOriginProvince() == null) ? 0 : getOriginProvince().hashCode());
        result = prime * result + ((getOriginCity() == null) ? 0 : getOriginCity().hashCode());
        result = prime * result + ((getParentName() == null) ? 0 : getParentName().hashCode());
        result = prime * result + ((getParentContactNumber() == null) ? 0 : getParentContactNumber().hashCode());
        result = prime * result + ((getEducationLevel() == null) ? 0 : getEducationLevel().hashCode());
        result = prime * result + ((getEnrollmentYear() == null) ? 0 : getEnrollmentYear().hashCode());
        result = prime * result + ((getCollege() == null) ? 0 : getCollege().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        result = prime * result + ((getMajorCode() == null) ? 0 : getMajorCode().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((getClassName() == null) ? 0 : getClassName().hashCode());
        result = prime * result + ((getClassPosition() == null) ? 0 : getClassPosition().hashCode());
        result = prime * result + ((getOtherPosition() == null) ? 0 : getOtherPosition().hashCode());
        result = prime * result + ((getInstructorName() == null) ? 0 : getInstructorName().hashCode());
        result = prime * result + ((getInstructorNumber() == null) ? 0 : getInstructorNumber().hashCode());
        result = prime * result + ((getInstructorContactNumber() == null) ? 0 : getInstructorContactNumber().hashCode());
        result = prime * result + ((getUndergraduateMentorName() == null) ? 0 : getUndergraduateMentorName().hashCode());
        result = prime * result + ((getUndergraduateMentorNumber() == null) ? 0 : getUndergraduateMentorNumber().hashCode());
        result = prime * result + ((getStudentTeamLeaderName() == null) ? 0 : getStudentTeamLeaderName().hashCode());
        result = prime * result + ((getStudentTeamLeaderNumber() == null) ? 0 : getStudentTeamLeaderNumber().hashCode());
        result = prime * result + ((getClubCode() == null) ? 0 : getClubCode().hashCode());
        result = prime * result + ((getClubDepartment() == null) ? 0 : getClubDepartment().hashCode());
        result = prime * result + ((getClubPosition() == null) ? 0 : getClubPosition().hashCode());
        result = prime * result + ((getDormBuildingNumber() == null) ? 0 : getDormBuildingNumber().hashCode());
        result = prime * result + ((getDormCampus() == null) ? 0 : getDormCampus().hashCode());
        result = prime * result + ((getDormArea() == null) ? 0 : getDormArea().hashCode());
        result = prime * result + ((getDormRoomNumber() == null) ? 0 : getDormRoomNumber().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stuName=").append(stuName);
        sb.append(", stuNumber=").append(stuNumber);
        sb.append(", gender=").append(gender);
        sb.append(", ethnicity=").append(ethnicity);
        sb.append(", idCardNumber=").append(idCardNumber);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", politicalStatus=").append(politicalStatus);
        sb.append(", nativeProvince=").append(nativeProvince);
        sb.append(", nativeCity=").append(nativeCity);
        sb.append(", originProvince=").append(originProvince);
        sb.append(", originCity=").append(originCity);
        sb.append(", parentName=").append(parentName);
        sb.append(", parentContactNumber=").append(parentContactNumber);
        sb.append(", educationLevel=").append(educationLevel);
        sb.append(", enrollmentYear=").append(enrollmentYear);
        sb.append(", college=").append(college);
        sb.append(", major=").append(major);
        sb.append(", majorCode=").append(majorCode);
        sb.append(", classId=").append(classId);
        sb.append(", className=").append(className);
        sb.append(", classPosition=").append(classPosition);
        sb.append(", otherPosition=").append(otherPosition);
        sb.append(", instructorName=").append(instructorName);
        sb.append(", instructorNumber=").append(instructorNumber);
        sb.append(", instructorContactNumber=").append(instructorContactNumber);
        sb.append(", undergraduateMentorName=").append(undergraduateMentorName);
        sb.append(", undergraduateMentorNumber=").append(undergraduateMentorNumber);
        sb.append(", studentTeamLeaderName=").append(studentTeamLeaderName);
        sb.append(", studentTeamLeaderNumber=").append(studentTeamLeaderNumber);
        sb.append(", clubCode=").append(clubCode);
        sb.append(", clubDepartment=").append(clubDepartment);
        sb.append(", clubPosition=").append(clubPosition);
        sb.append(", dormBuildingNumber=").append(dormBuildingNumber);
        sb.append(", dormCampus=").append(dormCampus);
        sb.append(", dormArea=").append(dormArea);
        sb.append(", dormRoomNumber=").append(dormRoomNumber);
        sb.append(", grade=").append(grade);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.SpringBoot1.entity;
import lombok.*;
/**
 * @program:mainWorks
 * @description:活动教室的实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class activityclassroom {
    //活动教室申请表的ID
    private Integer id;
    //活动教室的申请进度
    private int speedOfProgress;
    //报告的等级，院级或校级
    private String grade;
    //申请人的姓名
    private String applicant;
    //申请人的电话
    private String applicantPhoneNumber;
    //申请单位
    private String units;
    //负责教师的姓名
    private String responsibleTeacher;
    //负责教师的电话
    private String responsibleTeacherPhoneNumber;
    //借用教室的理由
    private String reason;
    //报告人姓名
    private String nameOfReporter;
    //报告人单位
    private String reporterUnit;
    //报告人国籍
    private String nationalityOfReporter;
    //报告人的专业特长
    private String major;
    //报告人的职务
    private String post;
    //报告人的联系电话
    private String contactNumber;
    //报告的主题
    private String theme;
    //参加的人员，学生，老师
    private String Participants;
    //参与的人数
    private int NumberOfParticipants;
    //教室类型
    private String ClassroomType;
    //意向区域
    private String IntentionArea;
    //选的周
    private int week;
    //选的星期
    private int day;
    //第几大节
    private int time;
    //选择的教室
    private String SelectedClassroom;
    //备注
    private String remarks;
    //使用单位意见
    private String CommentsOfUser;
    //宣传部门意见
    private String CommentsOfPublicityDepartment;
    //教务处意见
    private String CommentsOfAcademicAffairsOffice;
    //网信中心意见
    private String CommentsOfWechatCenter;

}

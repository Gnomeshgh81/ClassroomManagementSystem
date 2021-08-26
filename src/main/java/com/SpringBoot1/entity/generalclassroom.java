package com.SpringBoot1.entity;
import lombok.*;

/**
 * @program:mainWorks
 * @description:一般活动申请的实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class generalclassroom {
    private int id;
    //进度
    private int speedOfProgress;
    //等级，校级或者院级
    private String grade;
    //申请人的姓名
    private String applicant;
    //申请人的电话号
    private String applicantPhoneNumber;
    //申请单位
    private String units;
    //负责教师
    private String responsibleTeacher;
    //负责教师电话
    private String responsibleTeacherPhoneNumber;
    //原因
    private String reason;
    //参与的人员
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
    //教务处意见
    private String CommentsOfAcademicAffairsOffice;
    //网信中心意见
    private String CommentsOfWechatCenter;

}
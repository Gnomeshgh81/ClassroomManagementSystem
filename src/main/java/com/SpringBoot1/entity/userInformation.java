package com.SpringBoot1.entity;

import lombok.*;

/**
 * @program:mainWorks
 * @description:用户具体信息
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class userInformation {
    //用户的登录名，一般为学号或工号
    private String userId;
    //用户的姓名，并非登录名，这里是真实姓名
    private String userName;
    //用户的权限，分为admin(网信中心)，office（教务处），PD(宣传部)，
    // collage(学院领导，使用单位)，teacher（老师），student（学生），
    // 中间使用,隔开
    private String roles;
    //用户的部门，校级写部门，比如网信中心就是网信中心，教务处就是教务处，学院领导及以下使用学院名称
    private String depart;
    //用户的头像，是一个地址
    private String avatar;
    //用户的手机号
    private String phoneNum;

}

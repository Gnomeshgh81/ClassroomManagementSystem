package com.SpringBoot1.entity;

import lombok.*;

/**
 * @program:mainWorks
 * @description:user表
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class user {
    private String userId;
    private String passWord;
}

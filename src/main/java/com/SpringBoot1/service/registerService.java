package com.SpringBoot1.service;

import com.SpringBoot1.mapper.registerMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @program:mainWorks
 * @description:注册Service
 */
@Service
@Slf4j
public class registerService {

    @Autowired
    registerMapper registerMapper;

    public Map<String, Object> register(String userId,String userName,String roles, String passWord,
                                        String phoneNum, String depart, String avatar) {
        Map<String,Object> re = new HashMap<>();
        try {
            log.info("time是：[{}]",Calendar.getInstance().getTime());
            Map<String,Object> map = new HashMap<>();
            map.put("userId",userId);
            map.put("date",Calendar.getInstance().getTime());

            registerMapper.insertIntoRegister(map);
            registerMapper.insertIntoUser(userId,passWord);
            registerMapper.insertIntoUserInformation(userId,userName,roles,phoneNum,depart,avatar);
        }catch (Exception e){
            log.info("注册出现异常，异常情况为：[{}]",e);
            re.put("state",false);
            re.put("msg","注册失败~~");
            return re;
        }
        re.put("state",true);
        re.put("msg","注册成功！！");
        return re;
    }

}

package com.SpringBoot1.service;
import com.SpringBoot1.entity.user;
import com.SpringBoot1.mapper.UserMapper;
import com.SpringBoot1.until.JWTUntil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class userService {
    @Autowired
    UserMapper userMapper;


    public Map<String,Object> login(String userId, String passWord){
        Map<String,Object> re = new HashMap<>();
        log.info("userId=[{}],passWord=[{}]",userId,passWord);
        try {
            user login = userMapper.login(userId, passWord);
            log.info("login=[{}]",login);
            if (login != null) {
                Map<String, String> map = new HashMap<>();
                //将学号放入token中
                map.put("userId", login.getUserId() + "");
                String token = JWTUntil.getToken(map);
                re.put("token", token);
                re.put("state", true);
                re.put("msg", "登录成功");
            } else{
                re.put("state",false);
                re.put("msg","账号或密码错误！！");
            }
        } catch (Exception e) {
            log.info(e.toString());
            re.put("state",false);
            re.put("msg","账号或密码错误！！");
        }
        return re;
    }
}

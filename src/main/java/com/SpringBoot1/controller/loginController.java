package com.SpringBoot1.controller;
import com.SpringBoot1.entity.user;
import com.SpringBoot1.service.userService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
/**
 * @program:mainWorks
 * @description:测试的Controller
 */
@RestController
@Slf4j
public class loginController {
    @Autowired
    userService userService;

    @PostMapping("/login")
    public Map<String,Object> login(user user) {
        log.info("userId={[]},passWord={[]}",user.getUserId(),user.getPassWord());
        return userService.login(user.getUserId(), user.getPassWord());
    }

}

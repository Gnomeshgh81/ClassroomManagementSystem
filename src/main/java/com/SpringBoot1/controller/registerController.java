package com.SpringBoot1.controller;
import com.SpringBoot1.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
/**
 * @program:mainWorks
 * @description:用户注册的Controller
 */
@RestController
public class registerController {

    @Autowired
    registerService registerService;

    @PostMapping("/register")
    public Map<String,Object> register(String userId,String passWord,
                                       String phoneNum,String depart,String avatar){
        return registerService.register(userId,passWord,phoneNum,depart,avatar);
    }
}

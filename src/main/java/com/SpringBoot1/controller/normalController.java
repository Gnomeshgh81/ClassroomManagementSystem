package com.SpringBoot1.controller;
import com.SpringBoot1.entity.userInformation;
import com.SpringBoot1.service.normalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program:mainWorks
 * @description:暂时还没想到该放到哪里的控制器
 */
@RestController
public class normalController {

    @Autowired
    normalService normalService;

    @ResponseBody
    @GetMapping("/getInfo/token")
    public userInformation getInfo(String token,HttpServletResponse response) {
        return normalService.getInfo(token,response);
    }

    @GetMapping("getInfo")
    public userInformation getInfo2(HttpServletRequest request, HttpServletResponse response){
        return normalService.getInfo(request,response);
    }


}

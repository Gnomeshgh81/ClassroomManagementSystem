package com.SpringBoot1.controller;

import com.SpringBoot1.entity.generalclassroom;
import com.SpringBoot1.service.generalActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program:mainWorks
 * @description:一般活动教室申请
 */
@RestController
@RequestMapping("/General/activities")
public class generalActivitiesController {
    @Autowired
    generalActivitiesService generalActivitiesService;

    @RequestMapping("/school")
    public Map<String, Object> f(generalclassroom generalclassroom) {
        generalclassroom.setGrade("校级");
        generalclassroom.setSpeedOfProgress(1);
        return generalActivitiesService.f(generalclassroom);
    }

    @RequestMapping("/faculty")
    public Map<String, Object> f2(generalclassroom generalclassroom) {
        generalclassroom.setGrade("院级");
        generalclassroom.setSpeedOfProgress(1);
        return generalActivitiesService.f(generalclassroom);
    }

}

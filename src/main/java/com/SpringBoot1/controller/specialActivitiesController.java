package com.SpringBoot1.controller;
import com.SpringBoot1.entity.activityclassroom;
import com.SpringBoot1.service.specialActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

/**
 * @program:mainWorks
 * @description:活动教室申请的Controller
 */

@RestController
@RequestMapping("/Special/activities")
public class specialActivitiesController {
    @Autowired
    specialActivitiesService specialActivitiesService;
    @PostMapping("/school")
    public Map<String, Object> submit(activityclassroom activityclassroom) {
        activityclassroom.setGrade("校级");
        activityclassroom.setSpeedOfProgress(1);
        return specialActivitiesService.insertIntoSpecialActivityClassroom(activityclassroom);
    }
    @PostMapping("/faculty")
    public Map<String, Object> submit2(activityclassroom activityclassroom) {
        activityclassroom.setGrade("院级");
        activityclassroom.setSpeedOfProgress(1);
        return specialActivitiesService.insertIntoSpecialActivityClassroom(activityclassroom);
    }
}

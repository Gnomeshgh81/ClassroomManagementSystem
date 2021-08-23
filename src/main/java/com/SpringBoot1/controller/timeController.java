package com.SpringBoot1.controller;
import com.SpringBoot1.until.timeUntil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:mainWorks
 * @description:关于时间的控制器
 */
@RestController
@Slf4j
@RequestMapping("/time")
public class timeController {

    @GetMapping("/getWeek")
    public int getWeek() {
        return timeUntil.getWeek();
    }
    @GetMapping("/getDay")
    public int getDay() {
        return timeUntil.getDay();
    }

}

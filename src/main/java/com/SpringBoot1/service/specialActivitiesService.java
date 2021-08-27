package com.SpringBoot1.service;
import com.SpringBoot1.entity.activityclassroom;
import com.SpringBoot1.mapper.specialActivitiesMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
/**
 * @program:mainWorks
 * @description:活动教室申请的的服务层
 */
@Service
@Slf4j
public class specialActivitiesService {
    @Autowired
    specialActivitiesMapper specialActivitiesMapper;
    public Map<String, Object> insertIntoSpecialActivityClassroom(activityclassroom activityclassroom) {
        Map<String,Object> re = new HashMap<>();
        try {
            specialActivitiesMapper.insertIntoActivityClassroom(activityclassroom);
            re.put("msg", "提交成功");
            re.put("state",true);
        } catch (Exception e) {
            e.printStackTrace();
            re.put("msg", "提交失败");
            re.put("state",false);
            log.info("在specialActivitiesService中报出了异常：{[]}",e);
        }
        return re;
    }
}

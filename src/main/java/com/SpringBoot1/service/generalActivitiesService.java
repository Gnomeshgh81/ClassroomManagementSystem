package com.SpringBoot1.service;
import com.SpringBoot1.entity.generalclassroom;
import com.SpringBoot1.mapper.generalActivitiesMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @program:mainWorks
 * @description:一般教室申请的服务
 */
@Service
@Slf4j
public class generalActivitiesService {

    @Autowired
    generalActivitiesMapper generalActivitiesMapper;

    public Map<String, Object> f(generalclassroom generalclassroom) {
        Map<String,Object> re = new HashMap<>();
        try {
            generalActivitiesMapper.insertIntoGeneralActivities(generalclassroom);
            re.put("msg","提交成功！");
            re.put("stage",true);
        } catch (Exception e) {
            re.put("msg","提交失败！！");
            re.put("stage",false);
            log.info("在generalActivitiesService中出现了异常{[]}", e);
            e.printStackTrace();
        }
        return re;
    }


}

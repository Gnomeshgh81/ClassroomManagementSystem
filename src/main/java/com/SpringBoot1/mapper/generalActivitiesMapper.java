package com.SpringBoot1.mapper;

import com.SpringBoot1.entity.generalclassroom;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program:mainWorks
 * @description:一般教室申请的路由
 */

@Mapper
public interface generalActivitiesMapper {

    void insertIntoGeneralActivities(generalclassroom generalclassroom);

}

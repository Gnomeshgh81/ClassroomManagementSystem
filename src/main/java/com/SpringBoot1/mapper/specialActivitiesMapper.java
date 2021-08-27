package com.SpringBoot1.mapper;

import com.SpringBoot1.entity.activityclassroom;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface specialActivitiesMapper {
    void insertIntoActivityClassroom(activityclassroom activityclassroom);
}

package com.SpringBoot1.mapper;

import com.SpringBoot1.entity.userInformation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface normalMapper {
    userInformation getInfo(String userId);
}

package com.SpringBoot1.mapper;
import com.SpringBoot1.entity.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    user login(String userId,String passWord);

}

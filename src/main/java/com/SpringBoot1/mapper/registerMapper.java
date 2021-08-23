package com.SpringBoot1.mapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.Map;

@Mapper
public interface registerMapper {

    void insertIntoRegister(Map<String,Object> map);

    void insertIntoUser(String userId,String passWord);

    void insertIntoUserInformation(String userId,String phoneNum,String depart,String avatar);

}

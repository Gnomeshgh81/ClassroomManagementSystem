package com.SpringBoot1.service;
import com.SpringBoot1.entity.userInformation;
import com.SpringBoot1.mapper.normalMapper;
import com.SpringBoot1.until.JWTUntil;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * @program:mainWorks
 * @description:不知道该放到哪里的Service
 */
@Service
@Slf4j
public class normalService {

    @Autowired
    normalMapper normalMapper;

    public userInformation getInfo(String token, HttpServletResponse response) {
        try {
            DecodedJWT verify = JWTUntil.verify(token);
            Claim id = verify.getClaim("userId");
            String integer = id.asString();
            log.info("获得的id=[{}]", integer);
            return normalMapper.getInfo(integer);
        } catch (NullPointerException e) {

            Map<String,Object> map = new HashMap<>();
            map.put("state",false);
            map.put("msg","请在请求路径或请求头中携带token参数");
            try {
                String s = new ObjectMapper().writeValueAsString(map);
                response.setContentType("application/json;charset=UTF-8");
                response.getWriter().print(s);
            } catch (JsonProcessingException jsonProcessingException) {
                jsonProcessingException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public userInformation getInfo(HttpServletRequest request,HttpServletResponse response){
        String token = request.getHeader("token");
        log.info("token=[{}]",token);
        return getInfo(token,response);
    }

}

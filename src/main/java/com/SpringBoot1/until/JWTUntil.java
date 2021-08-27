package com.SpringBoot1.until;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;
import java.util.Map;

/**
 * @program:mainWorks
 * @description:JWT的工具类
 */

@Slf4j
public class JWTUntil {
    private static final String SING = "@#%!$@!2@2#3@3@$$%^&7#$@#^$";
    /**
     * 生成token
     * @param map 传入需要传递给前端的内容
     * @return 返回生成的token
     */
    public static String getToken(Map<String,String> map){
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, 7);

        //创建JWT builder
        JWTCreator.Builder builder = JWT.create();

        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });
        String token = builder.withExpiresAt(instance.getTime())//指定令牌过期时间
                .sign(Algorithm.HMAC256(SING));                 //放入盐
        return token;
    }

    /**
     * 验证token
     * @param token 传入的token
     * @return 返回传入的数值
     */
    public static DecodedJWT verify(String token) throws Exception {
        if(token==null){
            throw new NullPointerException();
        }
        return JWT.require(Algorithm.HMAC256(SING)).build().verify(token);
    }

}
package com.SpringBoot1.interceptor;
import com.SpringBoot1.entity.userInformation;
import com.SpringBoot1.service.normalService;
import com.SpringBoot1.until.JWTUntil;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @program:mainWorks
 * @description:学生及以下权限的用户无法访问
 */
@Slf4j
public class studentInterceptor implements HandlerInterceptor {
    @Autowired
    normalService normalService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Map<String,Object> map = new HashMap<>();
        String token = request.getHeader("token");
        try {
            DecodedJWT verify = JWTUntil.verify(token);
            Claim userId = verify.getClaim("userId");
            String s = userId.asString();
            log.info("获得的id=[{}]", s);
            userInformation info = normalService.getInfo(request, response);
            if(!info.getRoles().equals("student")){
                map.put("msg","使用成功！");
                map.put("state",true);
                return true;
            }else{
                map.put("msg","不好意思，您的权限不够");
                map.put("state",false);
            }
        }catch (SignatureVerificationException e) {
            e.printStackTrace();
            map.put("msg", "无效签名！");
        } catch (TokenExpiredException e) {
            e.printStackTrace();
            map.put("msg", "token过期");
        } catch (AlgorithmMismatchException e) {
            e.printStackTrace();
            map.put("msg", "token算法不一致");
        } catch (NullPointerException e) {
            e.printStackTrace();
            map.put("msg","请在请求头携带token");
        }
        String json = new ObjectMapper().writeValueAsString(map);
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().print(json);
        return false;
    }
}

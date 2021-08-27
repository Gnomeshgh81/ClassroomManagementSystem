package com.SpringBoot1.config;

import com.SpringBoot1.interceptor.studentInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program:mainWorks
 * @description:配置权限低于student的访问拦截
 */

@Configuration
public class studentConfig implements WebMvcConfigurer {
    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new studentInterceptor());
                //除了登录的路径放行以外，其他路径都要拦截
//                .addPathPatterns("/**")
//                .excludePathPatterns("/login/**")
//                .excludePathPatterns("/register/**")
//                .excludePathPatterns("/time/**");
        //这里先不拦截任何路径
    }
}

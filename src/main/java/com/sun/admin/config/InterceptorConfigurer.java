package com.sun.admin.config;

import com.sun.admin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InterceptorConfigurer implements WebMvcConfigurer {

    //重写方法，注册拦截器（InterceptorRegistry）
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //创建拦截器类
        HandlerInterceptor interceptor=new LoginInterceptor();

        List<String> patterns=new ArrayList<>();
        patterns.add("/css/**");
        patterns.add("/images/**");
        patterns.add("/js/**");
        patterns.add("/fonts/**");
        patterns.add("/");
        patterns.add("/login");


        //注册拦截器类，添加黑名单(addPathPatterns("/**")),‘/*’只拦截一个层级，'/**'拦截全部
        // 和白名单(excludePathPatterns("List类型参数"))，将不必拦截的路径添加到List列表中
        registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns(patterns);
    }
}

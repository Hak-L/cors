package com.sgl.corstwo.controller.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description:
 * 写一个配置类实现spring mvc的WebMvcConfigurer 重写 addCorsMappings方法
 * 然后将配置类用注解 @Configuration 注入spring 容器
 * @Author: sgl
 * @Date: 2021/1/12 0012 下午 14:01
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowedOrigins("http://localhost:8024")
                .maxAge(180);
    }

}

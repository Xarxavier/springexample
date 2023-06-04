package com.xaserrano.spring.ejercicio1;

import com.xaserrano.spring.ejercicio1.Interceptors.InterceptorTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigure implements WebMvcConfigurer {
    @Autowired
    @Qualifier("InterceptorTest")
    private HandlerInterceptor interceptorTest;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptorTest);//.addPathPatterns(); para agregar X rutas
    }
}

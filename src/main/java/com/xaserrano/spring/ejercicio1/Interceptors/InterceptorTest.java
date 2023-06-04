package com.xaserrano.spring.ejercicio1.Interceptors;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//@Scope(scopeName = "InterceptorTest",value="request")
@Component("InterceptorTest")
public class InterceptorTest implements HandlerInterceptor {
    private static final Logger _logger = LoggerFactory.getLogger(InterceptorTest.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
        _logger.info("esto es un test de log pre");
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws  Exception{
        _logger.info("esto es un test de log post");
    }
}

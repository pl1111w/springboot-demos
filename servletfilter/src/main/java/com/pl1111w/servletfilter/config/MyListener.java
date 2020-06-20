package com.pl1111w.servletfilter.config;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyListener {
    @Bean
    public ServletListenerRegistrationBean Listener(){
        ServletListenerRegistrationBean<MyListenerConfig> registrationBean = new ServletListenerRegistrationBean<>(new MyListenerConfig());
        return registrationBean;
    }
}

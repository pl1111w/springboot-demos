package com.pl1111w.servletfilter.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;
@Configuration
//@WebFilter(urlPatterns = {"/api"},filterName = "FilterConfig")
public class MyFilter {

    @Bean(name = "FilterConfig")
    public Filter commonDataFilter() {
        return new FilterConfig();
    }


    //嵌入式servlet容器配置 也可以通过properties配置文件配置
    @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>(){

            @Override
            public void customize(ConfigurableServletWebServerFactory factory) {
                factory.setPort(8090);
            }
        };
    }
    /**
     * 不使用@WebFilter注解
     * 通过配置FilterRegistrationBean实现拦截
     */

    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(commonDataFilter());
        registration.addUrlPatterns("/traditional/*");
        registration.setName("commonDataFilter");
        registration.setOrder(1);
        return registration;
    }

}

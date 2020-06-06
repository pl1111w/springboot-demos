package com.pl1111w.servletfilter.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "api/*")
@Configuration
public class FilterConfig {

    @Bean(name = "FilterExtend")
    public Filter commonDataFilter() {
        return new FilterExtend();
    }

    /**
     * 不使用@WebFilter注解
     * 通过配置FilterRegistrationBean实现拦截
     *

    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(commonDataFilter());
        registration.addUrlPatterns("/traditional/*");
        registration.setName("commonDataFilter");
        registration.setOrder(1);
        return registration;
    }

     *
     *
     * */

}

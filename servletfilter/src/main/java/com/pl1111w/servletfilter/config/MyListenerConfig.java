package com.pl1111w.servletfilter.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListenerConfig implements ServletContextListener {

    @Override
    public  void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器开始.....");
    }

    public  void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听器结束.....");
    }
}

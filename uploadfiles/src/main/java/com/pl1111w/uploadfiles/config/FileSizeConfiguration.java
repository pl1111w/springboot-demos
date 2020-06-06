package com.pl1111w.uploadfiles.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

@Configuration
public class FileSizeConfiguration {

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //一次请求所有文件大小限制
        factory.setMaxRequestSize(DataSize.ofKilobytes(2024));
        //单个文件大小限制
        factory.setMaxFileSize(DataSize.ofKilobytes(1024));
        return factory.createMultipartConfig();

    }
}


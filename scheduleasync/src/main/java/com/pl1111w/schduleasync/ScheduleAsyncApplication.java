package com.pl1111w.schduleasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class ScheduleAsyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleAsyncApplication.class, args);
    }

}

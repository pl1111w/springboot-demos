package com.pl1111w.schduleasync.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleTask {

    @Scheduled(fixedRate = 2000L)
    public void taskSchedule(){
        System.out.println(new Date());
    }
}

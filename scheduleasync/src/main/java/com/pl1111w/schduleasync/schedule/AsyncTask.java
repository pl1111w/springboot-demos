package com.pl1111w.schduleasync.schedule;

import com.pl1111w.schduleasync.entity.Result;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;


@Component
@Async
public class AsyncTask {

    public void task1() throws InterruptedException {
        Long begin = System.currentTimeMillis();
        Thread.sleep(1000);
        Long end = System.currentTimeMillis();
        System.out.println("task1:" + (end - begin));
    }

    public void task2() throws InterruptedException {
        Long begin = System.currentTimeMillis();
        Thread.sleep(2000);
        Long end = System.currentTimeMillis();
        System.out.println("task2:" + (end - begin));
    }

    public void task3() throws InterruptedException {
        Long begin = System.currentTimeMillis();
        Thread.sleep(3000);
        Long end = System.currentTimeMillis();
        System.out.println("task3:" + (end - begin));
    }

    public Future<Result> task4() throws InterruptedException {
        Long begin = System.currentTimeMillis();
        Thread.sleep(3000);
        Long end = System.currentTimeMillis();
        System.out.println("task4:" + (end - begin));
        Result result = new Result();
        result.setCode("200");
        result.setMessage("task4");
        return  new AsyncResult<>(result);
    }

    public Future<Result> task5() throws InterruptedException {
        Long begin = System.currentTimeMillis();
        Thread.sleep(2000);
        Long end = System.currentTimeMillis();
        System.out.println("task5:" + (end - begin));
        Result result = new Result();
        result.setCode("200");
        result.setMessage("task5");
        return  new AsyncResult<>(result);
    }
}

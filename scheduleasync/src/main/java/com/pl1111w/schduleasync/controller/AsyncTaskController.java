package com.pl1111w.schduleasync.controller;

import com.pl1111w.schduleasync.entity.Result;
import com.pl1111w.schduleasync.schedule.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
public class AsyncTaskController {

    @Autowired
    private AsyncTask asyncTask;

    @GetMapping("/async-task")
    public String asyncTask() {
        try {
            long start = System.currentTimeMillis();
            asyncTask.task1();
            asyncTask.task2();
            asyncTask.task3();
            long end = System.currentTimeMillis();
            long result = end - start;
            System.out.println("总用时：" + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "async";
    }

    @GetMapping("/async-result")
    public Result asyncTaskResult() {
        Result result = new Result();
        try {
            long start = System.currentTimeMillis();
            Future<Result> task4 = asyncTask.task4();
            try {
                result = task4.get();
                System.out.println(result.toString());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            asyncTask.task5();
            long end = System.currentTimeMillis();
            long totalTime = end - start;
            System.out.println("总用时：" + totalTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }

}

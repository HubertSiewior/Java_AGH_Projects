package com.company;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class HelloFuture implements Callable<String> {
    private int task_no;
    public HelloFuture(Integer Task_no) {
        this.task_no = Task_no;
    }

    public String call() throws Exception {
        return("Hello from task "+task_no+"(thread: " +Thread.currentThread().getName()+")");
    }
}

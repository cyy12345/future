package com.threadpoolexecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Submit3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        Runnable runnable = new Runnable(){
            public void run(){
                System.out.println("svbebcewuivb");
            }
        };
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future future =executor.submit(runnable);
        System.out.println(future.get());
    }
}

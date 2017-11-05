package com.threadpoolexecutor;

import java.util.concurrent.*;

/**
 * ThreadPoolExecutor#sumit(Callable<T> task)
 * Created by yulinfeng on 6/17/17.
 */
public class Submit1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new Callable<String>() {
            public String call() throws Exception {
                System.out.println("This is ThreadPoolExetor#submit(Callable<T> task) method.");
                return "result";
            }
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(callable);
        System.out.println(future.get());
    }
}
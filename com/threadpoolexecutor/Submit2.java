package com.threadpoolexecutor;



import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Submit2 {
    public static void main(String[] args) throws ExecutionException,InterruptedException{
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Data data = new Data();
        Future<Data> future = executor.submit(new Task(data),data);
        System.out.println(future.get().name);

    }
}

class Data{
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String name;

}

class Task implements Runnable{
    Data data;
    public Task(Data data){
        this.data=data;
    }
    public void run(){
        System.out.println("这是一个Threadpoolexecutorsubmit方法");
        data.setName("cyy");
    }
}

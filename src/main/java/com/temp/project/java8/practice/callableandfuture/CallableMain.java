package com.temp.project.java8.practice.callableandfuture;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] tasks = new FutureTask[5];
        for(int i=0;i<5;i++){
            Random generator = new Random();
            Integer randomNumber = generator.nextInt(5);
            Callable callable = new CallableImpl(randomNumber);
            tasks[i] = new FutureTask(callable);
            Thread t = new Thread(tasks[i]);
            t.start();
        }
        for(int i=0;i<5;i++){
            System.out.println(tasks[i].get());
        }
    }
}

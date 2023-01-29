package com.temp.project.java8.practice.callableandfuture;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableImpl implements Callable {

    private int sleepTime;

    public CallableImpl(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public Object call() throws Exception {
        Thread.sleep(sleepTime * 1000);
        return sleepTime;
    }
}

package com.pancm.messageHandler;

import java.util.UUID;
import java.util.concurrent.Callable;

public class HandlerThread implements Callable<String> {

    private String threadName;
    public HandlerThread(String name)
    {
        threadName = name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(Math.round(20));
        String result = UUID.randomUUID().toString();
//        System.out.println(this.threadName+":"+result);
        return result;
    }
}

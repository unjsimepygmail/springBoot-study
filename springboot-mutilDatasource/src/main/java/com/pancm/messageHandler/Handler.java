package com.pancm.messageHandler;

import antlr.StringUtils;
import com.pancm.utils.ThreadPoolUtils;
import sun.misc.ThreadGroupUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Handler {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = ThreadPoolUtils.getThreadPool();
        List<Future<String>> futureList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            HandlerThread handlerThread = new HandlerThread(String.valueOf(i));
            futureList.add(threadPool.submit(handlerThread));
        }

        while (true)
        {
            for (Future<String> future:futureList) {
                if(future.isDone()){
                    System.out.println(future.get().toString());
                }
            }
        }


    }
}

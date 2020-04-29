package com.pancm.utils;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUtils {

    private static ExecutorService threadPool;

    public static ExecutorService getThreadPool() {
        if (Objects.isNull(threadPool)) {
            return Executors.newFixedThreadPool(2);
        }
        return threadPool;
    }
}

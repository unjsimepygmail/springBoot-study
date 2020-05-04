package com.pancm.messageHandler;

import antlr.StringUtils;
import com.pancm.pojo.Student;
import com.pancm.utils.ThreadPoolUtils;
import sun.misc.ThreadGroupUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Handler {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = ThreadPoolUtils.getThreadPool();

        Object object = new Object();
       /* List<Future<String>> futureList = new ArrayList<>();

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
        }*/


        Student student = new Student();
        student.setName("zhang");
        student.setId(30123l);
        Student student2 = new Student();
        student2.setId(30123l);
        student.setName("wang");


        System.out.println(student.equals(student2));
        System.out.println(student.getClass());
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());


        Map map1 = new HashMap();
        map1.put("1",2);
        map1.put("1",3);
        map1.get("1");




    }
}

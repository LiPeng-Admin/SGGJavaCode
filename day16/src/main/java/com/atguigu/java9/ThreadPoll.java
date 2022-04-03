package com.atguigu.java9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ThreadPoll.java
 * @Description 创建线程的方式四：线程池
 * @createTime 2022年04月03日 16:32:00
 */
/*
*
* 创建线程的方式四：线程池
* 1：提供指定线程数量的线程池
* 2：执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
  3：关闭连接池
* 优势：
*   提高响应速度（减少了创建新线程的时间）
    降低资源消耗（重复利用线程池中线程，不需要每次都创建）
    便于线程管理
    corePoolSize：核心池的大小
    maximumPoolSize：最大线程数
    keepAliveTime：线程没任务时最多保持多长时间后会终止
*
*面试题：创建多线程有哪几种方式？
* 四种
*
*
* */
public class ThreadPoll {
    public static void main(String[] args) {
        //1:提供指定数量的线程池
        ExecutorService service= Executors.newFixedThreadPool(10);
//        System.out.println(service.getClass());
//        ThreadPoolExecutor tp=(ThreadPoolExecutor) service;

        //设置线程池的属性
//        tp.setCorePoolSize(15);
//        tp.setKeepAliveTime();
//2:执行指定线程的操作：需要提供实现Runnable 接口或Callable 接口的实现类的对象
//        service.submit(); //适合使用Callable
        service.execute(new NumberThread()); //适合使用Runnable
        service.execute(new NumberThread1());
        //3：关闭链接池
        service.shutdown();
    }
}
class NumberThread implements Runnable{

    @Override
    public void run() {
        //打印100以内的偶数
        for (int i = 0; i <=100; i++) {
            if(i%2==0)
            {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class NumberThread1 implements Runnable{


    @Override
    public void run() {
        //打印100以内的奇数
        for (int i = 0; i <=100 ; i++) {
            if(i %2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }


        }

    }
}

package com.atguigu.java;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ThreadMethodTest.java
 * @Description TODO
 * @createTime 2022年03月29日 20:30:00
 */
/*
*测试Thread 类的常用方法
* 1：start():启动当前线程；调用当前线程的run()方法
* 2：run()：通常需要重写Thread类中的此方法，将要创建的线程要执行的操作声明在此方法中
* 3：currentThread():静态方法，返回执行当前代码的线程
* 4：getName():获取当前线程的名字
* 5：setName():设置当前线程的名字
* 6:yield()释放当前cpu 的执行权
* 7:join()：在线程A中调用线程B的join(),此时线程A就进入阻塞状态，直到线程B 完全执行完成后，线程A结束阻塞状态
* 8：stop():已过时，当执行此方法时，强制结束当前线程
* 9：sleep():让当前线程睡眠指定的millitime 毫秒，在指定的millitime 毫秒时间内，当前线程阻塞状态
* 10：isAlive():判断当前是否还存活
*
* 线程的优先级：
* 1:
*   MAX_PRIORITY = 10
*   NORM_PRIORITY = 5 -->默认优先级
*   MIN_PRIORITY = 1
* 2:如何获取和设置当前线程的优先级
*   getPriority()
*   setPriority()
*
* 说明：高优先级的线程要抢占低优先级线程cpu的执行权，但是只是从概率上讲，高优先级的线程高概率的情况下被执行
*       并不意味着只有当高优先级的线程执行完成后，低优先级的线程才执行
*
*
* */
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread helloThread=new HelloThread();
        helloThread.setName("线程一");
        //设置分线程的优先级
        helloThread.setPriority(Thread.MAX_PRIORITY);
        helloThread.start();
        //主线程命名：
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
            }
//            if(i==20){
//                try {
//                    helloThread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

        }
        System.out.println(helloThread.isAlive());

    }
}
class  HelloThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
        if(i%2==0){
//            try {
//                sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
            }
//        if(i%20==0){
//            yield();
//        }
         }
    }
}

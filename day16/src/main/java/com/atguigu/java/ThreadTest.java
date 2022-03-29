package com.atguigu.java;

/**
 *
 * @author admin
 * @version 1.0.0
 * @ClassName ThreadTest.java
 * @Description TODO
 * @createTime 2022年03月28日 22:58:00
 */

/*
* 多线程的创建：
* 方式一：继承于Thread类
*           ①创建一个继承于Thread 类的子类
*           ②重写Thread 类的run ()方法 -->将此线程执行的操作声明在run()
*           ③创建Thread类的子类对象
*           ④通过此对象调用start()方法
*
注意点： //问题1：不能通过调用run()方法的形式启动线程
//        myThread.run();
        //问题2：再启动线程，遍历100以内的偶数：不可以还让已经start()的线程去执行，
        // 会报异常：IllegalThreadStateException
        //需要重新创建一个线程对象
* */
    //案例：常见100以内的偶数

    //1：创建一个继承于Thread 类的子类
    class MyThread extends Thread{

    //2：重写Thread 类的run ()方法：①启动当前线程②调用当前线程的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }

        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //3：创建Thread类的子类对象
        MyThread myThread=new MyThread();
        MyThread myThread1=new MyThread();
        //4：通过此对象调用start()方法
        myThread.start();
        System.out.println("*************");
        //问题1：不能通过调用run()方法的形式启动线程
//        myThread.run();
        //问题2：再启动线程，遍历100以内的偶数：不可以还让已经start()的线程去执行，
        // 会报异常：IllegalThreadStateException
        //需要重新创建一个线程对象
        myThread1.start();
        for (int i = 0; i <100 ; i++) {
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }

        }

    }
}

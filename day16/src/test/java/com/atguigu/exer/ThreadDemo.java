package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ThreadDemo.java
 * @Description TODO
 * @createTime 2022年03月29日 20:10:00
 */
//练习：创建两个分线程：其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread1 myThread1=new MyThread1();
//        myThread1.start();
//        MyThread2 myThread2=new MyThread2();
//        myThread2.start();

 //创建Thread类的匿名子类的方式
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }

                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int j = 0; j< 100; j++) {
                    if(j%2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+j);
                    }

                }
            }
        }.start();
    }
}
class MyThread1 extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            if(i%2==0){
//                System.out.println(Thread.currentThread().getName()+":"+i);
//            }
//
//        }
//    }
}
class MyThread2 extends Thread{
//    @Override
//    public void run() {
//        for (int j = 0; j< 100; j++) {
//            if(j%2!=0){
//                System.out.println(Thread.currentThread().getName()+":"+j);
//            }
//
//        }
//    }
}

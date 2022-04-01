package com.atguigu.java3;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName WindowTest1.java
 * @Description TODO
 * @createTime 2022年03月31日 00:10:00
 */
/*
* 使用同步代码块解决继承Thread 类的方式的线程安全问题
* 例子：创建三个窗口卖票，总票数为100张，使用继承Thread 类的方式
* 说明：在继承Thread 类创建多线程的方式中，慎重this 充当同步监视器，考虑使用当前类充当同步监视器
*
* */
public class WindowTest1 {

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        MyThread myThread2=new MyThread();
        MyThread myThread3=new MyThread();

        myThread.start();
        myThread2.start();
        myThread3.start();

    }
}
class MyThread extends Thread{

    private static int ticket=100;
     static Object o=new Object();
    @Override
    public void run() {
        while (true){
            //正确的
            synchronized (o) {
                //不正确的
//                synchronized (this) { //此时的this 不唯一，创建了三个MyThread实例对象
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}

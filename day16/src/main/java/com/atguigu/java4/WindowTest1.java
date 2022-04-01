package com.atguigu.java4;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName WindowTest1.java
 * @Description TODO
 * @createTime 2022年03月31日 20:02:00
 */
//使用同步方法处理继承Thread 类的方式中的线程安全问题
public class WindowTest1 {
    public static void main(String[] args) {
        Window2 w2=new Window2();
        Window2 w3=new Window2();
        Window2 w4=new Window2();

        w2.start();
        w3.start();
        w4.start();


    }
}
class Window2 extends  Thread{

    private static int ticket=100;
    @Override
    public void run() {
        while (true) {
            show();
        }
    }
    private static synchronized void show(){ //同步监视器：Window2.class
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+":"+ticket);
                ticket--;
            }
        }
    }




package com.atguigu.java4;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName WindowTest.java
 * @Description TODO
 * @createTime 2022年03月31日 19:26:00
 */
/*使用 同步方法 解决实现Runnable接口的线程安全问题
*关于同步方法的总结：
* 1：同步方法仍然涉及到同步监视器，只是不需要我们显示的声明
* 2：非静态的同步方法，同步监视器：this
*    静态的同步方法，同步监视器：当前类的本身
 */



public class WindowTest {
    public static void main(String[] args) {
        Window w=new Window();
        Thread t1=new Thread(w);
        Thread t2=new Thread(w);
        Thread t3=new Thread(w);

        t1.start();
        t2.start();
        t3.start();

    }
}
class Window implements Runnable{
    private int ticket=100;

    @Override
    public void run() {
        while (true){
            show();
        }

    }
    private synchronized void show(){ //同步监视器：this
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":" + ticket);
            ticket--;

        }

    }
}

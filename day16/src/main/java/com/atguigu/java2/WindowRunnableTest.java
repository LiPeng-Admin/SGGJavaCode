package com.atguigu.java2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName WindowRunnableTest.java
 * @Description TODO
 * @createTime 2022年03月29日 23:27:00
 */
//例子：创建三个窗口卖票，总票数为100 张:
//    此代码存在线程安全问题，待解决
public class WindowRunnableTest {
    public static void main(String[] args) {
        Window1 w1=new Window1();

        Thread thread = new Thread(w1);
        Thread thread2 = new Thread(w1);
        Thread thread3 = new Thread(w1);

        thread.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread.start();
        thread2.start();
        thread3.start();

    }
}
class Window1 implements Runnable{
    private int ticket=100;

    @Override
    public void run() {
        while (true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+":卖票，票号为："+ticket);
                ticket--;
            }else {
                break;
            }
        }

    }
}

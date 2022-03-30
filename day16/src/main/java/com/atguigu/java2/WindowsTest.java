package com.atguigu.java2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName WindowsTest.java
 * @Description TODO
 * @createTime 2022年03月29日 22:22:00
 */
//例子：创建三个窗口卖票，总票数为100 张
    //此代码存在线程安全问题，待解决
public class WindowsTest {
    public static void main(String[] args) {
        Window w1=new Window();
        Window w2=new Window();
        Window w3=new Window();
        w1.setName("窗口1：");
        w2.setName("窗口2：");
        w3.setName("窗口3：");
        w1.start();
        w2.start();
        w3.start();
    }
}
class Window extends Thread{
    private  static int ticket=100;

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

package com.atguigu.java6;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName LockTest.java
 * @Description TODO
 * @createTime 2022年03月31日 22:33:00
 */
/*
* 解决线程安全问题的方式三：Lock锁 --JDK 5.0新增
    *1：实例化ReentrantLock
    *2:调用锁定方法：lock() 方法
    * 3：调用解锁方法：unlock
*
* 面试题：synchronized 与Lock的异同
    * 相同点：二者都是解决线程的安全问题
    * 不同点：synchronized机制在执行完相应的同步代码块以后，自动的释放同步监视器
    * LOck需要手动的启动同步（lock()），同时结束同步也需要手动的实现（unlock()）
    *
   面试题，如何解决线程安全问题？有几种方式？
*
*
*
*
* */
public class LockTest {
    public static void main(String[] args) {

        Windows w1=new Windows();

        Thread t1=new Thread(w1);
        Thread t2=new Thread(w1);
        Thread t3=new Thread(w1);
        t1.start();
        t2.start();
        t3.start();

    }
}
class Windows implements  Runnable{
    private int ticket=100;

    //1：实例化ReentrantLock
    private ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {

        while (true){

          try{
              //2:调用锁定方法：lock() 方法
              lock.lock();
              try {
                  Thread.sleep(100);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              if(ticket >0){
                  System.out.println(Thread.currentThread().getName()+"，售票，票号为："+ticket);
                  ticket--;

              }else {
                  break;
              }
          }finally {
//              /:3：调用解锁方法：unlock
              lock.unlock();

          }
        }
    }
}

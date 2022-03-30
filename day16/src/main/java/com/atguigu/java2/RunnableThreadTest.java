package com.atguigu.java2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName RunnableThreadTest.java
 * @Description TODO
 * @createTime 2022年03月29日 22:40:00
 */
/*
* 创建多线程的方式二：实现Runnable接口
*   1:创建一个实现Runnable接口的类
*   2：实现类去实现Runnable中的抽象方法run()方法
*   3:创建实现累的对象
*   4：将此对象作为参数传递到Thread类的构造器中，创建Thread 类的对象
*   5：通过Thread 类的对象调用start()方法
*
*代码示例如下：
* class PrimeRun implements Runnable {
         long minPrime;
         PrimeRun(long minPrime) {
             this.minPrime = minPrime;
         }

         public void run() {
             // compute primes larger than minPrime
              . . .
         }
     }

//The following code would then create a thread and start it running:

     PrimeRun p = new PrimeRun(143);
     new Thread(p).start();
*
*
* 两种创建线程的方式比较
* 开发中，优先选择实现Runnable接口
*   ①实现的方式没有类的单继承性的限制
*
*   ②实现的方式更适合处理多个线程有共享数据的情况
*
* 联系：class Thread implements Runnable
* 相同点：两种方式都需要重写run(),将线程要执行的逻辑声明在run()方法中
* */
public class RunnableThreadTest {
    public static void main(String[] args) {
        //3:创建实现累的对象
        MThread m=new MThread();
//        4：将此对象作为参数传递到Thread类的构造器中，创建Thread 类的对象
//
        Thread thread = new Thread(m);
//        5：通过Thread 类的对象调用start()方法
        thread.start();
        //在启动一个线程，遍历100以内的偶数
        Thread thread1=new Thread(m);
        thread1.start();


    }
}
//1:创建一个实现Runnable接口的类
class MThread implements  Runnable{

//2：实现类去实现Runnable中的抽象方法run()方法
    @Override
    public void run() {
        //遍历100以内的偶数
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

        }

    }
}

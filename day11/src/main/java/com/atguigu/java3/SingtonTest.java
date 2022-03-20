package com.atguigu.java3;

import com.sun.org.apache.bcel.internal.generic.RET;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SingtonTest.java
 * @Description 单例设计模式
 * @createTime 2022年03月20日 20:09:00
 */
/*
* 单例设计模式：
* 1：所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
* 2：如何实现？
*       1：饿汉式：
*               1:私有化类的构造器
*:              2：内部创建类的对象(要求此对象必须声明为静态的)
*               3：提供公共的静态方法，返回类的对象
*
*       2:懒汉式:

    *   1：私有化类的构造器
    *   2:声明当前类对象，未初始化(要求此对象必须声明为静态的)
    *   3:声明公共的，static的返回类当前类对象的方法
    *
  3:区分懒汉式与饿汉式：
  *     饿汉式：优点：线程是安全的
  *            缺点：对象家在的时间过长
  *
  *     懒汉式：优点：延迟对象的创建
  *            缺点：目前的写法线程是不安全的-->多线程时在修改
  *

* */
public class SingtonTest {
    public static void main(String[] args) {
      Bank b1= Bank.getInstance();
      Bank b2=Bank.getInstance();
        System.out.println(b1==b2);
    }
}
//饿汉式
class Bank{
    //1:私有化类的构造器
    private Bank(){

    }
    //2：内部创建类的对象(要求此对象必须声明为静态的)
    private static Bank instance=new Bank();
    //3:提供公共的静态方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }

}

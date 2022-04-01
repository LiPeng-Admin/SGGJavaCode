package com.atguigu.java5;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName BankTest.java
 * @Description TODO
 * @createTime 2022年03月31日 20:26:00
 */
//使用同步机制将单例模式中的懒汉式改写成线程安全的
//单例的懒汉式实现
/*
 *   1：私有化类的构造器
 *   2:声明当前类对象，未初始化(要求此对象必须声明为静态的)
 *   3:声明公共的，static的返回类当前类对象的方法
 * */
public class BankTest {


}

class Bank {
    private Bank() {

    }

    private static Bank instance = null;

    public static Bank getInstance() {
        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if(instance==null){
//                instance=new Bank();
//            }
//
//            return instance;
        //方式二：效率高
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();

                }
            }
        }
        return instance;
    }
}

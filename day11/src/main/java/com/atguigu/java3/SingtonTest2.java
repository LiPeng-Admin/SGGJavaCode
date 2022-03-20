package com.atguigu.java3;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SingtonTest2.java
 * @Description 懒汉式单例设计模式
 * @createTime 2022年03月20日 20:28:00
 */
//单例的懒汉式实现
    /*
    *   1：私有化类的构造器
    *   2:声明当前类对象，未初始化(要求此对象必须声明为静态的)
    *   3:声明公共的，static的返回类当前类对象的方法
    * */
public class SingtonTest2 {
    public static void main(String[] args) {

        Order order=Order.getInstance();
        Order order1=Order.getInstance();
        System.out.println(order==order1);


    }
}
class Order{
    //1：私有化类的构造器
    private Order(){

    }
    //2:声明当前类对象，未初始化(要求此对象必须声明为静态的)
    private static Order instance=null;

    //3:声明公共的，static的返回类当前类对象的方法
    public static Order getInstance(){ //-->多线程时在修改
        if(instance==null){
            instance=new Order();
        }
        return instance;

    }
}

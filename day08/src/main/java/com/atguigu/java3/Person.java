package com.atguigu.java3;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Person.java
 * @Description TODO
 * @createTime 2022年03月12日 16:55:00
 */
public class Person {
    String name;
    int age;
    int id=1001; //身份证号
    public Person(){
        System.out.println("我是空参的构造器");

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void walk(){
        System.out.println("人可以行走");
    }
}

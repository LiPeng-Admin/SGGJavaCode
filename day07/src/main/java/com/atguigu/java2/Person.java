package com.atguigu.java2;

public class Person {

    //属性
    String name;
    int age;
    public void setName(String name){
        this.name=name; //不能省略this,原因是形参name 与属性的name 同名

    }
    //构造器
    public Person(){
        String info="执行40行代码";
        System.out.println(info);

    }
    public Person(String name){
        this();
        this.name=name;
    }
    public Person(int age){
        this();
        this.age=age;

    }
    public Person(String name,int age){
        this(age);
        this.name=name;
        this.age=age;

    }

    //方法
    public String getName(){
        return this.name; //可以省略this
    }
    public void setAge(int age){
        this.age=age; //不能省略this
    }
    public int getAge(){
        return this.age; //可以省略this
    }
    public void eat(){
        System.out.println("人可以吃饭");
        this.study(); //可以省略this
    }
    public void study(){
        System.out.println("人可以学习");
    }
}

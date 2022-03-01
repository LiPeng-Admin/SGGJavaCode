package com.atguigu.java1;

import java.lang.reflect.Constructor;

/*
* 类的结构之三：构造器（或构造方法）的使用: Constructor
 * 一：构造器的使用
     * 创建对象
     * 给对象初始化
   二：说明
   * 1：如果没哟显示的定义类的构造器的话，则系统默认提供一个空参的构造器
   * 2：定义构造器的格式：
   * 权限修饰符 类名（形参列表）{
   * }
   * 3：类中可以定个多个构造器，彼此构成重载
   * 4：一旦我么定义了类的构造器之后，系统就不在提供了默认的空参构造器
   * 5：一个类中，至少会有一个构造器
   *
* */
public class PersonTest{
    public static void main(String[] args) {
        //创建类的对象:new +构造器
        Person person=new Person();
        person.eat();
        System.out.println(person.name);//null

        Person person1=new Person("Tom");
        System.out.println(person1.name);//Tom
    }

}
class Person{
    //属性
    String name;
    int age;

    //构造器:
    public Person(){
        System.out.println("Person().......");
    }
    public Person(String s){
        name=s;
    }
    public Person(String s,int a){

    }

    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void study(){
        System.out.println("人可以学习");
    }


}


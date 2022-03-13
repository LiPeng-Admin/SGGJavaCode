package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InstanceTest.java
 * @Description TODO
 * @createTime 2022年03月13日 23:36:00
 */
public class InstanceTest {
}
class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo(){
        return "Name:"+name+"\n"+"age:"+age;
    }

}
class Student extends Person{
    protected  String school="pku";
    public String getInfo(){
        return "Name:"+name+"\nage:"+age+"\nschool:"+school;
    }
}
class Graduate extends Student{
    public  String major="IT";
    public String getInfo(){
        return "Name:"+name+"\nage:"+age+"\nschool:"+school+"\nmajor:"+major;
    }
}

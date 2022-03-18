package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InstanceTest.java
 * @Description TODO
 * @createTime 2022年03月13日 23:36:00
 */
/*
* 建立 InstanceTest类，在类中定义方法method(Person e);
* 在method中
* （1）根据e 的类型调用响应类的getInfo()方法
* （2）根据e 的类型执行：
* 如果e 为Person 类的对象，输出
* "a.person";
* 如果e 为Student类的对象，输出：
* "a.student"
* "a.person"
* 如果e 为Graduate类的对象。，输出
* " a graduated studnet"
* "a student"
* "a person"
* */
public class InstanceTest {

    public static void main(String[] args) {
        InstanceTest instanceTest=new InstanceTest();
        instanceTest.method(new Person());

    }
    public void method(Person e){
       String info= e.getInfo();
        System.out.println(info);
        if(e instanceof Graduate){
            System.out.println("a graduated studnet");
            System.out.println("a student");
            System.out.println("a person");
        }else if(e instanceof Student){
            System.out.println("a.student");
            System.out.println("a.person");

        }else{
            System.out.println("a.person");

        }
    }

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

package com.atguigu.java;
/*
1:设计类，其实就是设计类的成员
    属性=成员变量=field=域、字段
    方法=成员方法=函数=method
    创建类的对象=类的实例化=实例化类
*
2:类和对象的使用
1：创建类，设计类的成员
2：创建类的对象
3：通过"对象.属性"或"对象.方法"调用对象的结构

3:若创建一个类的多个对象，则每个对象都独立的拥有一套类的属性(非static )
    若修改了一个对象的属性a,不影响另外一个对象属性a 的值
* */
public class PersonTest {
    public static void main(String[] args) {

        //2:创建Person类的对象
        Person person=new Person();
        //3:调用对象的结构：属性，方法

        //调用属性："对象.属性"
        person.name="Tom";
        person.isMale=true;
        System.out.println(person.name);

        //调用方法："对象.属性"
        person.eat();
        person.sleep();
        person.talk("Chinese");
        System.out.println("*************************");
        //创建Person类的另一个对象
        Person person1=new Person();

        System.out.println(person1.name); //null
        System.out.println(person1.age);

        System.out.println("*************************");

        Person person2=person;
        System.out.println(person2.name); //Tom
        person2.age=10;
        System.out.println(person.age); //10


    }

}
//1：创建类，设计类的成员
class Person{
    //属性
    String name;
    int age=2;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public  void talk(String language){
        System.out.println("人可以交流,使用的语言是："+language);
    }
}

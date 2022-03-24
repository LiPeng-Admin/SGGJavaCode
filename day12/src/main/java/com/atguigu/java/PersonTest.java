package com.atguigu.java;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PersonTest.java
 * @Description 抽象类的匿名子类
 * @createTime 2022年03月23日 22:51:00
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student()); //匿名对象
        Worker worker=new Worker();
        method1(worker); //非匿名的类非匿名的对象
        method1(new Worker()); //非匿名的类匿名的对象

        //创建了一个匿名子类的对象：person
        Person person=new Person() {
            @Override
            public void eat() {
                System.out.println("cdx");

            }

            @Override
            public void breath() {
                System.out.println("hx");

            }
        };
        method1(person);

    }
    public  static void method( Student student){

    }
    public static void method1(Person person){
        person.eat();
        person.breath();
    }
}
class Worker extends Person{
    @Override
    public void eat() {

    }

    @Override
    public void breath() {

    }
}

package com.atguigu.java3;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2022年03月12日 16:56:00
 */
public class Student extends Person{
    String major;
    int id=1002; //学号
    public Student(){
        super();

    }
    public Student(String major){
        this.major=major;
    }
    public Student(String name,int age,String major){
        super(name,age);
        this.major=major;

    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的蔬菜");
//
    }
    public void study(){
        System.out.println("人也可以去学习");
        eat();
        super.eat();
    }
    public void show(){
        System.out.println("name:"+name+",age:"+age);
        System.out.println("id:"+id);
        System.out.println("id:"+super.id);
    }
}

package com.atguigu.java1;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2022年03月10日 07:39:00
 */
public class Student extends Person {
    private String major;

    public Student(){

    }
    public Student(String major){
        this.major=major;
    }
    public void study(){
        System.out.println("学习了！,专业是："+major);
    }

    //对父类中的eat()进行了重写
    public void eat(){
        System.out.println("学生应该多吃有营养的食物。");
    }
    public void show(){
        System.out.println("我是一个学生");
    }

    public Object goRun(){ //返回值可以是Object 或它的子类
        return null;
    }

    @Override
    public double info() {
        return 1.2;
    }
}

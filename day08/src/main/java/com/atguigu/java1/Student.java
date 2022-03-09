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
}

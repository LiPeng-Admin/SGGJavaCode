package com.atguigu.exer2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Employee.java
 * @Description TODO
 * @createTime 2022年03月24日 07:58:00
 */
/*
 定义一个Employee类，该类包含
 private 成员变量 name,number,birthday,其中birthday，为MyData类的对象
 abstrat方法earnings();
 toString()方法输出对象的name,number和birthday
*/
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

   public abstract double earning();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }
}

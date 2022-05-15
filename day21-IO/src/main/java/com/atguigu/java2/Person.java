package com.atguigu.java2;

import java.io.Serializable;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/15
 */
/*
 *Person 需要满足如下要求，方可序列化
 * 1:需要实现接口：Serializable
 * 2:当前类需要提供提个全局常量：serialVersionUID
 * 3:除了需要Person类实现接口：Serializable外，还需要Person类的内部所有属性也必须是可序列化的，
 * （默认情况下，基本数据类型可序列化）
 *
 * 补充：
 * ObjectOutputStream 和 ObjectInputStream 不能序列化 static 和 transient 修饰的成员变量
 *
 * */
public class Person implements Serializable {

    public static final long serialVersionUID = 42025885L;
    private String name;
    private int age;
    private Account account;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Account account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", account=" + account +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Account implements Serializable {

   public static final long serialVersionUID = -42587945L;

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}

package com.atguigu.java;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Man.java
 * @Description TODO
 * @createTime 2022年03月13日 10:21:00
 */
public class Man extends  Person{
    boolean isSmoking;
    int id=1002; //学身份学号
    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    @Override
    public void eat() {
        System.out.println("男人可以多吃点饭");
    }

    @Override
    public void walk() {
        System.out.println("这个男人走路很霸气");
    }
}

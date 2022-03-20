package com.atguigu.java1;

import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ToStringTest.java
 * @Description TODO
 * @createTime 2022年03月19日 14:34:00
 */
/*
* Object 类中toString ()的使用
* 1：当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
* 2：Object 类中toString()的定义：
* public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
  3： 对于String,Date,File,包装类等重写了Object 类中的toString ()方法使得在调用对象的toString()时，返回"实体内容"信息

 * 4：自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"
*
*
* */
public class ToStringTest {
    public static void main(String[] args) {
        Customer customer=new Customer("Tom",25);
        System.out.println(customer.toString()); //com.atguigu.java1.Customer@4554617c---》Customer[name=Tom,age=25]
        System.out.println(customer);//com.atguigu.java1.Customer@4554617c---》Customer[name=Tom,age=25]
        String str=new String("MM");
        System.out.println(str);//MM
        System.out.println(str.toString());
        Date date=new Date(3145789l);
        System.out.println(date); //Thu Jan 01 08:52:25 CST 1970
    }
}

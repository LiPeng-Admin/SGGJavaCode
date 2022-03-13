package com.atguigu.java3;

import com.atguigu.java2.Order;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName OrderTest.java
 * @Description TODO
 * @createTime 2022年03月12日 16:46:00
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order=new Order();
        //不同包的普通类（非子类）使用Order类，不可以调用声明为privated,缺省，protected 修饰符的属性和方法
        order.orderPublic=1;
        order.methodPublic();
    }
}

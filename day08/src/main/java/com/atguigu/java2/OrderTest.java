package com.atguigu.java2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName OrderTest.java
 * @Description TODO
 * @createTime 2022年03月12日 16:34:00
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order=new Order();
        //同一个包中的其他类，不可以调用Order类中私有的属性和方法
        order.orderProtected=1;
        order.orderDefault=2;
        order.orderPublic=3;
        order.methodProtected();
        order.methodDefault();
        order.methodPublic();
    }
}

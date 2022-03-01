package com.atguigu.java;

public class OrderTest {
    public static void main(String[] args) {
        Order order=new Order();
        order.getOrderPublic=1;
        order.orderDefault=2;
//        order.orderPrivate  //出了Order类之后，私有的结构就不可以调用了
        order.methodDefault();
        order.methodPublic();
    }
}

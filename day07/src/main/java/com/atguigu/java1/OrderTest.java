package com.atguigu.java1;

import com.atguigu.java.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order=new Order();
        order.getOrderPublic=1;
//        order.orderDefault=2; //出了Order类所属的包以后，私有的结构，缺省声明的结构就不可以调用了
//        order.orderPrivate  //出了Order类之后，私有的结构就不可以调用了
//        order.methodDefault();//出了Order类所属的包以后，私有的结构，缺省声明的结构就不可以调用了
        order.methodPublic();
    }
}

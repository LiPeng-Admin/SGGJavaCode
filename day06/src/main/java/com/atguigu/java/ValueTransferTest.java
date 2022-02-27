package com.atguigu.java;
/*
* 关于变量的赋值
*   如果变量是基本数据类型，此时赋值的是变量所保存的数据值
*   如果变量是引用数据类型，此时复制的是变量所保存的数据地址值
* */

public class ValueTransferTest {
    public static void main(String[] args) {
        System.out.println("***********基本数据类型****************");
        int m=10;
        int n=m;
        System.out.println("m="+m+",n="+n);
        n=20;
        System.out.println("m="+m+",n="+n);
        System.out.println("***********引用数据类型****************");
        Order order=new Order();

        order.orderId=1001;
        Order order1=order; //赋值以后，order与order1的地址值相同，都指向了堆空间中同一个对象实体
        System.out.println("order1："+order.orderId+",order1："+order1.orderId);
        //修改对象中的属性值
        order1.orderId=1002;
        System.out.println("order1："+order.orderId+",order1："+order1.orderId);

    }
}
class Order{
    int orderId;
}

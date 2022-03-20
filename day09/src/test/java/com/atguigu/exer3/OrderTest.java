package com.atguigu.exer3;

import javax.swing.*;


/**
 * @author admin
 * @version 1.0.0
 * @ClassName OrderTest.java
 * @Description TODO
 * @createTime 2022年03月19日 00:16:00
 */
/*
* 编写Order类，有int 型的orderId,String 型的orderName,
* 相应的getter（）和setter（）方法，两个参数的构造器
* 重写父类的equals（）方法：public boolean equals(Object obj)
* 判断测试类中创建的两个对象是否相等
*
* */
public class OrderTest {

    public static void main(String[] args) {
       Order order=new Order(1001,"Tom");
       Order order1=new Order(1001,"Tom");
        System.out.println(order.equals(order1));

    }

}
class Order{
    private int orderId;
    private String orderName;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Order(int orderId,String orderName) {
        this.orderId = orderId;
        this.orderName=orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj instanceof Order){
            Order order=(Order) obj;
            if(orderId==order.orderId&&orderName.equals(order.orderName)){
                return true;
            }
            return  false;
        }
        return false;

    }
}


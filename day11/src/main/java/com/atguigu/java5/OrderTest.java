package com.atguigu.java5;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName OrderTest.java
 * @Description 属性赋值的先后顺序
 * @createTime 2022年03月20日 23:25:00
 */
/*
* 对属性可以赋值的位置
 * 1：默认初始化
 * 2：显示初始化
 * 3：构造器中初始化
 * 4：有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值
 * 5：代码块中赋值
 *
 * 重点：执行顺序：①-②/⑤-③-④
*
* */

public class OrderTest {
    public static void main(String[] args) {
        Order order=new Order();
        System.out.println(order.orderId);
    }
}
class Order{
    int orderId=3;
    {
        orderId=4;
    }

}

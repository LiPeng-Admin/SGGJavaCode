package com.atguigu.java;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ObjectTest.java
 * @Description TODO
 * @createTime 2022年03月18日 21:59:00
 */
/*
java.lang.Object 类
1：Object 类是所有java类的父类
2：如果在类的声明中未使用extends关键字指明其父类，则默认父类为java.lang.Object类
3:Object 类中的功能（属性，方法）具有通用性
属性：无
方法：equals()/toString()/getClass()/hashCode()/clone()/findlize()/wait()/notify()

4：Object 中只声明了一个空参构造器

* */
public class ObjectTest {
    public static void main(String[] args) {
        Order order=new Order();
        System.out.println(order.getClass().getSuperclass());
    }

}
class Order{


}

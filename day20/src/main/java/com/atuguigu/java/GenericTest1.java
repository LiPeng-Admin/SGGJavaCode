package com.atuguigu.java;
//如何自定义泛型结构：泛型类，泛型接口；泛型方法
/*
* 注意点：
* ①泛型类可能有多个参数，此时应将多个参数一起放在尖括号内。比如<E1,E2,E3>
  ② 泛型类的构造器如下： public GenericClass(){}
    而下面是错误的： public GenericClass<E>{}
  ③实例化后，操作原来泛型位置的结构必须与指定的泛型类型一致。
  ④泛型不同的引用不能相互赋值
  * 异常类不能声明为泛型类
  * 静态方法不能使用类的泛型
  *
  * //泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系
    //换句话说，泛型方法所属的类是不是泛型类都没有关系
    //泛型方法，可以声明为静态的。原因：泛型参数是在带哦用方法时确定的，并非在实例化类时确定

*
*
* */

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest1 {
    @Test
    public void test1() {
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
        //要求：如果大家定义了类是带泛型的，建议在实例化时要指明类的泛型。
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("Tom");

        //建议：实例化时指明类的泛型
        Order<String> order1 = new Order<>("orderAA", 1001, "orderAA:order");
        order1.setOrderT("Tom");
        order1.setOrderT("Jason");
    }

    @Test
    public void test2() {
        SubOrder subOrder = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型，则实例化子类对象时，不在需要指明泛型
        subOrder.setOrderT(1122);
        SubOrder1<String> subOrder1 = new SubOrder1<>();
        subOrder1.setOrderT("order2..");
    }

    @Test
    public void test3() {
        //泛型不同的引用不能相互赋值。
        ArrayList<String> list = null;
        ArrayList<Integer> list1 = null;
//        list1=list;
    }

    //测试泛型方法
    @Test
    public void test4() {
        Order<String>order=new Order<>();
        Integer[] arr = {1, 2, 3, 4};
        //泛型方法在调用时，指明泛型参数的类型
        List<Integer> list = order.copyFromArrayToList(arr);
        System.out.println(list);

    }
}

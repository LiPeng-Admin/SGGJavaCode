package com.atguigu.java;

import org.junit.Test;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName WrapperTest.java
 * @Description TODO
 * @createTime 2022年03月19日 20:12:00
 */
/*
* 包装类的使用
* java 提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
* 掌握的：基本数据类型，包装类，String 三者之间的互相转换
*
*
*
* */
public class WrapperTest {
    //String 类型---》基本数据类型，包装类:调用包装类的parseXxx()
    @Test
    public void test5(){
        String str1="123";
        int num1=Integer.parseInt(str1);
        System.out.println(num1+1);
        String str2="true";
        boolean b1=Boolean.parseBoolean(str2);
        System.out.println(b1);

    }

    //基本数据类型，包装类--->String类型：调用String重载的valueOf(xxx)
    @Test
    public void test4(){
        int num3=14;
        //方式一：连接运算
        String s1=num3+"";
        System.out.println(s1);
        //方式二：调用String重载的valueOf(xxx)
        float f1=12.3f;
        String s2=String.valueOf(f1);
        System.out.println(s2);
        Double d1=new Double(15.7);
        String s3=String.valueOf(d1);
        System.out.println(s3);


    }

    /*
    * Java 5.0新特性：自动装箱与自动拆箱
    *
    * */
    @Test
    public void test3(){
        int num=10;
        method(num);

        //自动装箱:基本数据类型---》包装类
        int num2=12;
        Integer integer=num2; //自动装箱
        boolean b1=true;
        Boolean b2=b1; //自动装箱

        //自动拆箱：包装类---》基本数据类型
        System.out.println(integer.toString());
        int i1=integer; //自动拆箱
    }

    public void method(Object o){
        System.out.println(o);

    }

    //包装类---》基本数据类型：调用包装类的xxxValue()
    @Test
    public void test2(){
        Integer integer=new Integer(12);
        int i1=integer.intValue();
        System.out.println(i1+1);
        Float f1=new Float(12.3);
        float f2=f1.floatValue();
        System.out.println(f2-1);

    }

    //基本数据类型---》包装类：调用包装类的构造器
    @Test
    public void test1(){
        int number=10;
        Integer integer=new Integer(number);
        System.out.println(integer.toString());
        Integer integer1=new Integer("123");
        System.out.println(integer1.toString());

        Float f1=new Float(12.3f);
        System.out.println(f1.toString());
        Float f2=new Float("1233.3");
        System.out.println(f2);

        Boolean b1=new Boolean(true);
        Boolean b2=new Boolean("true");
        System.out.println(b2); //true
        Boolean b3=new Boolean("true123");
        System.out.println(b3.toString()); //false
        Order order=new Order();
        System.out.println(order.isMale); //false
        System.out.println(order.isFemale);


    }
}
class Order{
    boolean isMale;
    Boolean isFemale;
}

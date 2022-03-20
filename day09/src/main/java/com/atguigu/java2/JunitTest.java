package com.atguigu.java2;

import org.junit.Test;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName JunitTest.java
 * @Description TODO
 * @createTime 2022年03月19日 18:06:00
 */
/*
* Java中的Junit单元测试
* 1:创建Java 类，进行单元测试
*               此时的java 类要求：此类是public 的，此类提供公共的无参构造器
* 2：此类中声明的单元测试方法
*       此时的单元测试方法：方法的权限是public,没有返回值,没有形参
* 3:此单元测试方法上需要声明注解：@Test,并在单元测试类中导入：import org.junit.Test
* */
public class JunitTest {
    int num=10;
    @Test
    public void testEquals(){
        String s1="MM";
        String s2="mm";
        System.out.println(s1.equals(s2));
        show();

    }
    public void show(){
        num=20;
        System.out.println("show()...");
    }
    @Test
    public void testToString(){
        String s3="BB";
        System.out.println(s3.toString());
    }
}

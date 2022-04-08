package com.atguigu.java;

import org.junit.Test;

import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName DateTimeTest.java
 * @Description 日期和时间
 * @createTime 2022年04月05日 00:29:00
 */

/*
*JDK8之前的日期和时间的api测试
*
*
* */
public class DateTimeTest {
    //1.System类中的currentTimeMillis()
    @Test
    public void test1(){
        //获取系统当前时间：System类中的currentTimeMillis()
        long l = System.currentTimeMillis();
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
        //时间戳
        System.out.println(l);

    }
    /*
    *2:java.util.Date类
    *       ---java.sql.Date 类
    *
    *
    * 1：两个构造器的使用
        *  >构造器一：创建一个对应当前时间的Date对象
        *  >构造器二：创建指定毫秒数的Date对象
    * 2：两个方法的使用
    *       >toString():显示当前的年，月，日，时，分，秒
    *       >getTime():获取当前Date对象对应的时间戳
    *
    * 3:java.sql.Date :对应着数据库中的日期类型的变量
    *       >如何实例化
    *
    *       >util.Date对象--->sql.Date对象
    *            Date date5=new Date();
                 java.sql.Date date6=new java.sql.Date(date5.getTime());
    }
    *
    * */
    @Test
    public void test2(){
        //构造器一：创建一个对应当前时间的Date对象
        Date date = new Date();
        System.out.println(date.toString());//Tue Apr 05 10:07:32 CST 2022
        System.out.println(date.getTime());//1649124588465

    //构造器二：创建指定毫秒数的Date对象
        Date date1 = new Date(1649124588465L);
        System.out.println(date1.toString());

    //创建java.sql.Date对象
        java.sql.Date date2 = new java.sql.Date(1649125636025L);
        System.out.println(date2.toString());

        //如何将java.util.Date对象转换为java.sql.Date对象
        //方式一：
//        Date date3=new java.sql.Date(1649125636025L);
//        java.sql.Date date4= (java.sql.Date) date3;

        //方式二：
        Date date5=new Date();
        java.sql.Date date6=new java.sql.Date(date5.getTime());
    }
}

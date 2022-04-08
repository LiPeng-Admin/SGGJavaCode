package com.atguigu.java2;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName DateTimeTest.java
 * @Description TODO
 * @createTime 2022年04月05日 23:30:00
 */
/*
 * jdk 8 之前的日期时间的API测试
 * 1：System类中currentTimeMillis();
 * 2:java.util.Date和子类java.sql.Date
 * 3:SimpleDateFormat
 * 4:Calendar
 *
 *
 * */
public class DateTimeTest {
    /*
     * SimpleDateFormat的使用：SimpleDateFromat对日期Date类的格式化和解析
     * 1：两个操作：
     * 1.1：格式化：日期-->字符串
     * 1.2：解析：格式化的逆过程，字符串-->日期
     * 2：SimpleDateFormat 的实例化
     *
     * */
    @Test
    public void testSimpleDateFormat() throws ParseException {

        //①实例化SimpleDateFormat:使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化：日期--->字符串
        Date date = new Date();
//        System.out.println(date);//Tue Apr 05 23:42:05 CST 2022
        String format = sdf.format(date);
        System.out.println(format);//22-4-5 下午11:42

        //解析：字符串-->日期
        String str = "22-4-5 下午11:46";
        Date parse = sdf.parse(str);
        System.out.println(parse);//Tue Apr 05 23:46:00 CST 2022


        //***********按照指定的方式格式化和解析**********


        //②实例化SimpleDateFormat：自定义
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        //格式化：日期--->字符串
        Date date1 = new Date();
        String format1 = sdf1.format(date1);
        System.out.println(format1); //2022-04-05 11:55:34

        //解析:字符串-->日期:
        // 要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器参数体现),
        String str2 = "2022-04-05 11:55:34";
        Date parse1 = sdf1.parse(str2);
        System.out.println(parse1);//Tue Apr 05 11:55:34 CST 2022





    }
    /*
     *练习一：字符串"2022-04-06"转换为java.sql.Date

     * */
    @Test
    public void testExer() throws ParseException {
        String birth="2022-04-06";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf1.parse(birth);
//        System.out.println(parse);
        java.sql.Date date = new java.sql.Date(parse.getTime());
        System.out.println(date);

    }
}

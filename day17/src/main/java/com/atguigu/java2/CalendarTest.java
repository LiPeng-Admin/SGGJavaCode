package com.atguigu.java2;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CalendarTest.java
 * @Description TODO
 * @createTime 2022年04月06日 11:25:00
 */
/*
* Calendar 日历类的使用
*
* */
public class CalendarTest {
    @Test
    public void test1(){
        //1:实例化
        //方式一：创建其子类的对象
        //方式二：调用其静态方法getInstance()

        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getClass());//GregorianCalendar
        //2:常用方法：
//        get()
        int i =calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);
        int i1 = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(i1);

        //set()
       calendar.set(Calendar.DAY_OF_MONTH,7);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,3);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //getTime():日历类--->Date
        Date time = calendar.getTime();
        System.out.println(time);

        //setTime():Date--->日历类
        Date date = new Date();
        calendar.setTime(date);
        i=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);

    }
}

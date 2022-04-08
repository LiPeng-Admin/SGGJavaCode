package com.atguigu.java3;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName JDK8DateTimeTest.java
 * @Description TODO
 * @createTime 2022年04月07日 15:06:00
 */
public class JDK8DateTimeTest {
    /*
    localDate,localTime,LocalDateTime
    */

    @Test
    public void test1(){
        //now():获取当前日期，时间，日期+时间

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        
        //of():设置指定的年，月，日，时，分，秒，没有偏移量
        LocalDateTime of = LocalDateTime.of(2022, 4, 7, 15, 31, 40);
        System.out.println(of);
        System.out.println("***********************");

        //getXxx
        LocalDateTime localDateTime1=LocalDateTime.now();
        System.out.println(localDateTime1.getDayOfMonth());//7
        System.out.println(localDateTime1.getDayOfWeek());//THURSDAY
        System.out.println(localDateTime1.getDayOfYear());//97
        System.out.println(localDateTime1.getMonth());//APRIL
        System.out.println(localDateTime1.getMonthValue());//4
        System.out.println("*********************");

        LocalDateTime localDateTime2 = localDateTime1.withDayOfMonth(8);
        System.out.println(localDateTime1);//7-->体现不可变性
        System.out.println(localDateTime2);//8

        //plusXxx:加
        LocalDateTime localDateTime3 = localDateTime1.plusDays(3);
        System.out.println(localDateTime1);
        System.out.println(localDateTime3);//2022-04-10T16:26:42.941

        //minusXxx:减
        LocalDateTime localDateTime4 = localDateTime1.minusDays(5);
        System.out.println(localDateTime4);//2022-04-02T16:26:42.941


    }
    /*
    * Instant的使用

    * */
    @Test
    public void test2(){
        //now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2022-04-07T08:54:56.801Z

        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2022-04-07T16:57:16.413+08:00

        //toEpochMilli():获取自1970年1月1日0时0分0秒（UTC）开始的毫秒数  ---> Date类的getTime()
        long l = instant.toEpochMilli();
        System.out.println(l);//1649322303561

        //ofEpochMilli():通过给定的毫秒数，获取Instant实例  -->Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1649322303561L);
        System.out.println(instant1);//2022-04-07T09:05:03.561Z

    }
    /*
        DateTimeFormatter
    *① 格式化或解析日期、时间
    * ② 类似于 SimpleDateFormat

    * */
    @Test
    public void test3(){
        // 方式一：预定义的标准格式。
        //    如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter time = DateTimeFormatter.ISO_DATE_TIME;
        //格式化：日期--->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str= time.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(str);

        //解析：字符串--->日期
        TemporalAccessor parse = time.parse("2022-04-07T19:50:19.769");
        System.out.println(parse);
        System.out.println("***************************");

        //  方式二：
        // 本地化相关的格式。如：ofLocalizedDateTime()
        // FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT :适用于LocalDateTime

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //格式化
        LocalDateTime localDateTime1=LocalDateTime.now();
        String format = dateTimeFormatter.format(localDateTime1);
        System.out.println(format);

        // 本地化相关的格式。如：ofLocalizedDate()
        // FormatStyle.FULL / FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT : 适用于LocalDate

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate localDate=LocalDate.now();
        //格式化:日期--->字符串
        String str2 = dateTimeFormatter1.format(localDate);
        System.out.println(str2);

        //重点： 方式三：自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDateTime localDateTime2=LocalDateTime.now();
        //格式化：日期--->字符串
        String str3 = dateTimeFormatter2.format(localDateTime2);
        System.out.println(str3);
        //解析：字符串-->日期
        TemporalAccessor parse1 = dateTimeFormatter2.parse("2022-04-07 08:12:04");
        System.out.println(parse1);



    }
}

package com.atguigu.exer2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName MyDate.java
 * @Description TODO
 * @createTime 2022年03月24日 08:05:00
 */
/*
* MyDate类包含
* private 成员变量year,month,day;
* toDateString()方法返回日期对应的字符串：xxx年xx月xx日
*
*
*
*
*
* */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String  toDateString(){
        return year+"年"+month+"月"+day+"日";
    }
}

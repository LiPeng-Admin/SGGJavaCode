package com.atguigu.exer4;



/**
 * @author admin
 * @version 1.0.0
 * @ClassName MyDateTest.java
 * @Description TODO
 * @createTime 2022年03月19日 14:06:00
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate date=new MyDate(14,3,1976);
        MyDate date1=new MyDate(14,3,1976);
        if(date==date1){
            System.out.println("date==date1");

        }else {
            System.out.println("date!=date1");
        }
        if(date.equals(date1)){
            System.out.println("date is equal to date1");
        }else{
            System.out.println("date is not equal to date1");
        }

    }
}
class MyDate{
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MyDate myDate = (MyDate) o;
//        return day == myDate.day && month == myDate.month && year == myDate.year;
//    }
    //重写equals()方法
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o instanceof MyDate){
            MyDate myDate=(MyDate) o;

            if(day==myDate.day&&month==myDate.month&&year==myDate.year){
                return true;
            }else {
                return false;
            }

        }
        return  false;

    }

}

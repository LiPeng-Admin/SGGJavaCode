package com.atguigu.java;

import org.junit.Test;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName StringTest.java
 * @Description String 的使用
 * @createTime 2022年04月03日 21:49:00
 */
public class StringTest {
    /*
    * String:字符串，使用一对""表示
    * 1：String 声明为final,不可被继承
    * 2：String 实现了Serializable 接口，表示字符串是支持序列化的
    *           实现了Comparable 接口，表示字符串是可以比较大小的
    * 3：String 内部定义了final char value[]用于存储字符串数据
    * 4：String:代表不可变的字符序列，简称：不可变性
    *   体现：1：当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value 进行赋值，见图字符串1
    *        2:当对原有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的value 进行赋值
    *        3:当调用String的replace()方法修改指定字符或字符串时，也需要重新指定内存区域赋值，不能使用原有的value 进行赋值
    *
    * 5：通过字面量（区别于new ）的方式给一个字符串赋值，此时的字符串值声明在字符串常量池中
    * 6：字符串常量池中是不会存储相同内容的字符串的

    * */
    @Test
    public void test1(){
        String s1="abc"; //字面量的定义方式
        String s2="abc";
//        s1="def";
        System.out.println(s1==s2);//true ,比较s1与s2的地址值
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("*****************");
        String s3="abc";
        s3+="def";
        System.out.println(s3);
        System.out.println(s2);
        System.out.println("******************");

        String  s4="abc";
        String s5=  s4.replace("a","m");
        System.out.println(s4); //abc
        System.out.println(s5); //mbc

    }


    /*
    *String 的实例化方式
    * 方式一：通过字面量的方式
    * 方式二：通过new+构造器的方式
    *
    * 面试题：String s=new String("abc")方式创建了对象，在内存中创建了几个对象？2个
    * 一个是堆空间中new结构，一个是char[]对应的常量池中的数据："abc"

    * */
    @Test
    public void test2(){
        //通过字面量的方式：此时的s1与s2的数据javaEE声明在方法区中的字符串常量池中
        String s1="javaEE";
        String s2="javaEE";

        //通过new+构造器的方式：此时的s3与s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值
        String s3=new String("javaEE");
        String s4=new String("javaEE");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false

        System.out.println("*********************");

        Person p1=new Person("Tom",12);
        Person p2=new Person("Tom",12);

        System.out.println(p1.name.equals(p2.name));//true

        System.out.println(p1.name == p2.name);//true

        p1.name="JERY";
        System.out.println(p2.name);


    }
    /*
    *结论：
    * 1：常量与常量的拼接结果是在常量池，且常量池中不会存在相同内容的常量
    * 2：只要其他有一个是变量，结果就在堆中
    * 3:如果拼接的结果调用intern()方法，返回值在常量池中

    *
    *
    * */
    @Test
    public void test3(){
        String s1="javaEE";
        String s2="hadoop";
        String s3="javaEEhadoop";
        String s4="javaEE"+"hadoop";
        String s5=s1+"hadoop";
        String s6="javaEE"+s2;
        String s7=s1+s2;
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s4 == s5);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

        String s8=s5.intern(); //返回值得到的s8使用的常量池中已经存在"javaEEhadoop"
        System.out.println(s3 == s8);//true
        System.out.println("****************");

        String str1="javaEEhadoop";
        String str2="javaEE";
        String str3=s2+"hadoop";
        System.out.println(str1==str3);//false
        final String str4="javaEE";//final 修饰后str4为常量
        String str5=str4+"hadoop";
        System.out.println(str1==str5);//true
    }
}

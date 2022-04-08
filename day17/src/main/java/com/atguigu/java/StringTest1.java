package com.atguigu.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName StringTest1.java
 * @Description String 类与其他结构之间的转换
 * @createTime 2022年04月04日 17:42:00
 */
/*
 * 涉及到String 类与其他结构之间的转换

 * */
public class StringTest1 {
    /*
     * 复习：
     * String 与基本数据类型与包装类之间的转换
     * String -->基本数据类型，包装类：调用包装类的静态方法：parseXxx(str)
     * 基本数据类型，包装类-->String 类型：调用String重载的valueOf(xxx)

     * */
    @Test
    public void test1() {
        String str = "123456";
        int num = Integer.parseInt(str);
        System.out.println(num);
        int num2=123456;
        String str2 = String.valueOf(num2);
        System.out.println(str2);
        //或
        String str3 =num2+"";
        System.out.println(str3);
        System.out.println(str==str3);//false


    }
    /*
    * String 与char[]之间的转换
    * String --->cha[]:调用String 的toCharArray()
    * char[]--->String:调用String 的构造器
    *
    *
    * */
    @Test
    public void test2(){

        String str="abcdef";
        //调用String 的toCharArray()
        char[] toCharArray = str.toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {
            System.out.print(toCharArray[i]+" ");

        }
        System.out.println();

        char[]arr=new char[]{'h','e','l','l','o'};
        //char[]--->String:调用String 的构造器
        String str2 = new String(arr);
        System.out.println(str2);

    }
    /*
    * String 与byte[]之间的转换
    * String -->byte[]:调用String的getBytes()
    * byte[]-->String:调用String的构造器
    *
    * 说明：解码时，要求解码使用的字符集与编码时使用的字符集一致，否则会出现乱码
    *
    *编码：字符串--》字节
     解码：字节--》字符串
    * */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str="abcdef";
        byte[] bytes = str.getBytes();//使用默认的字符集，进行编码
        System.out.println(Arrays.toString(bytes));

        String str2="abc中国";
        byte[] gbks = str2.getBytes("gbk");//使用gbk编码集合
        System.out.println(Arrays.toString(gbks));

        String str3 = new String(bytes);//使用默认的字符集，进行解码
        System.out.println(str3);

        String str4 = new String(gbks);
        System.out.println(str4);//会出现乱码，原因：编码集与解码集不一致

        String gbks2 = new String(gbks, "gbk");
        System.out.println(gbks2);


    }

}

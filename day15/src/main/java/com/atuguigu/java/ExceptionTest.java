package com.atuguigu.java;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ExceptionTest.java
 * @Description Exception
 * @createTime 2022年03月27日 10:51:00
 */
/*
*一：异常体系结构
* java.lang.Throwable
*       Error
*       Exception
*          编译时异常（checked）
*             如：   IOException  ClassNotFoundException
*
*          运行时异常：(unchecked)
*             如：   NullPointerException ArrayIndexOutOfBoundsException
*                   ClassCastException  NumberFormatException
*                   InputMismatchException  ArithmeticException
*
*/
public class ExceptionTest {
    //ArithmeticException
    @Test
    public void test6(){
        int a=10;
        int b=0;
        System.out.println(a/b);
    }



    //InputMismatchException
    @Test
    public void test5(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        int score=scanner.nextInt();
        System.out.println(score);

    }

    //NumberFormatException
    @Test
    public void test4(){
        String str="123";
        str="abc";
        Integer integer=Integer.parseInt(str);

        System.out.println(integer);
    }

    //ClassCastException
    @Test
    public void test3(){
        Object o=new Date();
        String str=(String) o;
        System.out.println(str);
    }

    // IndexOutOfBoundsException
    @Test
    public void test2(){

        //ArrayIndexOutOfBoundsException
//        int [] arr=new int[3];
//        System.out.println(arr[3]);

        //StringIndexOutOfBoundsException
        String str="abcd";
        System.out.println(str.charAt(5));
    }


    //NullPointerException
    @Test
    public void test1(){
//        int [] arr=null;
//        System.out.println(arr[2]);
        String str="abc";
        str=null;
        System.out.println(str.toString());
    }
}

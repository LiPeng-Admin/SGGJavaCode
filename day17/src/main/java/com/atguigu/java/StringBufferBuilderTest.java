package com.atguigu.java;

import org.junit.Test;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName StringBufferBuilderTest.java
 * @Description StringBuffer ,StringBuilder
 * @createTime 2022年04月04日 22:20:00
 */
/*
 *关于String,StringBuffer,StringBuilder 的使用
 *
 *
 *
 * */
public class StringBufferBuilderTest {
    /*
     *String,StringBuffer,StringBuilder 三者的异同
     * 相同点：底层使用char[]存储
     * String:不可变的字符序列
     * StringBuffer:可变的字符序列:线程安全的，效率低
     * StringBuilder:可变的字符序列:线程不安全，效率高
     *
     * 源码分析：String str=new String()//char[] value=new char[0];
     *         String str=new String("abc")//char[] value=new char[]{'a','b','c'}
     *         StringBuffer sb1=new StringBuffer()//char[] value=new char[16],底层创建了一个长度是16的数组
     *         sb1.append('a');//value[0]='a';
     *         sb1.append('b');//value[1]='b';
     *         StringBuffer sb2=new StringBuffer("abc")//char[] value=new char["abc".length()+16]
     *
     * 问题1：  System.out.println(sb2.length()); //3
     * 问题2：扩容问题：如果要添加的数据底层数组盛装不下了，那就需要扩容底层的数组，默认情况下，扩容为原来容量的2倍+2，
     *       同时将原有的数组中的 元素复制到新的数组中
     *
     * 指导意义：开发中建议使用StringBuffer(int capacity)或StringBuilder(int capacity)
     *
     * StringBuilder,StringBuffer,String 三者的执行效率
     * StringBuilder>StringBuffer>String
     *
     *
     * */
    @Test
    public void test1() {

        String str = new String("def");
        String str2 = str + "abc";
        System.out.println(str); //def

        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.setCharAt(0, 'm');
        System.out.println(stringBuffer); //mbc


        StringBuffer stringBuffer1=new StringBuffer("abc");
        System.out.println(stringBuffer1.length());//3

        StringBuffer stringBuffer2=new StringBuffer();
        System.out.println(stringBuffer2.length());//0
    }

    /*StringBuffer 的常用方法：
    *   StringBuffer append(xxx)：提供了很多的 append() 方法，用于进行字符串拼接
        StringBuffer delete(int start,int end)：删除指定位置的内容
        StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
        StringBuffer insert(int offset, xxx)：在指定位置插入xxx
        StringBuffer reverse() ：把当前字符序列逆转

    * */
    @Test
    public void test2(){
        StringBuffer s1=new StringBuffer("abc");
        s1.append(1);
        s1.append("1");
        System.out.println(s1);//abc11
//        s1.delete(1, 3);
//        System.out.println(s1);//a11
//        s1.replace(1,3,"hello");
//        System.out.println(s1);//ahello11
//        s1.insert(1,false);
//        System.out.println(s1);//afalsec11
//        System.out.println(s1.length());//10
//        s1.reverse();
//        System.out.println(s1);
        String str = s1.substring(1, 3);
        System.out.println(str);

    }
}

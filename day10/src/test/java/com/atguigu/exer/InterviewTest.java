package com.atguigu.exer;

import org.junit.Test;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InterviewTest.java
 * @Description TODO
 * @createTime 2022年03月19日 21:38:00
 */
public class InterviewTest {
    @Test
    public void test1(){
        Object o1=true?new Integer(1):new Double(2.0);
        System.out.println(o1); //1.0
    }
    @Test
    public void test2(){
        Object o2;
        if(true){
            o2=new Integer(1);

        }else {
            o2=new Double(2.0);
        }
        System.out.println(o2);//1
    }
    @Test
    public void test3(){
        Integer j=new Integer(1);
        Integer i=new Integer(1);
        System.out.println(i==j); //false
       /*
       * Interger内部定了IntergerCache结构，IntergerCache
       * 中定义了Interger[],保存了从-127-128范围的整数，如果我们使用自动装箱的方式，
       * 给Interger赋值的范围在-128-127范围内时，可以直接数组中的元素，不用再去new了
       * 目的：提高效率
       *
       * */

        Integer m=1;
        Integer n=1;
        System.out.println(m==n); //true

        Integer x=128; //相当于new了Interger对象
        Integer y=128; //相当于new了Interger对象
        System.out.println(x==y);
    }
}

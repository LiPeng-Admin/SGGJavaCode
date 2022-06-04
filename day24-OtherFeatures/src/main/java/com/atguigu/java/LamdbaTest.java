package com.atguigu.java;

import org.junit.Test;

import java.util.Comparator;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/29
 */
/*
 * Lambda表达式：
 *
 * */
public class LamdbaTest {
    @Test
    public void test1() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");

            }
        };
        runnable.run();
        System.out.println("***********");

        Runnable runnable1 = () -> System.out.println("我爱北京故宫");
        runnable1.run();
    }

    @Test
    public void test2() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }


        };
        int compare = comparator.compare(12, 21);
        System.out.println(compare);

        System.out.println("************");
        //Lamdba表达式写法

        Comparator<Integer> comparator1=(i1,i2)->Integer.compare(i1,i2);
        int compare1 = comparator1.compare(20, 13);
        System.out.println(compare1);


        System.out.println("*****************");
        //方法引用
        Comparator<Integer>comparator2=Integer::compare;
        int compare2 = comparator2.compare(30, 21);
        System.out.println(compare2);


    }
}


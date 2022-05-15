package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ForEachTest.java
 * @Description foreach循环
 * @createTime 2022年04月10日 11:07:00
 */
/*
 * jdk5.0新增了foreach循环，用于遍历集合，数组
 *
 *
 * */
public class ForEachTest {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add("Tom");
        collection.add(new String("Jack"));
        collection.add(new Person("Jery", 32));
        collection.add(false);

        //foreach
        //格式：for(集合元素的类型 局部变量：集合对象)
        for (Object o : collection) {
            System.out.println(o);

        }
    }

    @Test
    public void test2() {
        //遍历数组
        // for(数组元素的类型 局部变量：数组对象)
        int[] arr = new int[]{1, 2, 3, 5, 8, 7};
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }

    //练习
    @Test
    public void test3() {
        String[] arr = new String[]{"MM", "MM", "MM"};
        //方式一：
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]="GG" ;
//        }
        for (String str : arr) {
            str = "GG";

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //方式一输出：GG GG GG/方式二输出：MM MM MM

        }
    }
}

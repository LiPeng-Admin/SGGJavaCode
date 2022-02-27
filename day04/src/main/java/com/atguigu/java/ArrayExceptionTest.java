package com.atguigu.java;
/*
数组中的常见异常
1：数组索引越界的异常
2：空指针异常
* */

import java.util.Arrays;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        //1:数组索引越界的异常:ArrayIndexOutOfBoundsException
//        int[] arr=new int[]{1,2,3,4,5,6,9};
//        for(int i=0;i<=arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        //2:空指针异常:NullPointerException
        //情况一：
//        int []arr2=new int[]{1,5,8,0};
//        arr2=null;
//        System.out.println(arr2[0]);
        //情况二：
//        int[][]arr3=new int[4][];
//        System.out.println(arr3[2][1]);

        //情况三：
        String[] strings=new String[]{"AA","BB","CC"};
        strings[0]=null;
        System.out.println(strings[0].toString());

    }



}

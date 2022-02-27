package com.atguigu.exer;
//java.util.Arrays :操作数组的工具类，里面定义了很多操作数组的方法

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //1:判断两个数组是否相等
        int []arr1=new int[]{1,2,3,4};
        int []arr2=new int[]{1,3,2,4};
        boolean isQuals=Arrays.equals(arr1,arr2);
        System.out.println(isQuals);
        //2:输出数组信息
        System.out.println(Arrays.toString(arr1));

        //3:将指定值填充到数组之中
        Arrays.fill(arr2,5);
        System.out.println(Arrays.toString(arr2));

        //4:对数组进行排序
        int [] arr3=new int[]{-3,10,2,4,6,-1,0};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        //5:对排序后的数组进行二分法检索指定的值
        int []arr4=new int[]{-3,-1,0,3,6,9,10};
        int index=Arrays.binarySearch(arr4,6);
        System.out.println(index);
    }
}

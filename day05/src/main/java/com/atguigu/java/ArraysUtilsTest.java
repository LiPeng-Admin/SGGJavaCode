package com.atguigu.java;

public class ArraysUtilsTest {
    public static void main(String[] args) {
        ArraysUtils arraysUtils=new ArraysUtils();
        int [] arr1=new int[]{-9,-3,0,3,9,6,7,10,20,45,23,-3};

        //数组的最大值
        int max=arraysUtils.getMaxValue(arr1);
        System.out.println("数组的最大值为："+max);

        //数组的最小值
        int mix=arraysUtils.getMixValue(arr1);
        System.out.println("数组的最小值为："+mix);

        //数组的总和
        int sum=arraysUtils.getSum(arr1);
        System.out.println("数组的总和："+sum);

        //数组的平均值
        int avg=arraysUtils.getAvg(arr1);
        System.out.println("数组的平均值:"+avg);

        //数组的反转
        arraysUtils.reverse(arr1);
        System.out.println("************");

       //排序后的数组
        arraysUtils.sort(arr1);
        //查找元素：7
        int index=arraysUtils.getIndex(arr1,7);
        System.out.println("查找的元素的索引为："+index);


    }
}

package com.atguigu.java;

/*
* 数组本身是引用数据类型，而数组中的元素可以是任何数据类型，
* 包括基本数据类型和引用数据类型
* 创建的数组对象会在内存中开辟一整块连续的空间
*数组的长度一旦确定，就不能修改
*
* 一维数组的使用
* 1：一维数组的声明和初始化
* 2：如何调用数组的指定位置的元素
* 3：如何获取数组的长度
* 4：如何遍历数组
* 5：数组元素的默认初始化值
* 6：数组的内存解析
* */
public class ArrayTest {
    public static void main(String[] args) {
        //1:一维数组的声明和初始化
        int[] ids; //数组声明
        //1.1 静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids=new int[]{100,101,102,103,104};

        //1.2 动态初始化：数组的初始化和数组元素的赋值操作分开进行
        String [] names=new String[5];
        //简写
        int [] arr={1,2,3,4};


        //2：如何调用数组的指定位置的元素
        //数组的索引是从0开始，到数组长度-1 结束
        names[0]="张学友";
        names[1]="刘德华";
        names[2]="黎明";
        names[3]="郭富城";
        names[4]="周润发";

        // 3：如何获取数组的长度,属性：length
        System.out.println(names.length);

        //4：如何遍历数组
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        /*5：数组元素的默认初始化值
        数组元素是整型：0
        数组元素是浮点型:0.0
        数组元素是char型：0，非'0'
        数组元素是布尔型：false

        数组元素是引用类型：null

        */

        int []ns=new int[5];
        for(int i=0;i<ns.length;i++){
            System.out.println(ns[i]);
        }
        System.out.println("*****************");

        double []db=new double[5];
        for(int i=0;i< db.length;i++){
            System.out.println(db[i]);
        }
        System.out.println("*****************");
        char[] chars=new char[4];
        for(int i=0;i<chars.length;i++){
            System.out.println("----"+chars[i]+"****");
        }
        if(chars[2]==0){
            System.out.println("hello");
        }
        System.out.println("*****************");
        boolean []booleans=new boolean[5];
        for(int i=0;i<booleans.length;i++){
            System.out.println(booleans[i]);
        }
        System.out.println("*****************");
        String []strings=new String[4];
        System.out.println(strings[0]);
        if(strings[1]==null){
            System.out.println("杭州小雨转阴 ");
        }





    }
}

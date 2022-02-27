package com.atguigu.java;
/*
* 方法的形参的传递机制：值传递
* 1：形参：方法定义时，声明在小括号内的参数
*    实参：方法调用时，实际传递给形参的数据
*
* 2：值传递机制
*   如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值
*   如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值
*
*
* */
public class ValueTransferTwoTest {
    public static void main(String[] args) {
        int m=10;
        int n=20;
        System.out.println("m="+m+",n="+n);

        //交换两个变量值的操作
//        int temp=m;
//        m=n;
//        n=temp;
        ValueTransferTwoTest valueTransferTwoTest=new ValueTransferTwoTest();
        valueTransferTwoTest.swap(m,n);
        System.out.println("m="+m+",n="+n); //m=10,n=20

    }
    public void swap(int i,int j){
        int temp=i;
        i=j;
        j=temp;

    }
}

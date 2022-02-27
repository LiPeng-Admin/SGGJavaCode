package com.atguigu.java;

public class ValueTransferThreeTest {
    public static void main(String[] args) {
        Data data=new Data();
        data.m=10;
        data.n=20;
        System.out.println("m的值是："+data.m+",n的值是："+data.n);

        //交换两个变量的值
//        int temp=data.m;
//        data.m= data.n;
//        data.n=temp;

        ValueTransferThreeTest valueTransferThreeTest=new ValueTransferThreeTest();
        valueTransferThreeTest.swap(data);

        System.out.println("m的值是："+data.m+",n的值是："+data.n);



    }

    public void swap(Data data){
        int temp=data.m;
        data.m= data.n;
        data.n=temp;

    }
}
class Data{
    int m;
    int n;
}

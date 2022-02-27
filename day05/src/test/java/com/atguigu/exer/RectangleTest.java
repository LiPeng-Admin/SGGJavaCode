package com.atguigu.exer;
/*
* 1:编写程序，声明一个method 方法，在方法中打印一个10*8的"*"型矩形，在main 方法中调用该方法
* 2：修改上一个程序，在method方法中，除打印一个10*8型矩形外，在计算该矩形的面积，并将其作为
*    方法的返回值，在main 方法中调用该方法，接收返回的面积值并打印
*
* 3:修改上一个程序，在method方法提供两个参数m,n,方法中打印一个m*n 型矩形，
*   并计算该矩形的面积，将其作为方法返回值。在main 方法中调用该方法，接收返回的面积值并打印

* */
public class RectangleTest {
    public static void main(String[] args) {
        Rectanglet rectanglet=new Rectanglet();
//        rectanglet.method();
//       int area= rectanglet.method1();
//        System.out.println("矩形的面积是："+area);
        int area=rectanglet.method2(3,4);
        System.out.println("矩形的面积是："+area);
    }
}

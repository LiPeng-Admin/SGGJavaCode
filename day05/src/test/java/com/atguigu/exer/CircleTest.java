package com.atguigu.exer;
/*
利用面向对象的编程方法，设计类Circle计算圆的面积
* */
public class CircleTest {
    public static void main(String[] args) {
        //创建CirCle 对象
        CirCle cirCle=new CirCle();
        //定义圆的半径
        cirCle.radius=2.0;
//        //调用getArea()方法，输出圆的面积
//        double area=cirCle.getArea();
//        System.out.println(area);
        cirCle.getArea();

    }
}

package com.atguigu.exer;
/*
*另一个类中使用这些公共方法，计算三角形的面积
*
* */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle=new TriAngle();
                triAngle.setBase(2.5);
                triAngle.setHeight(4.0);
        System.out.println("三角形的底边长是："+triAngle.getBase()+",高是："+triAngle.getHeight());

        System.out.println("****************");

        TriAngle triAngle1=new TriAngle(2.8,4.7);
        System.out.println("三角形的底边长是："+triAngle1.getBase()+",高是："+triAngle1.getHeight());

    }
}

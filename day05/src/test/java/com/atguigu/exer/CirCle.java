package com.atguigu.exer;
//圆
public class CirCle {
    //属性
    double radius;
    //方法一
//    public double getArea(){
//       double area= Math.PI*radius*radius;
//       return area;
//    }
    //方法二
    public void getArea(){
        double area=Math.PI*radius*radius;
        System.out.println("圆的面积是："+area);
    }

}

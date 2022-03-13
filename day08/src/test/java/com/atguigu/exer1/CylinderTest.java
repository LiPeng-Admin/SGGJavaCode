package com.atguigu.exer1;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CylinderTest.java
 * @Description TODO
 * @createTime 2022年03月10日 07:05:00
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        cylinder.setRadius(2.1);
        //圆的面积
//        System.out.println("圆的面积为："+cylinder.findArea());

        cylinder.setLength(3.4);
        //圆柱的体积
        System.out.println("圆柱的体积为："+cylinder.findVolume());
        System.out.println("圆柱的表面积为："+cylinder.findArea());


    }
}

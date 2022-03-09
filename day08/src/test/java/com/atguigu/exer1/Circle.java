package com.atguigu.exer1;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Circle.java
 * @Description TODO
 * @createTime 2022年03月10日 06:47:00
 */
public class Circle {
    private double radius;
    public Circle(){
        radius=1.0;

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }
}

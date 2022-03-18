package com.atguigu.exer1;



/**
 * @author admin
 * @version 1.0.0
 * @ClassName Circle.java
 * @Description TODO
 * @createTime 2022年03月18日 08:52:00
 */
public class Circle extends GeometricObject{

    private double radius;
    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}

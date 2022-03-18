package com.atguigu.exer1;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName MyRectangle.java
 * @Description TODO
 * @createTime 2022年03月18日 09:01:00
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(double width,double height,String color, double weight) {
        super(color, weight);
        this.width=width;
        this.height=height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double findArea() {
        return width*height;
    }
}

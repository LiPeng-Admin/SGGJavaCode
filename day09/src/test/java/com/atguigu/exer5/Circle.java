package com.atguigu.exer5;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Circle.java
 * @Description TODO
 * @createTime 2022年03月19日 17:23:00
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        super();
        radius=1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius,String color, double weight ) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //圆的面积
    public double findArea(){
        return Math.PI*radius*radius;
    }
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o instanceof Circle){
            Circle circle=(Circle) o;
            return this.radius==circle.radius;

        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

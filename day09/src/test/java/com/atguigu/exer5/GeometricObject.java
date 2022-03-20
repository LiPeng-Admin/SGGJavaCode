package com.atguigu.exer5;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName GeometricObject.java
 * @Description TODO
 * @createTime 2022年03月19日 17:17:00
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
//        super();
        this.color="white";
        this.weight=1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

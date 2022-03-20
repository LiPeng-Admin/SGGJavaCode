package com.atguigu.exer1;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Cylinder.java
 * @Description TODO
 * @createTime 2022年03月10日 06:55:00
 */
public class Cylinder extends Circle{
    private double length; //圆柱的高度
    public Cylinder(){
        length=1.0;

    }
    public void setLength(double length){
        this.length=length;

    }
    public double getLength(){
        return length;
    }
    public double findVolume(){

//        return Math.PI*getRadius()*getRadius()*length;
        return super.findArea()*getLength();

    }

    @Override
    public double findArea() { //返回圆的表面积
        return Math.PI*getRadius()*getRadius()*2+2*Math.PI*getRadius()*getLength();
    }
}
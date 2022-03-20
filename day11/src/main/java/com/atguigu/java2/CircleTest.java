package com.atguigu.java2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CircleTest.java
 * @Description static 关键字的应用
 * @createTime 2022年03月20日 17:32:00
 */
//static 关键字的应用
public class CircleTest {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle();
        System.out.println("c1的id:"+c1.getId());
        System.out.println("c2的id:"+c2.getId());
        System.out.println("圆的个数为："+Circle.getTotal());
        Circle c3=new Circle(2.3);
        System.out.println("c3的id:"+c3.getId());
        System.out.println("圆的个数为："+Circle.getTotal());
        System.out.println("圆的面积："+c3.findArea());



    }
}
class Circle{
    private double radius;
    private int id;

    public Circle(){
        id=init++;
        total++;
    }
    public Circle(double radius){
        this();
//        id=init++;
//        total++;
        this.radius=radius;
    }

    private static int total; //记录创建圆的个数
    private static int init=1001;

    public double findArea(){
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

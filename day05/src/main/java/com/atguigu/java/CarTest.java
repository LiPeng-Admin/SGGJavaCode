package com.atguigu.java;

public class CarTest {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();
        c1.color="blue";
        c1.show();//blue,4
        c2.show(); //red,4
    }
}

package com.atguigu.exer5;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CricleTest.java
 * @Description TODO
 * @createTime 2022年03月19日 17:35:00
 */
public class CricleTest {
    public static void main(String[] args) {
        Circle circle=new Circle(2.3);
        Circle circle1=new Circle(2.3,"white",2.0);
        System.out.println("颜色是否相同："+circle.getColor().equals(circle1.getColor()));
        System.out.println("半径是否相同："+circle.equals(circle1));
        System.out.println("cricle半径为："+circle.toString());
        System.out.println("cricle1半径为："+circle1.toString());
    }
}

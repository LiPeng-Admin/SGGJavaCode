package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName KidsTest.java
 * @Description TODO
 * @createTime 2022年03月08日 08:52:00
 */
public class KidsTest {
    public static void main(String[] args) {
//        ManKind manKind=new ManKind();
        Kids  kids=new Kids(12);
        kids.printAge();
        kids.setSalary(0);
        kids.setSex(1);
        System.out.println(kids.getSalary());
        System.out.println(kids.getSex());
        kids.employeed();
        kids.manOrWoman();


    }

}

package com.atguigu.java;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Woman.java
 * @Description TODO
 * @createTime 2022年03月13日 10:29:00
 */
public class Woman extends Person{
    boolean isBeauty;
    public void goShopping(){
        System.out.println("女人喜欢购物");
    }

    @Override
    public void eat() {
        System.out.println("女人会少吃点米饭");
    }

    @Override
    public void walk() {
        System.out.println("女人走路慢慢悠悠");
    }
}

package com.atguigu.java2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Order.java
 * @Description TODO
 * @createTime 2022年03月12日 11:53:00
 */

/*
*
* 体会4种不同的权限修饰
*
*
* */
public class Order {
    //设置属性权限
    private int orderPrivate;
    int orderDefault;
    protected  int orderProtected;
    public int orderPublic;

    //设置方法
    private void methodPrivate(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;

    }
    void methodDefault(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;

    }
    protected void methodProtected(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;

    }
    public  void methodPublic(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;


    }



}

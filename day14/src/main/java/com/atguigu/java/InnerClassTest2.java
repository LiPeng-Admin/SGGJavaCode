package com.atguigu.java;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InnerClassTest2.java
 * @Description TODO
 * @createTime 2022年03月27日 10:01:00
 */
/*
 *在局部内部类的方法中（如show）如果调用局部内部类所声明的方法（如method）中的
 * 局部变量（如num）,要求此局部变量声明为final的
 */

public class InnerClassTest2 {
    int num=10; //此变量num 声明的是final,不能重新赋值，final省略
    public void method(){
        class AA{
            public void show(){
                System.out.println(num);
            }

        }
    }
}

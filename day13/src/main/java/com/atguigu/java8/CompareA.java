package com.atguigu.java8;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CompareA.java
 * @Description TODO
 * @createTime 2022年03月26日 16:40:00
 */
/*
*jdk8及以后：除了定义全局常量及抽象方法外，还可以定义静态方法和默认方法（略）
*
*
* */
public interface CompareA {
    //静态方法
    public static void method1(){
        System.out.println("base:杭州");

    }
    //默认方法
  public default void method2(){
        System.out.println("base:上海");

    }
     default void method3(){
        System.out.println("base:南京");
    }
}

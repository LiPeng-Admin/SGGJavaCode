package com.atguigu.java;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InnerClassTest1.java
 * @Description TODO
 * @createTime 2022年03月26日 22:12:00
 */
public class InnerClassTest1 {
    //开发中常使用：返回一个实现了Comparable接口的类的对象

    public Comparable getComparable(){

        //方式一：
        //创建一个实现了Comparable接口的类：局部内部类
//        class MyComparable implements  Comparable{
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return  new MyComparable();
        //方式二：
        return new Comparable() {
            public int compareTo(Object o) {
                return 0;
            }
        };

    }
}

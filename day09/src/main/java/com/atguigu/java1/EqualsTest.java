package com.atguigu.java1;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName EqualsTest.java
 * @Description TODO
 * @createTime 2022年03月18日 22:26:00
 */
/*

面试题：== 与equals（）区别
一：回顾 == 的使用
1：可以使用在基本数据类型变量和引用数据类型变量中
2：如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等（不一定类型要相同）
   如果比较的是引用数据类型变量：比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体

二：equals()方法的使用
1：是一个方法，而非运算符
2：只能使用引用数据类型
3:Object 类中equals（）的定义：
    public boolean equals(Object obj) {
        return (this == obj);
    }
    说明：Object类中定义的equals()方法与== 的作用是相同的，即两个引用是否指向同一个对象实体

4：对于如String,Date,File,包装类等都重写了Object类中的equals()方法，重写以后，比较的不是两个引用
    的地址是否相同，而是比较两个对象的"实体内容"是否相同

5：通常情况下，我们自定义的类如果使用equals()的话，也通常比较两个对象的"实体内容"是否相同，
    那么，我们需要重写Object 类中equals()方法

* */
public class EqualsTest {
    public static void main(String[] args) {
        //基本数据类型
        int i=10;
        int j=10;
        double d=10.0;
        System.out.println(i==j);//true
        System.out.println(j==d); //true
        char c=10;
        System.out.println(d==c); //true
        //引用类型
        Customer customer=new Customer("Tom",28);
        Customer customer1=new Customer("Tom",28);
        System.out.println(customer==customer1); //false
        System.out.println("*********************");
        System.out.println(customer.equals(customer1)); //false--->true
        String str=new String();
        String string=new String();
        System.out.println(str.equals(string)); //true

    }


}

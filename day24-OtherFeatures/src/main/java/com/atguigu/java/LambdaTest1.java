package com.atguigu.java;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/29
 */
/*
 * Lambda 表达式的使用
 * 1：举例：（o1,o2）->Integer(o1,o2)
 * 2:格式：
 *       ->lanbda操作符或者箭头操作符
 *       ->左边：lambda形参列表（其实就是接口中的抽象方法的形参列表）
 *       ->右边：lambda体（其实就是重写的抽象方法的方法体）
 *
 * 3：lambda 表达式的使用（分为6种情况介绍）
 *  总结：
 *      ->左边:Lambda形参列表的参数类型可以省略（类型推断），如果lambda形参列表只有一个参数时，其一对（）可以省略
 *      ->右边：lambda体应该使用{}包裹，如果lambda体只有一条执行语句（可能是return语句），可以省略一对{}和return 关键字
 *
 *
 * 4:Lambda表达式的本质：作为函数式接口的实例
 *
 * 5：如果一个接口中，只声明了一个抽象方法，则此接口称之为函数式接口
 *
 *
 *
 * */
public class LambdaTest1 {
    //语法格式一：无参，无返回值
    @Test
    public void test1() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京");
            }
        };
        runnable.run();
        System.out.println("***********");

        Runnable runnable1 = () -> {
            System.out.println("我爱北京1");
        };
        runnable1.run();

    }

    //语法格式二：Lambda需要一个参数，但是没有返回值
    @Test
    public void test2() {
        Consumer<String> consumer = new Consumer<String>() {


            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Tom");
        System.out.println("***********");
        Consumer<String> consumer1 = (String s) -> {
            System.out.println(s);

        };
        consumer1.accept("Kiss");
    }

    //语法格式三：数据类型可以省略（若只有 一个形参是，小括号可以省略），因为可由编译器推断得出，称为"类型推断"
    @Test
    public void test3() {
        Consumer<String> consumer = s -> {
            System.out.println("类型推断");
        };
        consumer.accept("推断正确");

    }

    //语法格式四：Lambda需要两个或两个以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test4() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        int compare = comparator.compare(12, 21);
        System.out.println(compare);

        System.out.println("***********");
        Comparator<Integer> comparator1 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);

        };
        int compare1 = comparator.compare(22, 21);
        System.out.println(compare1);

    }
    //语法格式五：当Lamdba体只有一条语句时，return与大括号若有，可以省略
    @Test
    public void test5(){
        Comparator<Integer> comparator=(o1, o2) ->
                o1.compareTo(o2);
        int compare = comparator.compare(20, 10);
        System.out.println(compare);

    }
}

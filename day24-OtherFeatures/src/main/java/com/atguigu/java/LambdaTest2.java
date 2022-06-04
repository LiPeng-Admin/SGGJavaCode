package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/29
 * <p>
 * Java内置的4大核心函数式接口
 * 消费型接口 Comsumer<T>    void accept(T t)
 * 供给型接口 Supplier<T>    T get()
 * 函数型接口 Function<T,R>  R apply(T t)
 * 断定型接口 Predicate<T>   boolean test(T t)
 */
public class LambdaTest2 {
    @Test
    public void test1() {
        happyTime(500.0, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("学习太累了，去学校买点水喝:" + aDouble);
            }
        });
        System.out.println("**********");
        happyTime(400.0, aDouble ->
                System.out.println("学习太累了，去学校买点水喝:" + aDouble));

    }

    public void happyTime(Double money, Consumer<Double> consumer) {
        consumer.accept(money);

    }

    @Test
    public void test2() {
        List<String>list= Arrays.asList("北京","天津","南京","天津湖");

        List<String> filterString = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterString);
        System.out.println("***********");

        List<String>filterString2=filterString(list,s -> s.contains("津"));
        System.out.println(filterString2);

    }

    //根据给定的规则，过滤集合中的字符串，此规则由Predicate方法决定
    public List<String> filterString(List<String> list, Predicate<String> predicate) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)) {
                arrayList.add(s);
            }

        }
        return arrayList;

    }
}

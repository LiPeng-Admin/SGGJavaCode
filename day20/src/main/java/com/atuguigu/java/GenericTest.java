package com.atuguigu.java;

import org.junit.Test;

import java.util.*;

/*
 * 泛型的使用
 * 1：jdk5.0新增的特性
 * 2:在集合中使用泛型：
 * 总结：
 * ①集合接口或集合类在jdk5.0 时都修改为带泛型的结构
 *
 * ②实例化集合类时，可以指明具体的泛型类型
 *
   ③ 指明完以后，在集合类或接口中凡是定义类或接口时，内部结构（比如：方法、构造器、属性等）使用到类的泛型的位置，都指定为实例化的泛型类型。
   *     比如：add(E e) --->实例化以后：add(Integer e)
   *
   ④ 注意点：泛型的类型必须是类，不能是基本数据类型。需要用到基本数据类型的位置，拿包装类替换
   *
   ⑤ 如果实例化时，没有指明泛型的类型。默认类型为 java.lang.Object 类型。
   *
  3：如何自定义泛型结构：泛型类，泛型接口；泛型方法
  * 1：
  *


 *
 *
 * */
public class GenericTest {
    //在集合中使用泛型之前的情况
    @Test
    public void test1() {
        ArrayList arrayList = new ArrayList();
        //存放学生的成绩
        arrayList.add(56);
        arrayList.add(60);
        arrayList.add(76);
        arrayList.add(80);
        arrayList.add(91);
        //问题一：类型不安全
//        arrayList.add("Tom");
        for (Object score : arrayList) {
            //强转时，可能出现ClassCastException
            int stuScore = (int) score;
            System.out.println(stuScore);

        }

    }

    //在集合中使用泛型的情况:以ArrayList为例
    @Test
    public void test2() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(78);
        integers.add(89);
        integers.add(58);
        integers.add(65);
        //编译时就会进行类型检查，保证数据的安全
//        integers.add("Tom");
        //方式一：
//        for (Integer score : integers) {
//            //避免了强转操作
//            int stuIntegers = score;
//            System.out.println(stuIntegers);
//
//        }
        //方式二：
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //在集合中使用泛型的情况:以HashMap为例
    @Test
    public void test3() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tom", 78);
        map.put("Jerry", 88);
        map.put("Jack", 68);
        map.put("Jason", 56);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> e = iterator.next();
            System.out.println(e.getKey() + "->" + e.getValue());

        }


    }

}

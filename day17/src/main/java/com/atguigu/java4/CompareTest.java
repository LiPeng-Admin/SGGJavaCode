package com.atguigu.java4;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CompareTest.java
 * @Description Java中的比较器
 * @createTime 2022年04月07日 21:02:00
 */
/*
一：说明：java中的对象，正常情况下，只能进行比较：==或！=，不能使用>，<
但是在开发场景中，我们需要对多个对象进行排序，言外之意，就需要比较对象的大小，
如何实现？使用两个接口的任何一个：Comparable,Comparator
二：Comparable接口的使用：
*
三：Comparator接口的使用
* */
public class CompareTest {
    /*
     * Comparable 接口的使用举例:自然排序
     * 1：如String,包装类等实现了Comparable接口，重写了compareTo(obj)方法，给出了比较两个对象大小的方式
     * 2：像 String 或包装类重写 compareTo() 方法以后，进行了从小到大的排列
     * 3：：重写compareTo(obj)的规则：

     *  如果当前对象this大于形参对象obj，则返回正整数，
     *  如果当前对象this小于形参对象obj，则返回负整数，
     *  如果当前对象this等于形参对象obj，则返回零
     *
     * 4:对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，重写compareTo(obj)方法
     *   在compareTo(obj)方法中指明如何排序
     *
     *
     * */
    @Test
    public void test1() {
        String[] str = new String[]{"AA", "CC", "KK", "MM", "LL", "ZZ", "BB"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }

    @Test
    public void test2() {
        Goods[] goods = new Goods[5];
        goods[0] = new Goods("lenovoMouse", 34);
        goods[1] = new Goods("huaweiMouse", 24);
        goods[2] = new Goods("xiaomiMouse", 54);
        goods[3] = new Goods("dellMouse", 25);
        goods[4] = new Goods("hongjiMouse", 24);

        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));

    }

    /*
     *Comparator接口的使用：定制排序
     * 1：背景：
     * 当元素的类型没有实现java.lang.Comparable接口而又不方便修改代码
     * 或者实现了java.lang.Comparaable接口的排序规则不适合当前的操作
     * 那么可以考虑使用Comparator的对象来进行排序
     * 2：重写compare（Object o1,Object o2）方法，比较o1,与o2的大小：
     * 如果方法返回正整数，则表示o1大于o2
     * 如果返回负数，表示o1小于o2
     * 如果返回0，表示o1等于o2

     * */
    @Test
    public void test3() {
        String[] str = new String[]{"AA", "CC", "DD", "BB", "EE", "FF", "MM", "JJ"};
        Arrays.sort(str, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                //按照字符串从大到小排列
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }

                throw new RuntimeException("传入的数据类型不一致！");
            }
        });
        System.out.println(Arrays.toString(str));
    }

    @Test
    public void test4() {

        Goods[] goods = new Goods[6];
        goods[0] = new Goods("lenovoMouse", 34);
        goods[1] = new Goods("huaweiMouse", 24);
        goods[2] = new Goods("xiaomiMouse", 54);
        goods[3] = new Goods("dellMouse", 25);
        goods[4] = new Goods("hongjiMouse", 24);
        goods[5] = new Goods("xiaomiMouse", 64);

        Arrays.sort(goods, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {

                //指明商品比较大小的方式:照产品名称从低到高排序,再照价格从高到低排序

                if (o1 instanceof Goods && o2 instanceof Goods) {
                    Goods goods1 = (Goods) o1;
                    Goods goods2 = (Goods) o2;
                    if (goods1.getName().equals(goods2.getName())) {

                        return -Double.compare(goods1.getPrice(), goods2.getPrice());

                    } else {
                        return goods1.getName().compareTo(goods2.getName());
                    }
                }
                throw new RuntimeException("传入的数据类型不一致！");
            }
        });
        System.out.println(Arrays.toString(goods));
    }
}





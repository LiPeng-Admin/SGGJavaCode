package com.atguigu.java2;

import org.junit.Test;

import java.util.*;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CollectionsTest.java
 * @Description Collections
 * @createTime 2022年04月16日 16:40:00
 */
/*
Collections:
* 作用：Collections是一个操作Set、Lit和Map等集合的工具类
       Collections中提供了一系列静态的方法对集合元素进行排序、査询和修改等操作，还提供了对集合对象设置不可变、对集合对象实现同步控制等方法
  常用方法：
        排序操作：
        reverse(List)：反转 List 中元素的顺序
        shuffle(List)：对 List 集合元素进行随机排序
        sort(List)：根据元素的自然顺序对指定 List 集合元素升序排序
        sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
        swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换

        查找、替换：
        Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
        Object min(Collection)
        Object min(Collection，Comparator)
        int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
        void copy(List dest,List src)：将src中的内容复制到dest中
        boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所旧值
        同步控制：
        Collections 类中提供了多个 synchronizedXxx() 方法，该方法可使将指定集合包装成线程同步的集合，
        从而可以解决多线程并发访问集合时的线程安全问题

* */
public class CollectionsTest {
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(99);
        list.add(60);
        list.add(-10);
        list.add(0);
        list.add(50);
        list.add(123);
        System.out.println(list);
        // reverse(List)：反转 List 中元素的顺序
//        Collections.reverse(list);

//       shuffle(List)：对 List 集合元素进行随机排序
//        Collections.shuffle(list);

        // sort(List)：根据元素的自然顺序对指定 List 集合元素升序排序
//        Collections.sort(list);

        //swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
//        Collections.swap(list,1,2);

        // int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
        int frequency = Collections.frequency(list, 123);
        System.out.println(frequency);


//        System.out.println(list);


    }
    @Test
    public void test2(){
        //void copy(List dest,List src)：将src中的内容复制到dest中
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(45);
        list.add(20);
        list.add(-20);
        //会报异常：IndexOutOfBoundsException

//        List  dest=new ArrayList();
//        Collections.copy(dest,list);
//        System.out.println(dest);

        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());
        Collections.copy(dest,list);
        System.out.println(dest);


    }
    @Test
    public void test3(){
//        Collections 类中提供了多个 synchronizedXxx() 方法，该方法可使将指定集合包装成线程同步的集合，
//        从而可以解决多线程并发访问集合时的线程安全问题
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(45);
        list.add(20);


        List list1 = Collections.synchronizedList(list);
        System.out.println(list1);

    }
}

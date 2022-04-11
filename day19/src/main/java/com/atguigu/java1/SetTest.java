package com.atguigu.java1;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SetTest.java
 * @Description Set框架结构
 * @createTime 2022年04月10日 21:28:00
 */
/*
* Set框架结构
*   |---Collection接口：单列集合，用来存储一个一个对象
 *       |--Set接口：存储无序，不可重复的数据    ---集合
 *           |--HashSet：Set接口的主要实现类；线程不安全的；可以存储null值
                |--LinkedSet：作为HashSet的子类；遍历其内部数据时，可以按照添加的顺序遍历
             |-- TreeSet：可以按照添加对象的指定属性，进行排序
*1：Set接口没有额外定义新的方法，使用的都是Collection 中声明过的方法
*
*
* */
public class SetTest {
    /*
    * 一：Set:存储无序，不可重复的数据
    * 以HashSet为例说明：
    * 1：无序性：不等于随机性，存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值
    * 2：不可重复:保证添加的元素按照equals()判断，不能返回true,即：相同元素只能添加一个
    *二：添加元素的过程：以HashSet为例
    * */
    @Test
    public void test1(){
        Set set=new HashSet();
        set.add(123);
        set.add(456);
        set.add("AA");
        set.add(new User("Tom",18));
        set.add(new User("Tom",18));
        set.add(129);
        set.add(456);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

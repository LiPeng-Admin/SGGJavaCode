package com.atguigu.java1;

import org.junit.Test;

import java.util.*;

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
                *            对于频繁的操作，LinkedHashSet 效率高于HashSet
             |-- TreeSet：可以按照添加对象的指定属性，进行排序

* 1： Set接口没有额外定义新的方法，使用的都是Collection 中声明过的方法
* 2： 要求：向Set 中添加的数据，其所在的类一定要重写hashCode()和equals()
*     要求：重写的hashCode()和equals()尽可能保持一致性：相等的对象必须具有相等的散列码

* */
public class SetTest {
    /*
   一：Set:存储无序，不可重复的数据
    * 以HashSet为例说明：
    * 1：无序性：不等于随机性，存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值
    * 2：不可重复:保证添加的元素按照equals()判断，不能返回true,即：相同元素只能添加一个


    二：添加元素的过程：以HashSet为例
    * 我们向HashSet中添加元素a,首先调用元素a所在类的hashCode（）方法，计算元素a 的哈希值，此
    * 哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置（即为：索引位置）,判断数组此位置上
    * 是否已经有元素
    *   如果此位置没有其他元素，则元素a添加成功  ---》情况一
    *   如果此位置上有其他元素b(或以链表形式存在的多个元素)，则比较元素a与元素b 的hash值：
    *       如果hash值不相同，则元素a添加成功  ---》情况二
    *       如果hash值相同，进而需要调用元素a所在类的equals（）方法：
    *           equals()返回true，元素a 添加失败
    *           equals()返回false,则元素a 添加成功  --》情况三
    *
    * 对于添加成功的情况2和情况3而言，元素a与已经存在指定位置上数据一链表的形式存储
    *
    * HashSet底层：数组+链表的结构
    *
    *
    * */
    @Test
    public void test1() {
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add("AA");
        set.add(new User("Tom", 18));
        set.add(new User("Tom", 18));
        set.add(129);
        set.add(456);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //LinkedHashSet的使用
    //LinkedHashSet 作为HashSet 的子类，再添加数据的同时，每个数据还维护了两个引用，记录此数据的
    //前一个数据 和后一个数据
    //优点：对于频繁的操作，LinkedHashSet 效率高于HashSet
    @Test
    public void test2() {
        Set set = new LinkedHashSet();
        set.add(123);
        set.add(456);
        set.add("789");
        set.add(new User("Jery", 12));
        set.add(new User("Jery", 12));
        set.add(false);
        set.add("AA");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //TreeSet的使用
    /*
    1:向TreeSet 中添加数据，要求是相同类的对象
    2：两种排序方式：自然排序，定制排序
    3：自然排序：比较两个对象是否相同的标准为：compareTo()返回是0，不再是equals()
    4: 定制排序：比较两个对象是否相同的标准为：compare(),返回0，不在是equals()


    *
    * */
    @Test
    public void test3() {
        TreeSet treeSet = new TreeSet();
        //举例一：
//        treeSet.add(123);
//        treeSet.add(456);
//        treeSet.add(789);
//        treeSet.add(-123);
//        treeSet.add(-456);

        //举例二：
        treeSet.add(new User("Tom", 15));
        treeSet.add(new User("Jameson", 18));
        treeSet.add(new User("Jack", 25));
        treeSet.add(new User("Jim", 35));
        treeSet.add(new User("Mark", 5));
        treeSet.add(new User("Jameson", 15));


        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        treeSet.add("789");//添加数据，要求是相同类的对象: ClassCastException
    }

    @Test
    public void test4() {

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){

                    return Integer.compare(((User) o1).getAge(),((User) o2).getAge());
                }
                throw new RuntimeException("输入的数据不合理");
            }
        };

        TreeSet treeSet = new TreeSet(comparator);
        treeSet.add(new User("Tom", 25));
        treeSet.add(new User("Jack", 28));
        treeSet.add(new User("Jim", 28));
        treeSet.add(new User("Jim", 30));
        treeSet.add(new User("Mark", 17));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

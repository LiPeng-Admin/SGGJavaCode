package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName listTest.java
 * @Description Collection子接口之一：List
 * @createTime 2022年04月10日 15:27:00
 */
/*1；List接口框架：
*  |---Collection接口：单列集合，用来存储一个一个对象
 *       |--List接口：存储有序，可重复的数据     --动态数组,替换原有的数组
 *           |--ArrayList：作为list接口的主要实现类(jdk 1.2)；线程不安全，效率高；底层使用Object[] elementData存储
 *           |--LinkedList:对于频繁的插入，删除操作，使用此类比ArrayList效率高；底层使用双向链表存储
 *           |--Vector:作为list接口的古老实现类（jdk 1.0）：线程安全，效率低;底层使用Object[] elementData存储
 *：
 * 2：ArrayList 的源码分析：
 *   jdk 7情况
 *   ArrayList list=new ArrayLit();//底层创建了长度是10的Object[]数组elementData
 *            list.add(123);//elementData[0]=new Integer(123)
 *            ...
 *            list.add(11);//如果此次添加的导致底层elementData数组容量不够，则扩容，
 *            默认情况下，扩容为原来的1.5倍，同时需要将原有的数组中的元素复制到新的数组中
 *
 *            结论：建议开发使用带参的构造器：ArrayList list=new ArrayList(int initialCapacity)
 *   jdk 8情况：
 *   ArrayList list=new ArrayLit();//底层Object[] elementData 初始化为{}，没有创建了长度是10的Object[]数组elementData
 *             list.ad(123);//第一次调用add()时，底层才创建了长度为10的数组，并将数据123添加到elementData[0]中
 *             ...
 *            后续的添加和扩容与jdk7相同
 *
 *            结论：jdk7中的ArrayList 的对象的创建类似于单例模式的饿汉式，jdk8中的ArrayList的对象的创建
 *                  类似于单例模式的懒汉式，延迟了数组的创建，节省了内存
 *
 *3：LinkedList
 *   LinkedList linkedList=new LinkedList();内部声明了Node类型的first和last属性，默认值为null
 *              linkedList.add(123);//将123封装到Node 中，创建了Node 对象
 *
 *              其中，Node定义为：体现为LinkedList的双向链表的说法
             *    private static class Node<E> {
                        E item;
                        Node<E> next;
                        Node<E> prev;

                        Node(Node<E> prev, E element, Node<E> next) {
                            this.item = element;
                            this.next = next;
                            this.prev = prev;
                        }
                    }
                    *
  4：Vector的源码分析：jdk7与jdk8中通过Vector()构造器创建对象时，底层都创建了长度为10的数组
  *                 在扩容方面，默认扩容为原来的数组长度的2倍
  *
 * 面试题：ArrayList,LinkList,Vector三者异同：
 * 相同点：三个类都实现了List接口，存储数据的特点相同：存储有序，可重复的数据
 * 不同点： |--ArrayList：作为list接口的主要实现类(jdk 1.2)；线程不安全，效率高；底层使用Object[] elementData存储
 *         |--LinkedList:对于频繁的插入，删除操作，使用此类比ArrayList效率高；底层使用双向链表存储
 *         |--Vector:作为list接口的古老实现类（jdk 1.0）：线程安全，效率低;底层使用Object[] elementData存储
 *
*
*
* 5：list接口的常用方法
*       List除了从 Collection集合继承的方法外，List集合里添加了一些根据索引来操作集合元素的方法。

        void add(int index, Object ele):在index位置插入ele元素
        boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        Object get(int index):获取指定index位置的元素
        int indexOf(Object obj):返回obj在集合中首次出现的位置
        int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        Object remove(int index):移除指定index位置的元素，并返回此元素
        Object set(int index, Object ele):设置指定index位置的元素为ele
        List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的左闭右开子集合
        *
     常用方法总结：
     * 增：add(Object e)
     * 删:remove(int index)/remove(Object o)
     * 改:set(int index, Object ele)
     * 查:get(int index)
     * 插:add(int index, Object ele)
     * 长度:size()
     * 遍历:
         * 1:Iterator迭代器，
         * 2：foreach,
         * 3:普通循环

。
* */
public class listTest {
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(new Person("Tom", 28));
        list.add(false);
        list.add("Jack");
        list.add(456);

        System.out.println(list);
        //void add(int index, Object ele):在index位置插入ele元素
        list.add(1, "BB");
        System.out.println(list);
        List list1 = Arrays.asList(1, 2, 3);

        //boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        list.addAll(list1);
        System.out.println(list.size());//9

        // Object get(int index):获取指定index位置的元素
        System.out.println(list.get(1));//BB

        //int indexOf(Object obj):返回obj在集合中首次出现的位置,如果不存在，返回-1
        int i = list.indexOf(456);
        System.out.println(i);//2

        // int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        int i1 = list.lastIndexOf(456);
        System.out.println(i1);//6

        // Object remove(int index):移除指定index位置的元素，并返回此元素
        Object obj = list.remove(4);
        System.out.println(obj); //false
        System.out.println(list);

        // Object set(int index, Object ele):设置指定index位置的元素为ele
        list.set(0, "1234");
        System.out.println(list);

        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的左闭右开子集合
        List list2 = list.subList(0, 2);
        System.out.println(list2);//[1234, BB]
        System.out.println(list);
        System.out.println("*******************");

        //遍历
        //方式一：Iterator迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //方式二：foreach
        for (Object o : list) {
            System.out.print(o + " ");

        }
        System.out.println();
        //方式三：普通for 循环
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j)+" ");

        }
    }
}

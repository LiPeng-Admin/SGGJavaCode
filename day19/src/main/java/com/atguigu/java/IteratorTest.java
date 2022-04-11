package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName IteratorTest.java
 * @Description Iterator 迭代器
 * @createTime 2022年04月10日 10:43:00
 */
public class IteratorTest {
    /*
     * 集合元素的遍历操作，使用迭代器Iterator接口
     *
     * Iterator对象称为迭代器(设计模式的一种)，主要用于遍历 Collection 集合中的元素。
     *  GOF给迭代器模式的定义为：提供一种方法访问一个容器(container)对象中各个元素，而又不需暴露该对象的内部细节。
     *  迭代器模式，就是为容器而生。
     *
     * 1:内部的方法：hasNext()和next()
     * 2:集合对象每次调用iterator()方法都得一个全新的迭代器对象，
     *      默认游标都在集合的第一个元素之前
     * 3:Iterator可以删除集合的元素，但是是遍历过程中通过迭代器对象的
     * remove 方法，不是集合对象的remove方法
     *
     * */
    @Test
    public void test1(){
        Collection collection=new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add("789");
        collection.add(new String("Tom"));
        collection.add(new Person("Jery",30));
        collection.add(false);

        Iterator iterator = collection.iterator();
        //方式一：
        //next():
//        System.out.println(iterator.next());//123
//        System.out.println(iterator.next());//456
//        System.out.println(iterator.next());//789
//        System.out.println(iterator.next());//Tom
//        System.out.println(iterator.next());//Person{name='Jery', age=30}
//        System.out.println(iterator.next());//false
//
//        //报异常:.NoSuchElementException
//        System.out.println(iterator.next());

        //方式二：不推荐
        for (int i = 0; i <collection.size() ; i++) {
            System.out.println(iterator.next());

        }
        //方式三：推荐
        //hasNext():判断是否还下一个元素
        while (iterator.hasNext()){

            //①指针下移 ②将下移以后集合位置上的元素返回
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test2(){

        Collection collection=new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add("Tom");
        collection.add(new String("Jery"));
        collection.add(new Person("Jack",31));
        collection.add(false);

        //删除集合中"Tom"
        //如果还未调用 next() 或在上一次调用 next() 方法之后已经调用了 remove() 方法，
        // 再调用 remove 都会报 IllegalStateException。
        //内部定义了 remove(),可以在遍历的时候，删除集合中的元素。此方法不同于集合直接调用remove()
        Iterator iterator = collection.iterator();
       while (iterator.hasNext()){
           Object obj = iterator.next();
           if("Tom".equals(obj)){
               iterator.remove();
           }
       }
       iterator=collection.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }

    }
}

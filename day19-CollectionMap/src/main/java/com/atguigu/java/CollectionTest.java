package com.atguigu.java;

import org.junit.Test;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CollectionTest.java
 * @Description java 集合框架
 * @createTime 2022年04月09日 16:21:00
 */
/*
* 一：集合框架的概述
* 1：集合，数组都是对多个数据进行存储操作的结构，简称java容器
*  说明：此时的存储，主要指的是内存层面的存储，不涉及持久化的存储
* 2：数组在存储多个数据方面的特点
* 1：一旦初始化以后，其长度就确定了
* 2：数组一旦定义好，其元素的类型也就确定了，我们也就只能操作指定类型的数据了
*                 如：String [] arr;int[] arr1;Object[] arr2;
*
*2：数组在存储多个数据方面的缺点：
    * 1：一旦初始化以后，其长度就不可修改
    * 2：数组中提供的方法非常有限，对于添加，删除，插入数据等操作，非常不便，同时效率不高
    * 3：获取数组中实际元素的个数需求，数组中没有现成的属性或方法可用
    * 4：数组中的数据的特点：有序，可重复的，对于无序，不能重复的需求，不能满足
    *
    *
二：集合框架
*   |---Collection接口：单列集合，用来存储一个一个对象
*       |--List接口：存储有序，可重复的数据     --动态数组
*           |--ArrayList,LinkedList,Vector
*       |--Set接口：存储无序，不可重复的数据    ---集合
*           |--HashSet,LinkedSet,TreeSet
*
*   |---Map 接口：双列集合，用来存储一对（key-value）一对的数据    ---类似函数y=f(x)
*       |--HashMap,LinkedMap,TreeMap,Hashtable,Properties
*
* 三：Collection 接口中方法的使用
*
*   3.1:向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals()
* */
public class CollectionTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        //1：add(Object e):将元素e到coll集合中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());

        //2：size():获取添加元素的个数

        System.out.println(coll.size());//4
        // 3：addAll():将coll1集合中的元素添加到当前集合中
        Collection collection = new ArrayList();
        collection.add("CC");
        collection.add(456);
        coll.addAll(collection);
        System.out.println(coll.size());
        System.out.println(coll.toString());

        //4：clear():清空集合中的元素
        coll.clear();

        //5：isEmpty()判断当前集合是否为空
        System.out.println(coll.isEmpty());
    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();

        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(new Person("Jery", 25));
        coll.add(456);
        coll.add(false);
        // System.out.println(coll.size());
        //6:contains(Object o):判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals()
        boolean contains = coll.contains(456);
        System.out.println(contains);//true

        System.out.println(coll.contains(new String("Tom")));//true-->调用String 重写的的equals()方法

        //自定义的类，若没有重写equals方法，默认调用是Object 的equals,比较的是==，
        // 若重写，则调用的是重写后的方法，比较的是实体内容
        System.out.println(coll.contains(new Person("Jery", 25)));//false-->true
        //7: conatainsAll(Collection coll1):判断形参coll1 中的所有元素是否都在当前集合中
        Collection coll1 = Arrays.asList(123, 456);
        boolean b = coll.containsAll(coll1);
        System.out.println(b); //true

    }

    @Test
    public void test3() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("456");
        collection.add(false);
        collection.add(new String("Tom"));
        collection.add(new Person("Jery", 28));
        collection.add(123.8);

        //8：remove(Object o):差集：从当前集合中移除obj元素
        boolean remove = collection.remove(123.8);
        System.out.println(remove);
        System.out.println(collection);

        //9：removeAll(Collection collection1):从当前集合中移除collection1中所有元素
        Collection collection1 = Arrays.asList(123, "456");
        boolean b = collection.removeAll(collection1);
        System.out.println(b);//true
        System.out.println(collection);
    }

    @Test
    public void test4() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add("789");
        collection.add(new String("Tom"));
        collection.add(false);
        collection.add(new Person("Jery", 26));

        Collection collection1 = Arrays.asList(123, 456, 789);

        //10:retainAll(Collection collection1):获取当前集合与collection1集合的交集，并返回给当前集合
        collection.retainAll(collection1);
        System.out.println(collection);

        //11:equals(Object obj)
        Collection collection2 = Arrays.asList(123, 456, "789");

        Collection collection3 = new ArrayList();
        collection3.add(123);
        collection3.add(456);
        collection3.add("789");
        System.out.println(collection2.equals(collection3));

    }

    @Test
    public void test5() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(false);
        collection.add("789");
        collection.add(new String("Tom"));
        collection.add(new Person("Jery", 29));
        //12:hashCode():返回当前对象的哈希值
        System.out.println(collection.hashCode());

        //13:集合-->数组:toArray()
        Object[] objects = collection.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i]+" ");

        }
        System.out.println();
        //14:拓展:数组-->集合: 调用Arrays的静态方法asList()
        List<String> stringList = Arrays.asList(new String[]{"AA", "BB", "VV"});
        System.out.println(stringList);

        //注意事项
        List ints = Arrays.asList(new int[]{133, 456});
        System.out.println(ints.size());//1,不是2
        List integerList = Arrays.asList(123, 456);
        System.out.println(integerList.size());//2
        System.out.println(integerList);//[123, 456]

        List integerList1 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(integerList1);//[123, 456]
        System.out.println(integerList1.size());//2


    }
    //15:iterator():返回Iterator接口的实例，用于遍历集合元素--详见：IteratorTest.java


}

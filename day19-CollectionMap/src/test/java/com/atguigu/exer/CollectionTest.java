package com.atguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CollectionTest.java
 * @Description TODO
 * @createTime 2022年04月12日 11:27:00
 */
//练习：在List 内去除重复数字的值，要求尽量简单
public class CollectionTest {

    public static List duplicateList(List list){
        HashSet set=new HashSet();
        set.addAll(list);
        return new ArrayList(set);

    }
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(new Integer(123));
        list.add(new Integer(124));
        list.add(new Integer(123));
        list.add(new Integer(125));
        list.add(new Integer(126));

        List list1 = duplicateList(list);

        for (Object o:list1) {
            System.out.println(o);

        }
    }
    @Test
    public void test2(){
        HashSet set=new HashSet();

        Person person = new Person(1, "Tom");
        Person person1 = new Person(2, "Jack");

        set.add(person);
        set.add(person1);
        System.out.println(set);//[Person{id=1, name='Tom'}, Person{id=2, name='Jack'}]

        person.name="Jason";
        set.remove(person);
        System.out.println(set);//[Person{id=1, name='Jason'}, Person{id=2, name='Jack'}]
        set.add(new Person(1,"Jason"));
        System.out.println(set);//[Person{id=1, name='Jason'}, Person{id=1, name='Jason'}, Person{id=2, name='Jack'}]

        set.add(new Person(1,"Tom"));
        System.out.println(set);//[Person{id=1, name='Jason'}, Person{id=1, name='Tom'}, Person{id=1, name='Jason'}, Person{id=2, name='Jack'}]

    }
}

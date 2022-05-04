package com.atuguigu.java2;

import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description
 * @Author lipeng
 * @create 2022/4/17
 */
/*
* 1：泛型在继承方面的体现
*
* 2：通配符的使用
*
*
* */
public class GenericTest {
    /*
    * 1：泛型在继承方面的体现
    * 虽然类A是类B的父类，但是G<A>和G<B>二者不具有子父类的关系，二者是并列关系
    * 补充：类A是类B的父类,A<G>是B<G>的父类
    *
    *
    * */
    @Test
    public void test1(){
        Object obj=null;
        String str=null;
        obj=str;

        Object[] objects=null;
        String[] strings=null;
        objects=strings;

        List<Object>list=null;
        List<String>list1=null;
        //此时的list1与list的类型不具有子父类关系
//        list=list1;

    }
    @Test
    public void test2(){
        List<String>list=null;
        ArrayList<String>list1=null;
        AbstractList<String>list2=null;
        list=list1;

    }
    /*
    * 2：通配符的使用
    * 通配符：？
    *
    * 类A是类B 的父类，G<A>和G<B>是没有关系的，二者共同的父类时：G<?>
    *
    * */
    @Test
    public void test3(){
        List<Object>list=null;
        List<String>list1=null;
        List<?>list2=null;

        list2=list;
        list2=list1;
//        print(list);
//        print(list1);
        List<String>list3=new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list2=list3;
        //除了null之外，添加List<?>就能向其内部添加数据
//        list2.add("DD")
        list2.add(null);
        //允许读取数据，读取的数据类型为Object
        Object o = list2.get(0);
        System.out.println(o);
    }

    public void print(List<?>list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
    /*
    * 有限制条件的通配符的使用
    * ? extends A:
    *           G<?extends A>可以作为G<A>和G<B>的父类，其中B是A的子类
    *
    * ? super A:
    *           G<?super>可以作为G<A>和G<B>的父类，其中B是A的父类

    * */
    @Test
    public void test4(){
        List<?extends Person>list=null;
        List<?super Person>list1=null;

        List<Student>list2=new ArrayList<>();
        List<Person>list3=new ArrayList<>();
        List<Object>list4=new ArrayList<>();

        list=list2;
        list=list3;
//        list=list4;

//        list1=list2;
        list1=list3;
        list1=list4;
        
        //读取数据
        list=list2;
        Person person = list.get(0);
        list1=list3;
        Object object = list1.get(0);

        //写入数据
//        list.add(new Person())

        list1.add(new Person());
        list1.add(new Student());

    }
}

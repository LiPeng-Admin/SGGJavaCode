package com.atguigu.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/21
 */
public class ReflectionTest {
    //反射之前，对于Person类的操作
    @Test
    public void test() {
        //1：创建Person类的对象
        Person person = new Person("Tom", 28);
        //通过对象，调用其内部的属性，方法
        person.age=21;
        System.out.println(person.toString());

        person.show();

        //在Person类的外部，不可以通过Person类的对象调用其内部私有结构



    }
    //反射之后，对于Person 类的操作
    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class aClass = Person.class;
        //1：通过反射，创建Person 类对象
        Constructor constructor = aClass.getConstructor(String.class, int.class);

        Object o = constructor.newInstance("Tom", 28);
        Person person = (Person) o;
        System.out.println(person.toString());
        //2：通过反射，调用对象指定的属性和方法
        //调用属性
        Field  ages = aClass.getDeclaredField("age");
        ages.set(person,10);
        System.out.println(person.toString());
        //调用方法
        Method show = aClass.getDeclaredMethod("show");
        show.invoke(person);
        System.out.println("**************");

        //通过反射，可以调用Person 类的私有结构，如：私有的构造器，属性，方法
        //调用私有的构造器
        Constructor constructor1 = aClass.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Object o1 = constructor1.newInstance("Jack");
        Person person1= (Person) o1;
        System.out.println(person1);
        //调用私有的属性
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person1,"张三");
        System.out.println(person1);
        //调用私有的方法
        Method showNation = aClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        Object o2 = showNation.invoke(person1, "中国");
        String nation= (String) o2;
        System.out.println(nation);


    }
    /*
    *关于java.lang.Class类的理解
    * 1：类的加载过程
    * 程序经过javac.exe命令以后，会生成一个或多个字节码文件，接着我们使用java.exe命令对某个字节码文件进行解释运行
    * 相当于将某个字节码文件加载在内存中。加载在内存中的类，称为运行时类，此运行时类，就作为Class的一个实例
    * 2：换句话说，Class的实例就对应着一个运行时类
    * 3:加载到内存中的运行时类，会缓存一定的时间，在此时间之内，我们可以通过不同的方式来获取此运行时类
    *
    *
    *
    * */

    //获取Class的实例的方式
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一：调用运行时类的属性:.class
        Class aClass = Person.class;
        System.out.println(aClass);

        //方式二：通过运行时类的对象,调用getClass
        Person person=new Person();
        Class aClass1 = person.getClass();
        System.out.println(aClass1);

        //方式三：调用Class的静态方法:forName(String classPath)
        Class aClass2 = Class.forName("com.atguigu.java.Person");
        System.out.println(aClass2);

        System.out.println(aClass==aClass1); //true
        System.out.println(aClass==aClass2); //true

        //方式四：使用类的加载器：ClassLoader(此方式了解)
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class aClass3 = classLoader.loadClass("com.atguigu.java.Person");
        System.out.println(aClass3);
        System.out.println(aClass == aClass3);


    }


}

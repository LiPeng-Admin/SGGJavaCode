package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/29
 */
/*
 *调用运行时类中指定的结构：属性，方法，构造器
 *
 *
 * */
public class ReflectionTest {
    //此方式不建议使用，有局限性
    @Test
    public void testField() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
//        Class<Person> aClass = Person.class;
//        //创建一个运行时的对象
//        Person person = aClass.newInstance();
//        /*
//        获取指定的属性:
//        需要满足：运行时类中属性声明为public
//
//        */
//
//        Field id = aClass.getField("id");
//
//        /*
//        设置当前属性的值
//        set():
//        参数1：指明设置哪个对象的属性
//        参数2：将此属性值设置为多少
//         */
//        id.set(person,1001);
//        /*
//        * 获取当前属性的值
//        * get():
//        * 参数：获取哪个对象的当前属性值
//        *
//        * */
//
//        int pId = (int) id.get(person);
//        System.out.println(pId);

    }

    /*
     * 操作运行时类中的指定属性（掌握）
     *
     * */
    @Test
    public void testField1() throws IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        Class<Person> aClass = Person.class;

        //创建运行时类的对象
        Person person = aClass.newInstance();

        //1:getDeclaredMethod():获取运行时类中指定变量名的属性
        Field name = aClass.getDeclaredField("name");

        //2:保证当前属性是可访问的
        name.setAccessible(true);

        //3：设置当前属性的值
        name.set(person, "Tom");

        //4：获取当前属性的值
        String o = (String) name.get(person);
        System.out.println(o);


    }

    /*
     * 操作运行时类中的指定方法(掌握)
     *
     *
     * */
    @Test
    public void testMethod() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //获取Class的实例的方式
        Class<Person> personClass = Person.class;

        //创建运行时类的对象
        Person person = personClass.newInstance();

        /*
        1：getDeclaredMethod():获取某个指定的方法
        参数1：指明获取的方法名称
        参数2：指明获取的方法的形参列表

         */
        Method show = personClass.getDeclaredMethod("show", String.class);


        //2：保证当前方法是可访问的
        show.setAccessible(true);
        /*
         *:3：调用方法的invoke():
         * 参数1：方法的调用对象
         * 参数2：给方法形参赋值的实参
         * invoke()的返回值即为对应类中调用方法的返回值
         *
         * */
        Object o = show.invoke(person, "CHN");
        System.out.println(o);


        System.out.println("******如何调用静态的方法*********");

        Method showDesc = personClass.getDeclaredMethod("showDesc");

        showDesc.setAccessible(true);

        showDesc.invoke(Person.class);

    }

    //调用运行时类中的指定的构造器（了解）
    @Test
    public void testConstrustor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Person> personClass = Person.class;
        /*
         *获取指定的构造器
         * getDeclaredConstructor():
         * 参数：指明构造器的参数列表
         * */
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class);

        //保证当前方法是可访问的
        declaredConstructor.setAccessible(true);

        //调用此构造器创建运行时类的构造器
        Person person = declaredConstructor.newInstance("Tom");
        System.out.println(person);


    }
}

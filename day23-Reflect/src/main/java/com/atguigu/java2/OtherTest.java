package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/28
 */
public class OtherTest {
    /*
     * 获取构造器结构
     *
     * */
    @Test
    public void test1() throws NoSuchMethodException {
        Class<Person> aClass = Person.class;
        //getConstructors():获取当前运行时类中声明为public的构造器
        Constructor<?>[] constructor = aClass.getConstructors();
        for (Constructor<?> constructor1 : constructor) {
            System.out.println(constructor1);

        }
        System.out.println();
        //getDeclaredConstructors():获取当前运行时类中所有的构造器
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);

        }
    }

    /*
     * 获取运行时类的父类

     * */
    @Test
    public void test2() {
        Class<Person> aClass = Person.class;
        Class<? super Person> superclass = aClass.getSuperclass();
        System.out.println(superclass);

    }

    /*
     * 获取运行时类的带泛型的父类

     * */
    @Test
    public void test3() {
        Class<Person> aClass = Person.class;
        Type genericSuperclass = aClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    /*
     * 获取运行时类的带泛型的父类的泛型

     * */
    @Test
    public void test4() {
        Class<Person> aClass = Person.class;
        Type genericSuperclass = aClass.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        //获取泛型类型
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (Type argument : actualTypeArguments) {
            System.out.println(argument.getTypeName());
        }
    }

    /*
     * 获取运行时类的实现接口
     *
     *  */
    @Test
    public void test5() {
        Class<Person> aClass = Person.class;
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);

        }
        System.out.println();
      //获取运行时类的父类实现接口
        Class<?>[] classes = aClass.getSuperclass().getInterfaces();
        for (Class<?> aClass1 : classes) {
            System.out.println(aClass1);

        }
    }
    /*
    * 获取运行时类所在的包
    * */
    @Test
    public void test6(){
        Class<Person> aClass = Person.class;
        Package aPackage = aClass.getPackage();
        System.out.println(aPackage);

    }
    /*
    * 获取运行时类声明的注解
    * */
    @Test
    public void test7(){
        Class<Person> personClass = Person.class;
        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);

        }
    }


}

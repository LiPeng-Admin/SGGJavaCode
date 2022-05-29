package com.atguigu.java;

import org.junit.Test;

import java.util.Random;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/22
 */
/*
通过反射创建对应的运行时类的对象
*/

public class NewInstanceTest {
    @Test
    public void test() throws IllegalAccessException, InstantiationException {
        Class<Person> aClass = Person.class;
        /*
         * newInstance():调用此方法，创建对应的运行时类的对象，内部调用了运行时的空参构造器
         * 若希望此方法正常的创建运行时的对象，需要满足：
         * 1：运行时类必须提供空参的构造器
         * 2：空参的构造器的访问权限得够，通常，设置为public
         *
         * 在javabean中要求提供一个public的空参的构造器，原因
         * 1：便于通过反射，创建运行时类的对象
         * 2：便于子类继承此运行时类时，默认调用super()时，保证父类有此构造器
         *

         *
         * */
        Person person = aClass.newInstance();
        System.out.println(person);

    }
    //体会反射的动态性

    @Test
    public void test2() {
        for (int i = 0; i < 100; i++) {
            int anInt = new Random().nextInt(3);
            String classPath = "";
            switch (anInt) {
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "com.atguigu.java.Person";
                    break;
            }
            try {
                Object o = getInstance(classPath);
                System.out.println(o);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }
    /*
    * 创建一个指定类的对象
    * classPath:指定类的全类名
    *
    * */

    public Object getInstance(String classPath) throws Exception {
        Class aClass = Class.forName(classPath);
        Object o = aClass.newInstance();
        return o;
    }

}

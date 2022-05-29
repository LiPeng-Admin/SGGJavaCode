package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/22
 */
/*
* 获取当前运行时的类的属性结构
* */
public class FieldTest {

    @Test
    public void test1(){
        Class<Person> aClass = Person.class;
        //获取属性结构
        //getFields():获取当前运行时类 及其 父类中声明为public访问权限的属性
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);

        }
        System.out.println();

        //getDeclaredFields():获取当前运行时类声明的所有属性（不包含父类中声明的属性）
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

    }
    //权限修饰符 数据类型 变量名
    @Test
    public void test2(){
        Class<Person> aClass = Person.class;
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            //1：权限修饰符
            int modifiers = field.getModifiers();
            System.out.println(Modifier.toString(modifiers));


            //2:数据类型

            Class<?> type = field.getType();
            System.out.println(type);
            //3:变量名
            String fieldName = field.getName();
            System.out.println(fieldName);
        }

    }
}

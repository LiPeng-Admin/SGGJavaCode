package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/22
 */
/*
 * 获取当前运行时的类的方法结构
 *
 *
 * */
public class MethodTest {
    @Test
    public void test1() {
        Class<Person> aClass = Person.class;

        //getMethods():获取当前运行时类及其父类中所有声明为public权限 的方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);

        }
        System.out.println();

        //getDeclaredMethods():获取当前运行时类中声明的所有方法（不包含父类中声明的方法）
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

    }

    /*
     * @Xxx
     * 权限修饰符 返回值类型 方法名 （参数类型 形参名1,....）{
     * }

     * */
    @Test
    public void test2() {
        Class<Person> aClass = Person.class;
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            //1：获取方法声明的注解
            Annotation[] annotations = declaredMethod.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);

            }
            //2:权限修饰符
            int modifiers = declaredMethod.getModifiers();
            System.out.print(Modifier.toString(modifiers) + "\t");
            //3:返回值类型
            Class<?> returnType = declaredMethod.getReturnType();
            System.out.println(returnType.getName() + "\t");
            //方法名
            String name = declaredMethod.getName();
            System.out.println(name);
            System.out.print("(");

            //形参列表
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            if (!(parameterTypes == null && parameterTypes.length == 0)) {
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i == parameterTypes.length - 1) {
                        System.out.print(parameterTypes[i].getName() + "args_" + i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + "args_" + i + ",");

                }

            }


            System.out.print(")");


            System.out.println();

        }


    }

}

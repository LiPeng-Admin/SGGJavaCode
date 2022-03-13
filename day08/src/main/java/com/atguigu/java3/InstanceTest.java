package com.atguigu.java3;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InstanceTest.java
 * @Description TODO
 * @createTime 2022年03月12日 20:01:00
 */
/*
*子类对象实例化的全过程
* 1：从结果来看（继承性）
*       子类继承父类以后，就获取父类中升到属性和方法
*       创建子类的对象，在堆空间中，就会加载所有父类中声明的属性
* 2：从过程来看
*       当我们通过子类的构造器创建子类对象时，我么一定会直接或间接的调用其父类的构造器
        进而调用父类的父类的构造器。。，直到调用了java.lang.Object类中空间的构造器，正因为
        加载了所以父类的结构，所以才看到内存中父类的结构，子类对象才可以考虑进行调用
*
*
*
* */
public class InstanceTest {
}

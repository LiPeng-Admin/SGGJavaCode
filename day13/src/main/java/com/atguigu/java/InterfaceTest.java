package com.atguigu.java;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InterfaceTest.java
 * @Description 接口的使用
 * @createTime 2022年03月25日 02:24:00
 */
/*
* 接口的使用
* 1：接口使用interface来定义
*2:java中接口和类是并列的两个结构
* 3：如何定义接口：接口中的成员
*       3.1：jdk7及以前：只能定义全局常量和抽象方法
*           全局常量：public static final(可以省略)
*           抽象方法：public abstract
*       3.2: jdk8及以后：除了定义全局常量及抽象方法外，还可以定义静态方法和默认方法（略）
*
* 4：接口中不能定义构造器，意味这不能实例化
* 5：java开发中，接口通过类去实现（implements）的方式来使用
*           如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
*           如果实现类没有覆盖接口中的所有抽象方法，则此实现类仍为抽象类
*
* 6:java类可以实现多个接口 -->弥补了java 单继承的局限性
*
*   格式：class AA extends BB implements CC,DD,EE
*
* 7:接口与接口之间可以继承，而且可以多继承
* *******************
* 8:接口的具体使用，体现多态性
* 9：接口，实际上是一种规范
*
*
* */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Plane plane=new Plane();
        plane.fly();
        plane.stop();
    }
}

interface Attackable{
    void attack();
}

interface Flyable {
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1; //省略了public static final

    //抽象方法
    public abstract void fly();

    void stop();//省略了public abstract

}
//接口通过类去实现（implements）的方式来使用
class Plane implements  Flyable{

    public void fly() {
        System.out.println("通过引擎起飞");

    }

    public void stop() {
        System.out.println("驾驶员减速慢行");

    }
}

 abstract  class Kite implements  Flyable{

    public void fly() {

    }


}
class Bullet extends Object implements Flyable,Attackable,CC{
    public void attack() { }

    public void fly() { }

    public void stop() { }

    public void method() { }

    public void method1() { }
}

//***************************
interface AA{
    void method();
}
interface BB{
    void method1();
}
interface CC extends AA,BB{

}
package com.atguigu.java;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName StaticTest.java
 * @Description static 关键字的使用
 * @createTime 2022年03月20日 11:19:00
 */
/*
* static 关键字的使用
* 1:static:静态的
* 2：static可以用来修饰：属性，方法，代码块，内部类
* 3：使用static修饰属性；静态变量/属性
*   3.1属性：按照是否使用static修饰分为：静态属性/变量(或类变量) vs 非静态属性/变量（实例变量）
*
*   实例变量：我们创建了类的多个对象。每个对象都独立的拥有一套类中的非静态属性。当修改其中一个对象的非静态属性时，
*           不会导致其他对象中同样的属性值的修改
*   静态变量：我们创建了类的多个对象，多个对象共享了同一个静态属性（变量），当通过某一个对象修改静态变量时，会导致
*           其他对象调用此静态变量时，是修改过了的
*
*  3.2使用static修饰属性的其他说明
*           1:静态变量随着类的加载而加载，可以通过"类.静态变量"方式进行调用
*           2:静态变量的加载早于对象的创建
*           3:由于类只会加载一次，则静态变量在内存中也只会存在一份：存在方法区的静态域中
*
*  3.3 静态属性的举例：System.out,Math.PI
*
*
* 4：使用static修饰方法：静态方法
*           1：随着类的加载而加载，可以通过"类.静态方法"的方式进行调用
*           2:       静态方法     非静态方法
*               类    yes           no
*
*               对象   yes           yes
*
*           3:静态方法中，只能调用静态的方法或属性
*             非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
*
* 5：static注意点：
*          在静态的方法内，不能使用this,super 关键字
*
* 6:    在开发中，如何确定一个属性是否声明为static？
*           属性是可以被多个对象所共享的，不会随着对象的不同而不同的
            类中的常量也常常声明为static

*       在开发中，如何确定一个方法是否声明为static?
*           操作静态属性的方法，通常设置为static
*           工具类中的方法，习惯上声明为static,如：Math,Arrays,Collections

* */


public class StaticTest {
    public static void main(String[] args) {

        Chinese.nation="Jan";
        Chinese c1=new Chinese();
        c1.name="马云";
        c1.age=60;
        c1.nation="CHN";

        Chinese c2=new Chinese();
        c2.name="王健林";
        c2.age=55;
        c2.nation="Ame";


//        System.out.println(c2.nation);
        System.out.println(c1.nation);
        c1.eat();
        Chinese.show();

    }

}
class Chinese{
    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("中国人吃中餐");
        info();
        show();
        System.out.println("nation:"+nation);
    }
    public static void show(){
        System.out.println("我是一个中国人");

//        eat(); //静态方法内，不能调用非静态的方法或属性
//        name="雷军";

        System.out.println(nation); //静态方法内，调用静态的方法或属性,注意此处nation 前省略的是Chinese,不是this（报错）
        walk();
    }
    public static void walk(){
        System.out.println("人正在走路");
    }
    public void info(){
        System.out.println("name:"+name+",age:"+age);
    }
}

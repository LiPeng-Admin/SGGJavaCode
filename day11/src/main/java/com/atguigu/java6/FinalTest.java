package com.atguigu.java6;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName FinalTest.java
 * @Description final关键字
 * @createTime 2022年03月20日 23:34:00
 */
/*
* final：最终的
* 1：final可以用来修饰的结构：类，方法，变量
* 2：final 用来修饰类：此类不能被其他类继承，如String,System,StringBuffer等类
* 3：final 用来修饰方法，表名此方法不可以被重写,如Object类中getClass();
* 4:final用来修饰变量：此时的“变量”就称为一个常量
*   4.1:final修饰属性：可以考虑赋值的位置有：显示初始化，代码块初始化,构造器初始化
*   4.2：final修饰局部变量：尤其是使用final修饰形参时，表明此形参是一个常量，当我们调用
*                         此方法时，给常量形参赋一个实参，一旦赋值以后，就只能在方法体内使用此形参，
*                         但不能进行重新赋值
*
* static final 用来修饰属性，方法
*                  修饰属性：全局常量
*
*
*
*
*
*
* */
public class FinalTest {

    public static void main(String[] args) {

        FinalA finalTest=new FinalA();
        finalTest.show(10);

    }



}


final class FinalA{
    final int WIDTH=1;
    final int LEFT;
    {
        LEFT=2;
    }
    final int RIGHT;
    public FinalA(){
        RIGHT=5;
    }
    public void show(){
        final int NUM=1;
//            NUM+=2;
    }
    public void show(final int num){
        System.out.println(num);

    }



}
//class B extends FinalA{
//
//}
//class C extends String{
//
//}
class AA{
    public final  void show(){

    }
}
class BB extends AA{
//    public void show(){
//
//    }
}

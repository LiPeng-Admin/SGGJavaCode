package com.atguigu.java8;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SubClassTest.java
 * @Description TODO
 * @createTime 2022年03月26日 17:29:00
 */
public class SubClassTest {
    public static void main(String[] args) {
        SubClass subClass=new SubClass();
        //知识点1：接口中定义的静态方法，只能通过接口来调用
        CompareA.method1();//base:杭州

        //知识点2：通过实现类的对象，可以调用接口中的默认方法
        //如果实现类重写了接口中的默认方法，则调用是重写的方法

        subClass.method2();//subClass:上海
        //知识点3；如果子类（或实现类）继承的父类和实现的接口声明了同名同参数的方法
        //那么子类在没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法 --》类优先原则

        subClass.method3();//superClass:杭州
        //知识点4：如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，
        // 那么在实现类没有重写此方法的情况下，报错  --》接口冲突
        //需要在实现类中重写此方法
        subClass.method3();//-->subClass:深圳

        System.out.println("********************");

        subClass.myMethod();

    }
}
class  SubClass  extends SuperClassTest implements CompareA,CompareB{
    @Override
    public void method2() {
        System.out.println("subClass:上海");
    }

    @Override
    public void method3() {
        System.out.println("subClass:深圳");
    }
//知识点5：如何在子类（或实现类）中调用父类，接口被重写的方法
    public void myMethod(){
        method3(); //调用自己重写的方法
        super.method3(); //调用父类中重写的方法

         //调用接口中的默认方法
        CompareA.super.method3();
        CompareB.super.method3();
    }
}

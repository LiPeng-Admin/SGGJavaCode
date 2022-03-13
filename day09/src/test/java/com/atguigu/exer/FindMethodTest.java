package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName FindMethodTest.java
 * @Description TODO
 * @createTime 2022年03月13日 22:38:00
 */

/*
*
*
*
* */
public class FindMethodTest {
    public static void main(String[] args) {
        Sub sub=new Sub();
        System.out.println(sub.count); //20
        sub.display(); //20
        System.out.println("*************");

        Base base=sub; //多态性
        System.out.println(base==sub);//true

        //对象的多态性只适用于方法，不适用于属性
        System.out.println(base.count); //10
        // 有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法
        // 但是在运行期，我们实际执行的是子类重写父类的方法
        base.display(); //20
    }

}
class Base{
    int count=10;
    public void display(){
        System.out.println(this.count);
    }
}
class Sub extends Base{
    int count=20;
    public void display(){
        System.out.println(this.count);
    }
}

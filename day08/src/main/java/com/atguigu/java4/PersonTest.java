package com.atguigu.java4;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PersonTest.java
 * @Description TODO
 * @createTime 2022年03月13日 10:40:00
 */

/*
* 面向对象之三：多态性
* 1:理解多态性：可以理解为一个事物的多种形态
* 2:何为多态性：
*       对象多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
* 3：多态的使用：虚拟方法调用
*       有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但是在运行期，我们实际执行的是子类重写父类的方法
*       总结：编译，看左边；运行，看右边
* 4：多态性使用的前提
*        1：类的继承关系，2：方法的重写
*
* 5:对象的多态性只适用于方法，不适用于属性（编译与运行都看左边）
*
* */
public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();
        person.eat();
        Man man=new Man();
        man.age=25;
        man.eat();
        man.earnMoney();
        System.out.println("*****************");
        //***********************************
        //对象多态性：父类的引用指向子类的 对象
        Person person1=new Man();
        //多态性的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法--虚拟方法调用
        person1.eat();
//        person1.earnMoney  //
        System.out.println("*************************");
        System.out.println(person1.id); //1001


//        Person person2=new Woman();
    }
}

package com.atguigu.java;

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
* *****************************************************************
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
//        Person person2=new Woman();
        //多态性的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法--虚拟方法调用
        person1.eat();

        System.out.println("*************************");
        System.out.println(person1.id); //1001

        System.out.println("*********************************************");
//        person1.earnMoney  //不能调用子类所特有的方法，属性；编译时，person1 是Person类型

        //有了对象的多态性后，内存中实际是加载了子类特有的属性和方法，但是由于变量声明为父类类型，
        //导致编译时，只能调用父类中生命的属性和方法，子类特有属性和方法不能调用

        //如何调用子类特有的属性和方法
        //向下转型：使用强制类型转换符
        Man man1=(Man) person1;
        man1.earnMoney();
        man1.isSmoking=true;
        //使用强制时，可能出现ClassCastException异常
//        Woman woman=(Woman) person1;
//        woman.goShopping();

        /*
        * instanceof关键字的使用
        *a instanceof A:判断对象a是否是类A的实例，如果是，返回true ,如果不是，返回false
        * 使用情境：为了避免向下转型时出现ClassCastException的异常，我们在向下转型之前，进行
        * instanceof的判断，一旦返回true,就进行向下转型，如果返回false,不进行向下转型
        *
        * 如果a instanceof A,返回true,则 a instanceof B 也返回true (其中，类B是类A的父类)
        * */
        if(person1 instanceof Woman){
            Woman woman=(Woman) person1;
            woman.goShopping();
            System.out.println("woman");
        }
        System.out.println("*******************");
        if(person1 instanceof Man){
            Man man2=(Man) person1;
            man2.earnMoney();
            System.out.println("man");
        }
        if(person1 instanceof Person){
            System.out.println("person");
        }
        if(person1 instanceof  Object){
            System.out.println("object");
        }

        //问题一：编译通过，运行不通过
//        Person person2=new Woman();
//        Man man2=(Man) person2;

        //问题二：编译通过，运行通过
        Object obj=new Woman();
        Person person3=(Person) obj;





    }
}

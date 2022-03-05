package com.atguigu.java2;
/*
* this 关键字的使用
* 1：this 可以用来修饰：属性，方法，构造器
* 2: this 修饰符属性和方法
    *this理解为：当前对象 或当前正在创建的对象
    *      2.1：在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，来调用当前对象的属性或方法
    *      但是通常情况下，我们会省略"this.",特殊情况下，如果方法的形参与类的属性同名是，我们必须
    *      显示的使用"this.变量"的方式，表明此变量时属性，非形参
    *

     *     2.2在类的构造器中，我们可以使用"this.属性"或"this.方法"的方式，来调用当前正在创建的对象的属性或方法
     *     但是通常情况下，我们会省略"this.",特殊情况下，如果构造器的形参与类的属性同名是，我们必须
     *     显示的使用"this.变量"的方式，表明此变量时属性，非形参
*3:this   修饰或调用构造器
*          3.1:我们在类的构造器中，可以现实的使用“this(形参列表)” 方式，调用本类中的其他构造器
*          3.2:构造器中不能通过“this(形参列表)”方式调用自己
*          3.3：如果一个类中有n 个构造器，则最多有n-1 构造器使用了“this(形参列表)”
*          规定：“this（形参列表）“必须声明在当前构造器的首行
*
*
*
* */

public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();
        person.setAge(2);
        System.out.println(person.getAge());
        person.eat();
        System.out.println("******************");
        Person person1=new Person("Jearn",28);
        System.out.println(person1.getAge());
    }
}

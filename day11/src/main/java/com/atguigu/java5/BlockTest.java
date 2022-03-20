package com.atguigu.java5;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName BlockTest.java
 * @Description 代码块
 * @createTime 2022年03月20日 22:06:00
 */
/*
* 类的成员之四：代码块（或初始化块）
* 1：代码块的作用：用来初始化类，对象
* 2:代码块如果有修饰，只能使用static
* 3:分类：静态代码块与非静态代码块
* 4：静态代码块
*       1：内部可以有输出语句
*       2:随着类的加载而执行,而且只会执行一次
*       3：初始化类的信息
*       4：如果一个类中定义了多个静态代码块，则按照声明的先后顺讯执行
*       5：静态代码块的执行早于非静态代码块的执行
*       6:静态代码块只能调用静态的属性，方法，不能调用非静态的属性和方法
* 5：非静态代码块
*       1：内部可以有输出语句
*       2:随着对象的创建而执行，每创建一个对象就会执行一次非静态代码块
*       3:作用：可以在创建对象时，对对象的属性等进行初始化
*       4：如果一个类中定义了多个非静态代码块，则按照声明的先后顺讯执行
*       5:非静态代码块即能调用非静态的属性，方法，也能调用静态的属性和方法
*
*
* */
public class BlockTest {
    public static void main(String[] args) {
        String desc=Person.desc;
        Person.info();
        System.out.println(desc);
        Person person=new Person();
        Person person1=new Person();
        System.out.println(person.age);


    }
}
class Person{
    //属性
    String name;
    int age;
    static String desc="我是一个好人";

    //构造器
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    //代码块
 //静态代码块
    static {
        System.out.println("hello,static block-1");
        desc="我是一个爱学习的人";



    }
    static {
        System.out.println("hello,static block-2");
        desc="我是一个爱学习的人";

    }

    //非静态代码块

    {
        System.out.println("hello,not is static block-1");
        //非静态结构
        eat();
        age=1;
        //静态结构
        info();
        desc="我是一个爱学习的baby";

    }
    {
        System.out.println("hello,not is static block-2");
//        age=2;

    }



    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void info(){
        System.out.println("我是一个大学生，但是却不容易找到工作！");
    }
}

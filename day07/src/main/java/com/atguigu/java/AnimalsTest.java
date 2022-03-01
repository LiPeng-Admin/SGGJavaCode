package com.atguigu.java;
/*
* 面向对象的特征一：封装与隐藏
* 一：问题的引入
* 当我们创建一个类的对象以后，我们可以通过“对象.属性”的方式，对对象的属性进行赋值，
* 这里，赋值操作受到属性的数据类型和存储范围的制约，除此之外，没有其他制约条件。
* 但是，在实际问题中，我们往往需要给属性赋值加入额外的限制条件，这个条件就不能再属性声明时
* 体现，我们只能通过方法进行限制条件的添加，（如setLegs），同时我们需要避免用户在使用"对象.属性"
* 的方式来对属性进行赋值，需要将属性声明为私有的（private）->此时，针对于属性就体现为封装性
*
* 程序设计追求"高内聚，低耦合"
*     高内聚：类的内部数据操作细节自己完成，不允许外部干涉
*     低耦合：仅对外暴露少量的方法用于使用
*
* 二：封装性的体现
* 我们将类的属性私有化xxx（private）,同时，提供公共的（public）方法来获取（getXxx）和设置(setXxx)此属性的值
*   拓展：属性的私有化，方法的私有化，单例模式。。。。
* 三：封装性的体现，需要权限修饰符的配合
* 1：Java 规定的4种权限（从小到大）：private,缺省,protected,public
* 2:4种权限可以用来修饰类及类的内部结构：属性，方法，构造器，内部类
* 3：具体的，4种权限都可以用来修饰符类的内部结构：属性，方法，构造器，内部类
*           修饰类：只能使用：缺省，public
*
*总结封装性：Java 提供了4种权限修饰符来修饰类及类的内部结构，体现了类及类的内部结构在被调用时可见性的大小
*
* */
public class AnimalsTest {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.name="大黄";
//        animal.age=3;
//        animal.legs=4; //封装legs属性
        animal.setLegs(4);
        animal.setAge(2);
        System.out.println(animal.getAge());
        animal.show();

    }
}
class Animal{
    String name;
     private   int age;
     private  int legs;

    public void eat(){
        System.out.println("现在可以吃东西了~~~~~");
    }

    //属性的设置
    public  void setLegs(int i){
        if(i>0&&i%2==0){
            legs=i;
        }else {
            legs=0;
        }
    }
    //属性的获取
    public int getLegs(){
        return legs;
    }
    public void show(){
        System.out.println("狗狗的名字是: "+name+",狗狗的年龄是："+age+"岁,狗狗有："+legs+"条腿");
    }

    //属性的设置
    public void setAge(int i){
        if(i>0){
            age=i;
        }else{
            age=0;
        }

    }
    //属性的获取
    public int getAge(){
        return age;
    }
}

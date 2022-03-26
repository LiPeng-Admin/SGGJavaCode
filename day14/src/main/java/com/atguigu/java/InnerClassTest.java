package com.atguigu.java;
/*
*
类的内部成员之五：内部类
* 1：java 中允许将一个类A声明在另一个类B中，则类A就是内部类，类B是外部类
* 2：内部类的分类：成员内部类 vs 局部内部类（方法类，代码块内，构造器内）
* 3:成员内部类：
*      一方面,作为外部类的成员：
*         调用外部类的结构
*         可以被static修饰
*         可以被4种不同的权限修饰
*
*     另一方面,作为一个类：
*          可以定义属性，方法，构造器等
*          可以用final修饰，表明此类不能被继承
*          可以被abstract 修饰，表明此类不能被实例化
*
* 4:关注如下的3个问题
*   4.1：如何实例化成员内部的对象
*       //创建Man实例（静态的成员内部类）
        Person.Man man=new Person.Man("张三",28);
       man.show();

       //创建Woman实例（非静态的成员内部类）
        Person person=new Person();
        Person.Woman woman=person.new Woman();
        woman.washHand();
        woman.display("王道乾");
*
*   4.2：如何在成员内部类中区分调用外部类的结构
*             System.out.println(name); //方法的形参
              System.out.println(this.name); //内部类的属性
              System.out.println(Person.this.name); //外部内的属性
*
*   4.3：开发中局部内部类的使用
*       代码如下：
            * public class InnerClassTest1 {
                //开发中常使用：返回一个实现了Comparable接口的类的对象

                public Comparable getComparable(){

                    //方式一：
                    //创建一个实现了Comparable接口的类：局部内部类
            //        class MyComparable implements  Comparable{
            //            public int compareTo(Object o) {
            //                return 0;
            //            }
            //        }
            //        return  new MyComparable();
            *
                    //方式二：
                    return new Comparable() {
                        public int compareTo(Object o) {
                            return 0;
                        }
                    };

                }
            }

*
*
* */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建Man实例（静态的成员内部类）
        Person.Man man=new Person.Man("张三",28);
       man.show();

       //创建Woman实例（非静态的成员内部类）
        Person person=new Person();
        Person.Woman woman=person.new Woman();
        woman.washHand();
        woman.display("王道乾");

    }
}
class Person{
    String name="李小龙";
    int age;
    public void eat(){
        System.out.println("人吃饭：");
    }
    //静态成员内部类
      static class Man{
          String name;
          int age;
          public Man(String name,int age){
              this.name=name;
              this.age=age;

          }
          public void show(){
              System.out.println("男人挣钱养家！");
          }

    }
    //非静态成员内部类
     class Woman{
          String name="西施";
          public Woman(){

          }
          public void washHand(){
              System.out.println("女人洗手");
              eat();

          }
          public void display(String name){
              System.out.println(name); //方法的形参
              System.out.println(this.name); //内部类的属性
              System.out.println(Person.this.name); //外部内的属性
          }



    }


    //方法
    public void method(){
        //局部内部类
        class AA{

        }
    }
 //代码块
    {
        //局部内部类
        class BB{

        }
    }
    //构造器
    public Person(){
        //局部内部类
        class CC{

        }
    }
}

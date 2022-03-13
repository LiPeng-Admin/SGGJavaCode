package com.atguigu.java1;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PersonTest.java
 * @Description TODO
 * @createTime 2022年03月10日 07:52:00
 */

/*
*方法的重写（override/overwrite）
* 1：重写：子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作
* 2：应用：重写以后，当创建子类对象以后，通过子类对象调用父类中的同名同参数的方法时，实际执行的是子类重写父类的方法
* 3：重写的规定：
*           方法的声明：权限修饰符 返回值类型 方法名（形参列表）throws 异常类型{
                    方法体
                    }
                    约定俗成：子类中的叫重写的方法，父类中的叫被重写的方法
                    * 1：:子类重写的方法名与形参列表与父类被重写的方法名与形参列表相同
                    * 2：权限修饰符：子类重写的方法权限修饰符不小于父类被重写的方法的权限修饰符
                    *              特殊情况：子类不能重写父类中声明为private权限的方法
                    * 3：返回值类型：
                    *               若父类被重写的方法的返回值类型时void ，则子类重写的方法返回值类型也是void
                    *               若父类被重写的方法的返回值类型是A类，则子类重写的方法返回值类型是A类或A类的子类
                    *               若父类被重写的方法的返回值类型是基本数据类型，则子类重写的方法返回值必须是相同的基本数据类型
                    * 4：子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
                    *
                    * 额外的：子类和父类的同名同参数的要么声明为非static(考虑重写),要么生命为static(不是重写)
*
*
*
*
*
*
* */
public class PersonTest {
    public static void main(String[] args) {
        Student student=new Student("计算机技术与科学");
        student.eat();
        student.walk(10);
        System.out.println("*****************");
        student.study();
        Person person=new Person();
        System.out.println("*************");
        person.eat();
    }
}

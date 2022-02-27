package com.atguigu.java;
/*
类中方法的声明和使用
方法：描述类应该具有的功能
比如：Math类：sqrt()\random()\...
     Scanner类：nextInt()...
     Arrays类：toString()\equals()\...
     1:举例
     public void eat(){}
     public void sleep(int hour){}
     public String getName(){}
     public String getNation(String nation){}

     2:方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
     方法体
     }
     注意：static,final,abstract 来修饰的方法，详见后面

     3：说明：
     3.1关于权限修饰符
        Java规定的4个权限修饰符：private,public,缺省，protected
     3.2返回值类型：有返回值 vs 没有返回值
            3.2.1  如果方法有返回值，则必须在方法声明时，指定返回值的类型，
                    同时，方法中需要使用return 关键字来返回指定类型的变量或常量
                    若方法没有返回值，则方法声明时，使用void来表示，通常，没有返回值的方法中，
                    不需要使用return ，但是，若使用的话，只能只用"return;"来表示结束此方法的意思

            3.2.2 我么定义方法需不需要返回值？
                    1：需求
                    2：经验

       3.3 方法名：属性标识符
       3.4形参列表：方法可以声明0或1个或多个
       格式：数据类型1 形参1,数据类型2 形参2,....

       3.5方法体

      4： return 关键字的作用
       1：适用范围:使用在方法体中
       2：作用：11:结束方法
               22：针对有返回值类型的方法，使用“return 数据”方法返回所要的语句
               33：return 关键字后面不可以声明执行语句

       5:方法的使用中，可以调用当前类的属性和方法
                    特殊的：方法A中又调用了方法A :递归方法
                   方法中不可以定义方法
*
*
*
* */

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.eat();

        customer.sleep(8);

    }
}
class Customer{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }
    public void sleep(int hour){
        System.out.println("休息了"+hour+"个小时");
        eat();
    }
    public String getName(){
        if(age>18){
            return name;
        }else {
            return "Tom";
        }
    }
    public String getNation(String nation){
        String info="我的国籍是："+nation;
        return info;
    }
}

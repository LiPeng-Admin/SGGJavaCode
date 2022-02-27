package com.atguigu.java;
/*
* 一：理解”万事万物皆对象“
    * 1：在Java语言范畴中，我们都将功能，结构等封装到类中，通过类的实例化。来调用具体结构的功能结构
    * 2：涉及到Java 语言与前端Html，后端的数据库交互时，前后端的结构在Java 层面交互时，都体现为类，对象
    *
    *
   二：内存解析的说明
   * 1：引用类型的变量，只可能存储两类值：null或地址值（含变量的类型）
   *
   三：匿名对象
   * new Phone
* */
public class InstanceTest {
    public static void main(String[] args) {
        Phone phone=new Phone();
//        phone=null;
//        System.out.println(phone); //null
//        System.out.println(phone.name); //npe
        phone.sendEmail();
        phone.playGame();
        System.out.println("******************");


        //匿名对象
        new Phone().sendEmail();
        new Phone().playGame();
        new Phone().price=1999;
        new Phone().showPrice(); //0.0
        System.out.println("******************");

        PhoneMall phoneMall=new PhoneMall();
       // phoneMall.show(phone);
        //匿名对象的使用
        phoneMall.show(new Phone());

    }

}


class PhoneMall{
    public void show(Phone phone){

        phone.playGame();
        phone.sendEmail();

    }

}
class Phone{
   double price;
   String name;
   public  void sendEmail(){
       System.out.println("发送邮件");
   }
   public  void playGame(){
       System.out.println("玩游戏");
   }
   public void showPrice(){
       System.out.println("手机价格为："+price);
   }

}

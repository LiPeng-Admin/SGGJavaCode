package com.atguigu.exer;
/*
* 1:创建程序，在其中定义两个类，Person与PersonTest类
* 用setAge()设置人的合法年龄（0-130）,用getAge()返回人的年龄
* 2:
* 2.1.添加构造器，利用构造器设置所有人的age 属性初始化值都为18；
* 2.2 修改上题中类和构造器，增加 name属性，使得每次创建的Person对象的同时初始化对象的age 属性值和name属性值
*
*
*
* */
public class Person {
    private int age;
    private String name;


    //添加构造器
    public Person(){
        age=18;
    }
    public Person(String n,int a){
        name=n;
        age=a;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

    //设置人的合法年龄
    public void setAge(int i){
        if(i>=0&&i<=130){
            age=i;
        }else{
            System.out.println("输入的年龄不合法，请重新输入！！");
        }

    }
    public int getAge(){
        return age;
    }

}

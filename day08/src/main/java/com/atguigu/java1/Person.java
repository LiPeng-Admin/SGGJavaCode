package com.atguigu.java1;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Person.java
 * @Description TODO
 * @createTime 2022年03月10日 07:39:00
 */
public class Person {
    private String name;
    private int age;
     public Person(){

     }
     public Person(String name,int age){
         this.age=age;
      this.name=name;

     }
     public void setName(String name){
         this.name=name;

     }
     public String name(){
         return name;
     }
     public void setAge(int age){
         this.age=age;

     }
     public int getAge(){
         return age;
     }
     public void eat(){
         System.out.println("吃饭了。。。");
     }
     public void walk(int distance){
         System.out.println("走路，走了公里数是："+distance);
         show();
     }
     private void show(){
         System.out.println("我是一个人");
     }
     public Object goRun(){
         return null;
     }
     public double info(){
         return 1.0;
     }
}

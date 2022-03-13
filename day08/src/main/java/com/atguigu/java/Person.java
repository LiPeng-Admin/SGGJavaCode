/**
 * @author lipeng
 * @version 1.0.0
 * @ClassName Person.java
 * @Description TODO
 * @createTime 2022年03月06日 20:21:00
 */
package com.atguigu.java;
public class Person extends Creature{
    String name;
    private int age;
    public Person(){

    }
  public Person(String name,int age){
        this.name=name;
        this.age=age;

  }
  public void eat(){
      System.out.println("吃饭了~~");
      sleep();
  }
  private void sleep(){
      System.out.println("睡觉");
  }
  public void setAge(int age){
        this.age=age;

  }
  public int getAge(){
        return age;
  }


    public void breath() {
    }
}

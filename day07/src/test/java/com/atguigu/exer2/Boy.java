package com.atigui.exer2;

public class Boy {
  //属性
    private String name;
    private  int age;

    //构造器
    public Boy(){

    }
    public Boy(String name,int age){
        this.name=name;
        this.age=age;

    }

  //方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marray(Girl girl){
        System.out.println("我想娶 "+girl.getName());
    }
    public void shout(){
        if(age>22){
            System.out.println("你可以去合法登记结婚了");

        }
        else {
            System.out.println("先多谈谈恋爱");
        }
    }
}

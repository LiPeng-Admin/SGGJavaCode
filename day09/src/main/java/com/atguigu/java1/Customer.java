package com.atguigu.java1;




/**
 * @author admin
 * @version 1.0.0
 * @ClassName Customer.java
 * @Description TODO
 * @createTime 2022年03月18日 22:46:00
 */
public class Customer {
    private String name;
    private int age;
    public Customer(){

    }
    public Customer(String name,int age){
        this.name=name;
        this.age=age;

    }

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

    //重写的原则：比较两个对象的实体内容（即 name 与age ）是否相等
//    public boolean equals(Object obj) {
//        if(this==obj){
//            return true;
//        }
//        if(obj instanceof Customer){
//            Customer customer=(Customer) obj;
//            if(this.age==customer.age&&this.name.equals(customer.name)){
//                return true;
//            }else {
//                return false;
//            }
//
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && name.equals(customer.name);
    }
    //手动
//    public String toString() {
//        return "Customer[name="+name+",age="+age+"]";
//    }

 //自动生成
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.atguigu.exer;
//在PersonTest类中实例化Person 类的对象b,调用setAge()和getAge()方法，体会Java的封装性
public class PersonTest {
    public static void main(String[] args) {
        Person b=new Person();
//        b.setAge(50);
//        b.setAge(-10);
        int age=b.getAge();
        System.out.println("用户输入的合法年龄是："+age);

        Person person=new Person("Tom",20);
        System.out.println("姓名是："+person.getName()+",年龄是："+person.getAge());
    }

}

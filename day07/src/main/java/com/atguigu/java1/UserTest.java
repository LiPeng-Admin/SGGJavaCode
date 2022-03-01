package com.atguigu.java1;
/*
属性赋值的先后顺序
1：默认初始化
2：显示初始化
3：构造器中赋值
4：通过"对象.方法"或"对象.属性"的方式赋值

先后顺序 1->2->3->4
*
*
*
* */
public class UserTest {
    public static void main(String[] args) {
       User u=new User();
        System.out.println(u.getAge());

        User user=new User(2);
        System.out.println(user.getAge());
         user.setAge(5);
        System.out.println(user.getAge());


    }
}
class User{
    //属性
    private String name;
    private int age=1;

    //构造器
    public User(){

    }
    public User(int a){
        age=a;

    }
    //方法
    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }

}

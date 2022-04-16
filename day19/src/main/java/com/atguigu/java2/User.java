package com.atguigu.java2;

import java.util.Objects;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2022年04月13日 23:23:00
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User(String s) {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof User){
            User user=(User) o;
            int compare = this.name.compareTo(user.name);
            if(compare!=0){
                return compare;

            }else {
                return Integer.compare(this.age,user.age);
            }

        }
        throw  new RuntimeException("输入的数据类型不匹配");
    }
}

package com.atguigu.java1;

import java.util.Objects;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2022年04月10日 22:01:00
 */
public class User implements  Comparable{
    private String name;
    private int age;

    public User() {
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
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

    //按照姓名从小到大排序,年龄从小到大排列
    @Override
    public int compareTo(Object o) {
        if(o instanceof  User){
            User user=(User) o;
            int compare= this.name.compareTo(user.name);
            if(compare !=0){
                return compare;
            }else {
                return Integer.compare(this.age,user.age);
            }
        }
        throw  new RuntimeException("数据输出有误");
    }
}

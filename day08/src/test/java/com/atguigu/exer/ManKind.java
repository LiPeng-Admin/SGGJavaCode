package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ManKind.java
 * @Description TODO
 * @createTime 2022年03月08日 08:24:00
 */


/*
*定义一个ManKind 类，包括
* 成员变量int sex 和int salary
* 方法void manOrWoman():根据sex的值显示"main"（sex==1）或者"woman"(sex==0)
* 方法void employeed():根据salary 的值显示”no job“(salary==0)或者"job"(salary!=0)
*
*
*
**/
public class ManKind {
    private int  sex;
    private int salary;

    public ManKind(){

    }
    public ManKind(int sex,int salary){
        this.sex=sex;
        this.salary=salary;
    }

    public void manOrWoman(){
        if(sex==1){
            System.out.println("man");
        }else {
            System.out.println("woman");
        }

    }
    public void employeed(){
        if(salary==0){
            System.out.println("no job");
        }else if(salary!=0){
            System.out.println("job");

        }
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSex() {
        return sex;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
}



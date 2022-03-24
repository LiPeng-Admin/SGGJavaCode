package com.atguigu.exer2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SalariedEmployee.java
 * @Description TODO
 * @createTime 2022年03月24日 08:14:00
 */

/*
 * 定义SalriedEmployee类继承Employee类
 * 实现按月计算工资的员工处理，该类包括：private成员变量monthlySalary;
 * 实现父类的抽象方法earning()，该方法返回monthlySalary值
 * toString（）方法输出员工类型信息及员工的name,number,birthday
 *
 *
 */

public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }
    public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary=monthlySalary;
    }

    public double earning() {
        return monthlySalary;


    }
    public String toString(){
        return "{ SalriedEmployee"+super.toString()+" }";
    }
}

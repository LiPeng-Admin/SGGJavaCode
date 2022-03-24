package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName EmployeeTest.java
 * @Description TODO
 * @createTime 2022年03月23日 22:27:00
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee manager=new Manager("库克",1001,5000,50000);
        manager.work();
        CommonEmployee commonEmployee=new CommonEmployee();
        commonEmployee.work();
    }
}

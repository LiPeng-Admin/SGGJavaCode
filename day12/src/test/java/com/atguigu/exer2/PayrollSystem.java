package com.atguigu.exer2;

import java.util.Scanner;

/*
定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用
利用循环结构遍历数组元素，输出各个对象的类型，name,number,birthday
当键盘输入本月月份值，如果本月是某个Employee对象的生日，还要输出增加工资信息
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入当月月份：");
        int month=scanner.nextInt();
        Employee employee[] = new Employee[2];
        employee[0]=new SalariedEmployee("马森",1001,new MyDate(1994,2,28),5000);
        employee[1]=new HourEmployee("得利",1002,new MyDate(1993,5,6),60,240);
        for(int i=0;i<employee.length;i++){
            System.out.println(employee[i]);
            double salary=employee[i].earning();
            System.out.println("月工资为："+salary);

            if(month==employee[i].getBirthday().getMonth()){
                System.out.println("生日快乐！，奖励100");
            }
        }



    }
}

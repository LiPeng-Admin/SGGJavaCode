package com.atguigu.java3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author lipeng
 * @create 2022/6/1
 */
public class EmployeeData {
    public static List<Employee>getEmployees(){
        List<Employee>list=new ArrayList<>();
        list.add(new Employee(1001,"马化腾",38,16000.34));
        list.add(new Employee(1002,"马云",12,9876.12));
        list.add(new Employee(1003,"刘强东",32,9875.12));
        list.add(new Employee(1004,"雷军",38,9876.12));
        list.add(new Employee(1005,"李彦宏",52,9866.12));
        list.add(new Employee(1006,"比尔盖茨",22,9276.12));
        list.add(new Employee(1007,"任正非",29,9376.12));
        list.add(new Employee(1008,"扎克伯格",18,9896.12));



        return list;
    }
}

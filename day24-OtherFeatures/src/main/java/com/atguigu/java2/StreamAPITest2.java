package com.atguigu.java2;

import com.atguigu.java3.Employee;
import com.atguigu.java3.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description
 * @Author lipeng
 * @create 2022/6/4
 * <p>
 * 测试Stream终止操作
 * 终端操作会从流的流水线生成结果。其结果可以是任何不是流的值，例如：List、Integer，甚至是void 。
 * 流进行了终止操作后，不能再次使用。
 */


public class StreamAPITest2 {
    //1-匹配与查找
    @Test
    public void test1() {
        List<Employee> employees = EmployeeData.getEmployees();
//        allMatch(Predicate p)	检查是否匹配所有元素
        //练习：是否所有员工的年龄都大于18
        boolean b = employees.stream().allMatch(employee -> employee.getAge() > 18);
        System.out.println(b);

//        anyMatch(Predicate p)	检查是否至少匹配一个元素
        //练习：是否存在员工的工资大于 10000
        boolean b1 = employees.stream().anyMatch(employee -> employee.getSalary() > 10000);
        System.out.println(b1);
//        noneMatch(Predicate p)	检查是否没有匹配所有元素
        //练习：是否存在员工姓“马”
        boolean b2 = employees.stream().noneMatch(employee -> employee.getName().startsWith("马"));

        System.out.println(b2);
//        findFirst()	返回第一个元素
        Optional<Employee> optional = employees.stream().findFirst();
        System.out.println(optional);
//        findAny()	返回当前流中的任意元素
        Optional<Employee> optionalEmployee = employees.parallelStream().findAny();
        System.out.println(optionalEmployee);


    }
    @Test
    public void test2(){
        List<Employee> employees = EmployeeData.getEmployees();
        // count()	返回流中元素总数
        long count = employees.stream().filter(employee -> employee.getSalary() > 10000).count();
        System.out.println(count);
//        max(Comparator c)	返回流中最大值
        Stream<Double> doubleStream = employees.stream().map(employee -> employee.getSalary());
        Optional<Double> maxSalary = doubleStream.max(Double::compare);
        System.out.println(maxSalary);
//        min(Comparator c)	返回流中最小值
        //练习：返回最低工资的员工
        Optional<Employee> minSalary = employees.stream().min((employee1, employee2) -> {
            return Double.compare(employee1.getSalary(), employee2.getSalary());

        });
        System.out.println(minSalary);
        System.out.println();

        //forEach(Consumer c)——内部迭代
      employees.stream().forEach(System.out::println);

    }

    //2-归约
    //备注：map 和reduce 的连接通常称为map-reduce 模式，因Google 用它来进行网络搜索而出名。
    @Test
    public void test3(){

        //reduce(T iden, BinaryOperator b)	可以将流中元素反复结合起来，得到一个值。返回T
//        练习1：计算1-10的自然数的和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        //reduce(BinaryOperator b)	可以将流中元素反复结合起来，得到一个值。返回Optional
        //练习2：计算公司所有员工工资的总和

        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Double> doubleStream = employees.stream().map(employee -> employee.getSalary());
        Optional<Double> salarySum = doubleStream.reduce(Double::sum);
        System.out.println(salarySum);

    }
    //3-收集
    @Test
    public void test4(){
        //collect(Collector c)	将流转换为其他形式。接收一个Collector接口的实现，用于给Stream中元素做汇总的方法
        //练习1：查找工资大于6000的员工，结果返回为一个List或Set
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> employeeStream = employees.stream().filter(employee -> employee.getSalary() > 6000);
        List<Employee> collect = employeeStream.collect(Collectors.toList());
        for (Employee employee : collect) {
            System.out.println(employee);

        }
    }

}

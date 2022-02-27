/*
如何从键盘获取不同类型的变量：需要使用Scanner类
具体实现步骤
1：导包:import java.util.Scanner;
2:Scanner 的实例化:Scanner scanner=new Scanner(System.in);
3:调用Scanner类的相关方法，来获取指定类型的变量
* */

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name=scanner.next();
        System.out.println(name);

        System.out.println("请输入你的年龄：");
        int age=scanner.nextInt();
        System.out.println(age);

        System.out.println("请输入你的性别：");
        String gender=scanner.next();
        System.out.println(gender);

        System.out.println("请输入你的体重：");
        double weight=scanner.nextDouble();
        System.out.println(weight);

        System.out.println("你是否对我有意向：");
        boolean isLove=scanner.nextBoolean();
        System.out.println(isLove);



    }
}

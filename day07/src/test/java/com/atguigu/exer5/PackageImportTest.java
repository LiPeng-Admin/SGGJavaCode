package com.atguigu.exer5;
/*
* :一:package 关键字的使用
* 1：使用package 声明类或接口所属的包，声明在源文件的首行
* 2：包，属于标识符，遵循标识符的命名规则
* 3：每"."一次，代表一层文件目录
*
* 二：import 关键字的使用
* 1：在源文件中显式的使用import 结构导入指定包下的类，接口
* 2：声明在包的声明和类的声明之间
* 3：如果使用的类或接口是 java.lang 包下定义的，则可以省略import 结构
* 4：如果使用的类或接口是本包下定义的，则可以省略 import 结构
* 5：如果在源文件中，使用不同包下的同名的类，则必须至少有一个类需要以全类名(包含包名的类名)的方式显示
*6：import static：导入指定类或接口中的静态结构:属性或方法
*
*
*
* */

import static java.lang.System.*;
import  static java.lang.Math.*;

public class PackageImportTest {
    public static void main(String[] args) {

        //以全类名方式显示

        com.guigu.exer3.Account account1=new com.guigu.exer3.Account(1000,2000,0.0123);

        com.guigu.exer4.Account account=new com.guigu.exer4.Account(1000);

        out.println("hello");

        double d=Math.round(123.123);
        out.println(d);


    }

}

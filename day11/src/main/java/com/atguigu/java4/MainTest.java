package com.atguigu.java4;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName MainTest.java
 * @Description main()方法的使用说明
 * @createTime 2022年03月20日 21:36:00
 */
/*
* main()方法的使用说明
* 1：main()方法作为程序的入口
* 2:main()方法也是一个普通的静态方法
* 3：main()方法可以作为我们与控制台交互的方式
*
* */
public class MainTest {
    public static void main(String[] args) { //入口
        Main.main(new String[100]);

    }

}
class Main{
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            args[i]="args"+i;
            System.out.println(args[i]+" ");
        }

    }
}

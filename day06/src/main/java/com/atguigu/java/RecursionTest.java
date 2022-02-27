package com.atguigu.java;
/*
* 递归方法的使用
* 1：递归方法：一个方法内调用它本身
* 2：方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无需循环控制，
*    递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环
*
* */
public class RecursionTest {
    public static void main(String[] args) {
        //例一：计算1-100之间所有自然数的和
        //方式一：
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);

        //方式二：递归:计算1-n之间所有自然数的和
        RecursionTest recursionTest=new RecursionTest();
        int sum1=recursionTest.getSum(100);
        System.out.println(sum1);

        //例二：递归:计算(n阶乘)n!算法

        int product=recursionTest.getProduct(50);
        System.out.println(product);



        /*例三：已知一个数列：f(0)=1;f(1)=4;f(n+2)=2*f(n+1)+f(n),
        其中n 是大于0的整数，求f(10)
        *
        * */
        int f1=recursionTest.f(10);
        System.out.println(f1);

        //例四：斐波那契数列：1 1 2 3 5 8 13 21 ...
        //f(n)=f(n-1)+f(n-2)

        //例五：汉诺塔问题

        //快排


    }
    public int getSum(int n){
        if(n==1){
            return 1;
        }else{
            return n+getSum(n-1);
        }
    }
    public int getProduct(int n){
        if(n==1){
            return 1;
        }else{
            return n* getSum(n-1);
        }
    }
    public int f(int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return 4;
        }else{
            return 2*f(n-1)+f(n-2);
        }
    }

}

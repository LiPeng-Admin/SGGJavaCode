package com.atguigu.exer;
/*
1:编写程序，定义三个重载方法并调用，方法名为mOL
三个方法分别接收一个int 参数，两个int 参数，一个字符串参数
分别执行平方运算，相乘并输出结果，输出字符串信息
在主类的main()方法中分别用参数区别调用三个方法
2：定义三个重载方法max(),第一个方法求两个int 值中的最大值，
                       第二个方法求两个double值得最大值，
                       第三个方法求三个double值的最大值
                      ，
*
*
* */
public class OverLoadExer {
    public static void main(String[] args) {
        OverLoad overLoad=new OverLoad();
        overLoad.mOL(3);
        overLoad.mOL(3,5);
        overLoad.mOL("hello world");
        System.out.println("********************");

        OverLoadMax overLoadMax=new OverLoadMax();
        overLoadMax.max(3,6);
        overLoadMax.max(0.3,0);
        overLoadMax.max(0.4,0.9,0.5);

    }
}
 class OverLoad{
    public void mOL(int i){
        System.out.println(i*i);
    }
    public void mOL(int x,int y){
        System.out.println(x*y);
    }
    public  void mOL(String string){
        System.out.println(string);
    }
}
class OverLoadMax{
    public void max(int x,int y){
        System.out.println(x>y?x:y);

    }
    public  void max(double d1,double d2){
        System.out.println(d1>d2?d1:d2);
    }
    public void max(double d1,double d2,double d3){
        if(d1>d2){

             if(d3>d1){
                System.out.println("最大值为："+d3);
            }else {
                System.out.println("最大值为："+d1);
            }
        }
        else {
            if(d2<d3){
                System.out.println("最大值为："+d3);
            }else {
                System.out.println("最大值为："+d2);
            }
        }
    }
}

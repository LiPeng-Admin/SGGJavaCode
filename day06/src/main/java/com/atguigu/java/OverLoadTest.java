package com.atguigu.java;

/*
* 方法的重载
*   定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或参数类型不同即可
*         "两同一不同"：同一个类，相同方法名
*                     参数列表不同：参数个数不同，参数类型不同
*   举例：
*        Arrays类中重载的sort()/binarySearch()
*
*   判断是否是重载：
*         与方法的权限修饰符，返回值类型，形参变量名，方法体没有关系
*
*   再通过对象调用方法时，如何确定某一个指定的方法
* 方法名--->参数列表
*
* */
public class OverLoadTest {

    public static void main(String[] args) {

        OverLoad overLoad=new OverLoad();
        overLoad.getSum(1,2);
        overLoad.getSum(0.1,0.4);
        overLoad.getSum(1,"1");
        overLoad.getSum("2",3);

    }

}
class OverLoad{
    public  void getSum(int x,int y){
        System.out.println("两个整数想加的和："+(x+y));

    }
    public void getSum(double d1,double d2){
        System.out.println("两个小数相加是："+(d1+d2));

    }
    public void getSum(int x,String s){
        System.out.println("整数与字符串相加是："+(x+s));

    }
    public  void getSum(String s,int x){
        System.out.println("字符串与整数相加是："+(s+x));

    }
}

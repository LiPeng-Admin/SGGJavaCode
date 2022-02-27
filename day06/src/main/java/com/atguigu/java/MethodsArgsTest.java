package com.atguigu.java;
/*
可变形参的方法
具体使用
1：可变形参的格式：数据类型 ... 变量名
2:当调用可变个数形参的方法时，传入的参数可以是：0,1,2,。。。
3:可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
4：可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载
5:可变个数形参在方法的形参中，必须声明在末尾
6：可变个数形参在方法的形参中，最多只能声明一个可变形参
*/


public class MethodsArgsTest {
    public static void main(String[] args) {
        MethodArgs methodArgs=new MethodArgs();
//        methodArgs.show(12);
//        methodArgs.show("hello");
//        methodArgs.show()
//        methodArgs.show("hello","world");
        methodArgs.show("AA","BB","CC");


    }

}
class MethodArgs{
    public void show(int i){

    }
//    public  void show(String s){
//        System.out.println(s);
//
//    }
    public  void show(String ... strings){
//        System.out.println("show(String ... strings)");
        for(int i=0;i<strings.length;i++){
            System.out.print(strings[i]+" ");
        }


    }
//    public void show(String [] strings){
//
//    }
    //可变个数形参在方法的形参中，必须声明在末尾
    public void show(int i,String... strings){

    }
}




/*
* 运算符之五：位运算符（了解）
* 1:位运算符操作的都是整型的数据
* 2：<< :在一定范围内，每向左一位，相当于*2
*    >> ,同理，在一定范围内，每向左一位，相当于/2
* */
public class BitTest {
    public static void main(String[] args) {
        int i=21;
        System.out.println("i <<2:"+(i<<2));
        System.out.println("i <<3:"+(i<<3));
        //
        int m1=12;
        int n1=5;
        System.out.println("m1&n1:"+(m1&n1));
        System.out.println("m1|n1:"+(m1|n1));
        System.out.println("m1^n1:"+(m1^n1));

        //交换两个变量的值
        int num1=10;
        int num2=20;
         //方法一：定义一个中间变量
         //推荐的方式
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("num1="+num1+",num2="+num2);
        //方法二：
        //缺点：1：相加操作可坑超出存储范围:2：有局限性
//        num1=num1+num2;
//       num2= num1-num2;
//       num1=num1-num2;
//        System.out.println("num1="+num1+",num2="+num2);

    }
}

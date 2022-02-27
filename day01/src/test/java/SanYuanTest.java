/*
运算符之六：三元运算符
(条件表达式)?表达式1：表达式2
说明：
1：条件表达式的结果为boolean 类型
2：如果表达式为true ，则执行表达式1，若表达式为false，则执行表达式2
3:凡是可以使用三元运算符的，均可以使用if..else,反之，不成立
* */

public class SanYuanTest {
    public static void main(String[] args) {
        //获取两个整数的最大值
        int m=2;
        int n=5;
        int max=m>n ?m:n;
        System.out.println(max);
        //获取三个数的最大值
        int n1=13;
        int n2=34;
        int n3=-3;

        int max1=n1>n2?n1:n2;
        int max2=max1>n3?max1:n3;
        System.out.println(max2);

    }
}

/*
* 强制类型转换:自动类型提升运算的逆运算
* 1：需要使用强转符：()
* 2:注意：强制转换可能导致精度损失
*
* 整型常量，默认类型为int型
* 浮点型常量，默认是double 型

 */
public class VariableTestThree {
    public static void main(String[] args) {
        //精度损失
        double d1=12.7;
        int i1= (int) d1; //截断操作
        System.out.println(i1);
        //精度损失
        int i2=128;
        byte b=(byte) i2;
        System.out.println(b);
        //没有精度损失
        long l1=128l;
        short s2=(short) l1;
        System.out.println(s2);
    }
}

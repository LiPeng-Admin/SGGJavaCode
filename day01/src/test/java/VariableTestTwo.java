/*
基本数据类型之间的运算规则
1：自动类型提升
当容量小的数据类型的变量与容量大的数据类型的变量做运算，结果自动提升为容量大的数据类型
注意：当byte,char,short三中类型的变量做运算时，结果为int 型

2：强制类型转换
* */


public class VariableTestTwo {
    public static void main(String[] args) {
        byte b1=2;
        int i1=128;
        int b2=b1+i1;

        System.out.println(b2);
        short s1=20;
        double d1=s1;
        System.out.println(d1);
        //******************
        char c1='a';
        int i2=12;
        int i3=c1+i2;
        System.out.println(i3);

        byte b3=5;
        char c2='c';
        int i4=b3+c2;
        System.out.println(i4);

    }
}

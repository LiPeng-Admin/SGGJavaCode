/*
运算符之一：算术运算符
* */
public class AriTest {
    public static void main(String[] args) {
        //除号
        int num1=12;
        int num2=5;
        int result=num1 /num2;
        System.out.println(result); //2
        int result2=num1 /num2 *num2;
        System.out.println(result2); //10

        double result3=(double)num1 /num2;
        System.out.println(result3);
        //取模（取余）运算
        //结果的符号与被模数相同
        int m1=12;
        int n1=5;
        System.out.println("m1%n1= "+m1 %n1);
        int m2=-12;
        int n2=5;
        System.out.println("m2%n2= "+m2 %n2);
        int m3=12;
        int n3=-5;
        System.out.println("m3%n3= "+m3 %n3);
        int m4=-12;
        int n4=-5;
        System.out.println("m4%n4= "+m4 %n4);

        //a++与++a
        //++a:先自增1，后运算
        //a++:先运算，后自增1

        int a1=10;
        int b1=++a1;
        System.out.println("a1="+a1+",b1="+b1);//a1=11;b1=10

        int a2=10;
        int b2=a2++;
        System.out.println("a2="+a2+",b2="+b2);//a2=11;b2=10

        //注意点：自增1不会改变变量的数据类型
        short s1=10;
//        s1=s1+1  //编译失败
          s1++; //编译成功
        System.out.println("s1= "+s1);

        //问题
        byte bb1=127;
        bb1++;
        System.out.println("bb1= "+bb1); //-128
    }
}

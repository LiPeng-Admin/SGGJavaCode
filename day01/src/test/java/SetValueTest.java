/*
*运算符之二：赋值运算符
* */
public class SetValueTest {
    public static void main(String[] args) {
        //连续赋值
        int i1,j1;
        i1=j1=10;

        int i2=10,j2=20;
        System.out.println(i2);

        short s1=10;
//        s1=s1+1; //编译失败
          s1+=1; //不会改变变量本身的数据类型
        System.out.println(s1);
        //练习
        int m=2;
        int n=3;
        n*=m++;
        System.out.println("m="+m); //m=3
        System.out.println("n="+n); //6

        int n2=10;
        n2+=(n2++)+(++n2);
        System.out.println(n2); //32

    }
}

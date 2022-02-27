/*
Java 中的数据类型
1:变量按照数据类型来分
基本数据类型：
                            数值型：整数类型:byte,short,int,long
                            浮点类型:float,double
                            字符型：char
                            布尔型:boolean

引用数据类型：
                            类：class  (字符串再这里)
                            接口：interface
                            数组：array
 2：变量在类中声明的位置
                            成员变量
                            局部变量
*/
public class VariableTestOne {
    public static void main(String[] args) {
        //1:整型:byte(1字节=8bit),short(2个字节)，int(4个字节)，long(8个字节)
        //byte范围：-128~127
        byte b1=12;
        byte b2=-128;
        System.out.println(b1);
        System.out.println(b2);

        //声明long型变量必须以"l"或"L"结尾
        //通常，定义整型变量时，使用int 型
        long l1=213456457L;
        System.out.println(l1);

        //2:浮点型：float(4个字节),double(8个字节)
        //浮点型，表示带小数点的数值
        //float表示数值的范围超过long
        double d1=123456.2;
        System.out.println(d1);
        //定义float 类型变量时，变量要以"f"或"F"结尾
        //通常定义浮点型变量时，使用double
        float f1=125.5f;
        System.out.println(f1);

        //3:字符型：char(1字符=2个字节)
        //定义char 型变量，通常使用一对 '',内部只能写一个字符
        char c1='a';
        c1='A';
        System.out.println(c1);
        char c2='中';
        System.out.println(c2);
        //表示方式：1：声明一个字符，2：转义字符，3：直接使用Unicode 来表示字符型常量
        char c3='\n'; //换行符
        c3='\t'; //制表符
        System.out.print("Hello"+c3);
        System.out.println("World");
        char c4='\u0043';
        System.out.println(c4);

        //布尔型：boolean
        //只能去两个值之一：true,false
        //常用于条件判断，循环结构中使用
        boolean bl=true;
        System.out.println(bl);



    }
}

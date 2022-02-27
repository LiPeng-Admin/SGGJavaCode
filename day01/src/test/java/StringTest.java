/*
String 类型不是基本数据类型，属于引用数据类型
String 可以和基本数据类型变量做运算，且运算只能连接运算：+,
        运算结果仍为String 类型
* */
public class StringTest {
    public static void main(String[] args) {
        String s1="Hello World";
        System.out.println(s1);

        //********************
        int number=1001;
        String numberStr="学号:";
        String info=numberStr+number;
        System.out.println(info);
        boolean b1=true;
        String infoOne=info+b1; //+:连接运算
        System.out.println(infoOne);

        //********************
        char c='a'; //97  A:65
        int num=10;
        String str="hello";
        System.out.println(c+num+str);  //107hello
        System.out.println(c+str+num);  //ahello10
        System.out.println(c+(num+str)); //a10hello
        System.out.println((c+num)+str); //107hello
        System.out.println(str+num+c);   //hello10a

        //**********************
//        String str1=123;  //编译不通过
        String str2=123+"";
        System.out.println(str2);

    }
}

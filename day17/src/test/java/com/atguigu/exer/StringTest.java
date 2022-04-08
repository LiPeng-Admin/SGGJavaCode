package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName StringTest.java
 * @Description TODO
 * @createTime 2022年04月04日 10:42:00
 */
public class StringTest {
    String str=new String("good");
    char[] ch={'t','e','s','t'};
    public void change(String str,char[] ch){
        str="test ok";
        ch[0]='b';
    }

    public static void main(String[] args) {
        StringTest ex=new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str); //good
        System.out.println(ex.ch);//best

    }

}

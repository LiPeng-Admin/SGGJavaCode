package com.atguigu.exer2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InterviewTest.java
 * @Description TODO
 * @createTime 2022年03月18日 20:52:00
 */
public class InterviewTest {
    public static void main(String[] args) {
        Base1 base1=new Sub1();
        base1.add(1,2,3); //sub_1
        Sub1 sub1=(Sub1) base1;
        sub1.add(1,2,3);//sub_2

    }
}
class Base1{
    public void add(int a,int ...arr){ //int [] arr
        System.out.println("base1");
    }
}
class Sub1 extends  Base1{
    @Override
    public void add(int a, int[] arr) {
        System.out.println("sub_1");
    }
    public void add(int a,int b,int c){
        System.out.println("sub_2");
    }
}

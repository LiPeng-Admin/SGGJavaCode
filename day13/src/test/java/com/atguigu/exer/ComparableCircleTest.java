package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ComparableCircleTest.java
 * @Description TODO
 * @createTime 2022年03月26日 14:38:00
 */
public class ComparableCircleTest {
    public static void main(String[] args) {
        CompareCircle c1=new CompareCircle(2.3);
        CompareCircle c2=new CompareCircle(2.5);

        int compare=c1.compareTo(c2);
        if(compare>0){
            System.out.println("c1圆大");
        }else if(compare <0){
            System.out.println("c2圆大");
        }else{
            System.out.println("c1圆与c2圆相等");
        }

    }
}

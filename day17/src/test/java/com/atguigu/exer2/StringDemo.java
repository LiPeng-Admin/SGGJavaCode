package com.atguigu.exer2;

import org.junit.Test;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName StringDemo.java
 * @Description TODO
 * @createTime 2022年04月05日 18:28:00
 */
/*
* 将一个字符串进行反转，将字符串中指定部分进行反转，比如"abcdefg"反转为"abfedcg"
* //方式一：转换为char[]
*
* //使用StringBuffer，StringBuilder替换String
*
*
* */
public class StringDemo {
    public String reverse(String str,int startIndex,int endIndex){
        if(str!=null){
            char[] chars = str.toCharArray();
            for (int i= startIndex,j=endIndex; i < j; i++,j--) {
                char temp=chars[i];
                chars[i]=chars[j];
                chars[j]=temp;

            }
            return new String(chars);

        }
        return null;
    }

    public String reverse1(String str,int startIndex,int endIndex){
        if(str!=null){
            StringBuilder stringBuilder=new StringBuilder(str.length());
            //第一部分
            stringBuilder.append(str.substring(0,startIndex));
            //第二部分：
            for (int i = endIndex; i >= startIndex; i--) {
                stringBuilder.append(str.charAt(i));

            }
            //第三部分
            stringBuilder.append(str.substring(endIndex+1));
            String string = stringBuilder.toString();

            return string;
        }
        return null;
    }
    @Test
    public void testReverse(){
        String str2="abcdefg";
        String reverse = reverse(str2,2,5);
        System.out.println(reverse);

    }
    @Test
    public  void testReverse2(){
        String str2="abcdefg";
        String reverse=reverse1(str2,2,5);
        System.out.println(reverse);
    }
}

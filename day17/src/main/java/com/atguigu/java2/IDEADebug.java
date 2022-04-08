package com.atguigu.java2;

import org.junit.Test;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName IDEADebug.java
 * @Description TODO
 * @createTime 2022年04月05日 23:16:00
 */
public class IDEADebug {
    @Test
    public void testStringBuffer(){
        String str=null;
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//"null"
        StringBuffer sb1=new StringBuffer(str);//抛异常：NullPointerException
        System.out.println(sb1);//

    }
}

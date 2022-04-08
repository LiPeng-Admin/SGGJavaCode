package com.atguigu.exer2;

import org.junit.Test;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName StringDemo1.java
 * @Description TODO
 * @createTime 2022年04月05日 21:59:00
 */
/*
 * 获取一个字符串在另一个字符串中出现的次数
 * 比如:获取“ab”在“abkkcadkabkebfkabkskab” 中的出现的次数
 *
 *
 * */
public class StringDemo1 {
    public int getCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLenth = subStr.length();
        int count = 0;
        int index=0;
        if (mainLength >= subLenth) {
            //方式一：
//            while ((index = mainStr.indexOf(subStr)) != -1) {
//                count++;
//                mainStr = mainStr.substring(index + subStr.length());
//
//            }

            //方式二：对方式一进行改进
            while ((index=mainStr.indexOf(subStr,index))!=-1){
                count++;
                index+=subLenth;
            }
            return count;
        }
        return 0;
    }

    @Test
    public void testGetCount() {
        String mainStr = "abkkcadkabkebfkabkskab";
        String subStr = "ab";
        int count = getCount(mainStr, subStr);
        System.out.println(count);
    }

}

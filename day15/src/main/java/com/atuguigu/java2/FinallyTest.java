package com.atuguigu.java2;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName FinallyTest.java
 * @Description finally
 * @createTime 2022年03月27日 16:42:00
 */

//try-catch快捷键：选中代码-ctrl+alt+t
/*
* finally{
 * 一定会执行的代码
 * }
 * 1:finally 是可选的
 * 2：finally 中声明的是一定会被执行的代码，即使catch 中又出现异常了，try中又return 语句，catch 中有return语句等情况
 * 3:对于数据库链接，输入输出流，网络编程socket等资源，jvm 是不能自动回收的我们需要自己手动的资源的释放
 * 此时的资源释放就需要声明在finally 当中
*
*
* */
public class FinallyTest {
    @Test
    public void test3(){
        FileInputStream fileInputStream=null;
        try {
            File file=new File("hello.txt");
           fileInputStream=new FileInputStream(file);
            int data=fileInputStream.read();
            while (data!=-1){
                System.out.print((char) data);
                data=fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(fileInputStream!=null)
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




    @Test
    public void test2(){
        int num=method();
        System.out.println(num);
    }

    public int method(){
        try{
            int []arr=new int[5];
            System.out.println(arr[5]);
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("数组角标越界");
            return 3;
        }
    }



  @Test
    public void test1(){
     try{
         int a=10;
         int b=0;
         System.out.println(a/b);
     }catch (ArithmeticException e){
         e.printStackTrace();
     }catch (Exception e){
         e.printStackTrace();
     }finally {
         System.out.println("0不能作为被除数");
     }
  }

}

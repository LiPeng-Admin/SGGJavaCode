package com.atguigu.java;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/8
 */

import org.junit.Test;

import java.io.*;

/**
 * \
 * 处理流之二：转换流的使用
 * 1：转换流:属于字符流
 * InputStreamReader：将一个字节的输入流转换为字符的输入流
 * OutputStreamWriter：将一个字符的输出流转换为字节的输出流
 * 2：作用：提供字节流与字符流之间的转换
 *
 * 3：字符集
 */

public class InputStreamReaderTest {
    @Test
    public void test() {
        InputStreamReader inputStreamReader1 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\java_code\\SGGJavaCode\\note");
//        InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);//使用系统默认的字符集

            //参数2指明了字符集，具体使用什么字符集，取决于文件node.txt保存时使用的字符集
            inputStreamReader1 = new InputStreamReader(fileInputStream, "UTF-8");
            char[] cbuf = new char[20];
            int len;
            while ((len = inputStreamReader1.read(cbuf)) != -1) {
                String str = new String(cbuf, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (inputStreamReader1 != null)
                    inputStreamReader1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    //综合使用InputStreamReader 和OutputStreamWriter
    @Test
    public void test2() {
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            File file1 = new File("E:\\java_code\\SGGJavaCode\\note");
            File file2 = new File("E:\\java_code\\SGGJavaCode\\note_gbk");

            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);

            inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, "gbk");

            char[] cbuf = new char[20];
            int len;
            while ((len = inputStreamReader.read(cbuf)) != -1) {
                outputStreamWriter.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

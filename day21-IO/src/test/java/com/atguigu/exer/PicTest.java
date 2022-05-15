package com.atguigu.exer;

import org.junit.Test;

import java.io.*;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/8
 */

public class PicTest {
    //实现图片的加密
    @Test
    public void test1() {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            File srcFile = new File("vscode.png");
            File destFile = new File("copyvscode.png");
            inputStream = new FileInputStream(srcFile);
            outputStream = new FileOutputStream(destFile);
            byte[] buffer = new byte[20];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                //字节数组进行修改
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                outputStream.write(buffer, 0, len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    //图片的解密
    @Test
    public void test2() {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            File srcFile = new File("copyvscode.png");
            File destFile = new File("newVscode.png");
            inputStream = new FileInputStream(srcFile);
            outputStream = new FileOutputStream(destFile);
            byte[] buffer = new byte[20];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {

                //对字节文件修改
                for (int j = 0; j < len; j++) {
                    buffer[j] = (byte) (buffer[j] ^ 5);
                }
                outputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

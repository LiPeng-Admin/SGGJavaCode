package com.atguigu.java;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/4
 */

import org.junit.Test;

import java.io.*;

/**
 * 测试FileInputStream和FileOutputStream 的使用
 *
 * 结论：对于文本文件(如：.txt...)，使用字符流进行处理。
 * 对于非文本文件(如：.jpg,.mp3,.avi,.ppt,.doc...)，使用字节流进行处理,
 */
public class FileInputOutputStreamTest {
    //使用字节流FileInputStream 处理文本文件，可能出现乱码问题
    @Test
    public void testFileInputStream() {
        FileInputStream inputStream = null;
        try {
            //1:造文件
            File file = new File("hello.txt");

            //2:造流
            inputStream = new FileInputStream(file);
            //3:读数据
            byte[] buffer = new byte[5];
            int len; //记录每次读取的字节个数
            while ((len = inputStream.read(buffer)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(buffer[i] + " ");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4:关闭流资源
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
    //实现对图片的复制

    @Test
    public void testFileInputOutStream() {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            File srcFile = new File("postman.png");
            File destFile = new File("pc.png");

            inputStream = new FileInputStream(srcFile);
            outputStream = new FileOutputStream(destFile);

            byte[] buffer = new byte[5];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
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

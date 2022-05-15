package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/8
 */
/*
 * 处理流之一：缓冲流
 *
 *  BufferedInputStream
 *  BufferedOutputStream
 *  BufferedReader
 *  BufferedWriter
 *
 * 2：作用：提供流的读取，写入的速度
 *        提高读写速度的原因：内部提供了一个缓冲区
 *
 * 3：处理流，就是“套接”在已有流的基础上
 *
 *
 * */
public class BufferedTest {
    /**
     * 实现非文本文件的复制
     */
    @Test
    public void testBufferStreamTest() {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1:造文件
            File srcFile = new File("postman.png");
            File destFile = new File("post.png");

            //2:造流
            //2.1造节点流
            inputStream = new FileInputStream(srcFile);
            outputStream = new FileOutputStream(destFile);
            //2.2:造缓冲流
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            //3:复制的细节：读取，写入
            byte[] buffer = new byte[10];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4:资源关闭
            //要求：先关闭外层流，在关闭内层流
            //说明：关闭外层流的同时，内层流也会自动的进行关闭。关于内层流的关闭可以省略
            try {
                if (bufferedInputStream != null)
                    bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedOutputStream != null)
                    bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
//            try {
//                inputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }


    }

    //实现文件复制的方法
    public void copyFileWtihBufferd(String srcFPath, String destPath) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1:造文件
            File srcFile = new File(srcFPath);
            File destFile = new File(destPath);

            //2:造流
            //2.1造节点流
            inputStream = new FileInputStream(srcFile);
            outputStream = new FileOutputStream(destFile);
            //2.2:造缓冲流
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            //3:复制的细节：读取，写入
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4:资源关闭
            //要求：先关闭外层流，在关闭内层流
            //说明：关闭外层流的同时，内层流也会自动的进行关闭。关于内层流的关闭可以省略
            try {
                if (bufferedInputStream != null)
                    bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedOutputStream != null)
                    bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
//            try {
//                inputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }


    }

    @Test
    public void testCopyFileWithBufferd() {
        long start = System.currentTimeMillis();
        String srcPath = "E:\\java_code\\SGGJavaCode\\video\\ding.mp4";
        String destPath = "E:\\java_code\\SGGJavaCode\\video\\ding22.mp4";

        copyFileWtihBufferd(srcPath, destPath);
        long end = System.currentTimeMillis();
        System.out.println("复制需要的时间：" + (end - start));
    }

    /*
     *使用BufferedReader, BufferedWriter实现文本文件的复制
     *
     * */
    @Test
    public void testBufferdReadAndWriter() {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            File srcFile = new File("E:\\java_code\\SGGJavaCode\\note");
            File destFile = new File("E:\\java_code\\SGGJavaCode\\note2");

            FileReader fileReader = new FileReader(srcFile);
            FileWriter fileWriter = new FileWriter(destFile);

            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);
              //方式一：
//            char[] cbuf = new char[1024];
//            int len;
//            while ((len = bufferedReader.read(cbuf)) != -1) {
//                bufferedWriter.write(cbuf, 0, len);
//            }
            //方式二：
            String data;
            while ((data=bufferedReader.readLine())!=null){
                //方法1：
//                bufferedWriter.write(data+"\n");
                //方法2：
                bufferedWriter.write(data);
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
//        fileReader.close();
//        fileWriter.close();

        }


    }


}




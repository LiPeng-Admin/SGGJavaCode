package com.atguigu.java;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/4
 */

import org.junit.Test;

import java.io.*;

/**
 * 一：流的分类
 * 1：操作数据单位：字节流，字符流
 * 2：数据的流向：输入流，输出流
 * 3：流的角色： 节点流，处理流
 * 二：流的体系结构
 * 抽象基类             节点流(文件流)                缓冲流（处理流的一种）
 *
 * InputStream         FileInputStream           BufferedInputStream
 * OutputStream        FileOutputStream          BufferedOutputStream
 * Reader              FileReader                BufferedReader
 * Writer              FileWriter               BufferedWriter
 */
public class FileReadWriteTest {
    /*
     * 将day21-IO下的hello.txt文件内容读入程序中，并输出到控制台中
     *  说明点：
     * 1：read()方法的理解：返回读入的一个字符，如果达到文件的末尾，则返回-1
     * 2：异常的处理：为了保证资源一定可以执行关闭操作，需要使用try-catch-finally处理
     * 3:读入的文件一定要存在，否则会报异常
     *
     * */
    @Test
    public void test1() {
        FileReader reader = null;
        try {
            //1:实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");
            //2:提供具体的流
            reader = new FileReader(file);
            //3:数据 的读入
            //返回读入的一个字符，如果达到文件的末尾，则返回-1
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data + " ");
                data = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4:流的关闭操作
            try {
                if (reader != null) {
                    reader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    //对read()操作升级：使用read 的重载方法

    @Test
    public void test2() {
        FileReader fileReader = null;
        try {
            //1:File 类的实例化
            File file = new File("hello.txt");
            //2:FileReader流的实例化
            fileReader = new FileReader(file);
            //3:读入的操作
            //read(char cbuf):返回每次读入cbuf数组中的字符串个数，如果文件达到末尾，返回-1
            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read(cbuf)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i] + " ");

                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4:资源的关闭
            try {
                if (fileReader != null) {
                    fileReader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    /*
     * 从内存中写出数据到硬盘的文件里
     * 说明：
     *   1：输出操作，对应的file文件可以不存在，
     *       如果不存在，在输出的过程中，会自动创建此文件
     *       如果存在，
     *           如果流使用的构造器是：FileWriter(file)/FileWriter(file,false),对原有文件覆盖
     *           如果流使用的构造器是：FileWriter(file,true),不会对原有文件覆盖，而是在原有的文件基础上追加内容
     * */
    @Test
    public void testFileWriter() {
        FileWriter fileWriter = null;
        try {
            //1:提供File类的对象，指明写出到的文件
            File file = new File("he.txt");
            //2:提供FileWriter的对象，用于数据的写出
            fileWriter = new FileWriter(file, false);
            //3:写出的操作
            fileWriter.write("I have a dream\n");
            fileWriter.write("You need to have a dream");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4:流资源的关闭
            try {
                if (fileWriter != null)

                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    //读入写出


    @Test
    public void testFileReaderAndWriter() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //1:提供File 类的对象，指明写入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");
            //2:创建输入和输出流
            fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(destFile);
            //3:数据的写入和写出操作
            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read(cbuf)) != -1) {
                //每次写出len 字符
                fileWriter.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4:流资源的关闭
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}

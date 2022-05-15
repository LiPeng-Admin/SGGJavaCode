package com.atguigu.java;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/8
 */

import org.junit.Test;

import java.io.*;

/**
 * 其他流的使用(了解内容)
 * 1:标准的输入，输出流
 * 2：打印流
 * 3：数据流
 */
public class OtherStreamTest {
    public OtherStreamTest() throws FileNotFoundException {
    }

    /*
     * 标准的输入，输出流
     * 1.1
     * System.in:标准的输入流，默认从键盘输入
     * System.out:标准的输出流，默认从控制台输出
     * 1.2
     * System类的setIn()/setOut(),方式重新指定输入和输出的流
     * 1.3练习
     * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出，，然后继续进行输入操作，直到当输入“e”或者“exit”时，退出程序
     *
     *
     *
     * */
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                System.out.println("请输入字符：");
                String data = bufferedReader.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
                    System.out.println("程序结束");
                    break;


                }
                String s = data.toUpperCase();
                System.out.println(s);


            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    /*
       打印流
     * PrintStream和PrintWriter
     * 提供了一系列重载的print()和println()方法，用于多种数据类型的输出
     * System.out返回的PrintStream的实例
     *
     *
     * */
    @Test
    public void test() throws FileNotFoundException {
        PrintStream printStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\java_code\\SGGJavaCode\\io\\text.txt"));
            printStream = new PrintStream(fileOutputStream, true);
            if (printStream != null) {
                System.setOut(printStream);
            }
            for (int i = 0; i < 255; i++) {
                System.out.println((char) i);
                if (i % 50 == 0) {
                    System.out.println();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (printStream != null)
                printStream.close();
        }


    }

    /*数据流
     * 为了方便操作Java语言的基本数据类型和String 的数据，可以使用数据流
     * 数据流有两个类（用于读取和写出基本数据类型，String类的数据）
     *DataInputStream,DataOutputStream
     *
     * */
    @Test
    public void test2() throws IOException {
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream("data.txt"));
            dataOutputStream.writeUTF("张三");
            dataOutputStream.writeInt(28);
            dataOutputStream.writeBoolean(true);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataOutputStream != null)
                dataOutputStream.close();
        }

    }
    /*
    将文件中存储的基本数据类型变量和字符串读取到内存中，保存在变量中
    注意点：读取不同类型数据的顺序需要与当初写入文件时的顺序保持一直
    *
    * */

    @Test
    public void test3() throws IOException {
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new FileInputStream("data.txt"));
            String name = dataInputStream.readUTF();
            int age = dataInputStream.readInt();
            boolean isMale = dataInputStream.readBoolean();
            System.out.println("name=" + name + ",age=" + age + ",isMale=" + isMale);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null)
                dataInputStream.close();

        }


    }


}







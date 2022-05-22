package com.atguigu.java;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/15
 */
/*
 * 实现TCP的网络编程
 * 例子1：客户端发送信息给服务端，服务端将数据显示在控制台上
 *
 * */
public class TCPTest1 {
    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            //1:创建Sockek对象，指明服务器端的ip 和端口号
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress, 8899);
            //2：获取一个输出流，用于输出数据
            outputStream = socket.getOutputStream();
            //3:写出数据的操作
            outputStream.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //资源的关闭
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }

    //服务端
    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            //1:创建服务器端的ServerSocket,指明自己的端口号
            serverSocket = new ServerSocket(8899);
            //2:调用socket()表示接收来自于客户端的socket
            accept = serverSocket.accept();
            //3：获取输入流
            inputStream = accept.getInputStream();
            //不建议，可能出现乱码
//        byte[] buffer=new byte[20];
//        int len;
//        while ((len=inputStream.read(buffer))!=-1){
//            String str=new String(buffer,0,len);
//            System.out.println(str);
//        }
            //4：读取输入流中的数据
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[10];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, len);
            }
            System.out.println(byteArrayOutputStream.toString());
            System.out.println("收到来自于："+accept.getInetAddress().getHostAddress()+"的数据");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5:关闭资源
            try {
                if (byteArrayOutputStream != null)
                    byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (accept != null)
                    accept.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}

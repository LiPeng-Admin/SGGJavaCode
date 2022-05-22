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
 * 例3：客户端发送文件给服务器，服务器将文件保存在本地，并返回“发送成功”给客户端
 *
 *
 *
 * */
public class TCPTest3 {
    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        FileInputStream fileInputStream = null;
        try {
            InetAddress address = InetAddress.getByName("127.0.0.1");
            socket = new Socket(address, 9090);
            outputStream = socket.getOutputStream();
            fileInputStream = new FileInputStream(new File("网络通信协议.png"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            //关闭数据的输出
            socket.shutdownOutput();

            //接收来自于服务端的数据，并显示在控制台上
            InputStream inputStream = socket.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
            byte[] bufferr=new byte[20];
            int len1;
            while ((len1=inputStream.read(bufferr))!=-1){
                byteArrayOutputStream.write(bufferr,0,len1);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
        Socket socket = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            serverSocket = new ServerSocket(9090);
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            fileOutputStream = new FileOutputStream("网络通信协议3.png");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }

            //服务端给与客户端反馈
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("你好，我已收到".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null)
                    fileOutputStream.close();
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
                if (socket != null)
                    socket.close();
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

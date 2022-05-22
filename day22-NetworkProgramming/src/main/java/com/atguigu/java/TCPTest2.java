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
 * 例子2：客户端发送文件给服务端，服务端将文件保存在本地
 *
 * */
public class TCPTest2 {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream stream = null;
        FileInputStream fileOutputStream = null;
        try {
            InetAddress address = InetAddress.getByName("127.0.0.1");
            socket = new Socket(address, 9999);
            stream = socket.getOutputStream();
            fileOutputStream = new FileInputStream(new File("tcp四次挥手.png"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileOutputStream.read(buffer)) != -1) {
                stream.write(buffer, 0, len);
            }
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
                if (stream != null)
                    stream.close();
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

    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            serverSocket = new ServerSocket(9999);
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            fileOutputStream = new FileOutputStream(new File("tcp四次挥手2.png"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);

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
                if (fileOutputStream != null)
                    fileOutputStream.close();
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

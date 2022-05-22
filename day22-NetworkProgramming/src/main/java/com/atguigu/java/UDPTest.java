package com.atguigu.java;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/21
 */
/*
* UDP协议的网络编程
* UDP 数据报通过数据报套接字 DatagramSocket 发送和接收，系统不保证 UDP 数据报一定能够安全送到目的地，也不能确定什么时候可以抵达
*
*
* */
public class UDPTest {
    //发送端
    @Test
    public void send() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String str="我是UDP方式发送的导弹";
        InetAddress address = InetAddress.getLocalHost();
        byte[] data = str.getBytes();
        DatagramPacket packet = new DatagramPacket(data,0,data.length,address,9090);
        socket.send(packet);
        socket.close();

    }
    //接收端

    @Test
    public void receive() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] buffer=new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();


    }

}

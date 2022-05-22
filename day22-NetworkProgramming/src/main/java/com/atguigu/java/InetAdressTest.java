package com.atguigu.java;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/15
 */
/*
* 一：网络编程中有两个主要问题
* 1：如何准确的定位网络上一台或多台主机；定位主机上特定上的应用
* 2：找到主机后如何可靠高效的进行数据传输
* 二：网络编程中的两个要素
* 1：ip和端口号
* 2：提供网络通信协议
*
* 三：通信要素一：IP和端口号
* 1：ip:唯一的标识Internet上的计算机
* 2：在java 中使用InetAddress类代表ip
* 3:ip 分类：IPV4,IPV6; 万维网和局域网
* 4:域名：www.baidu.com ,www.mi.com ...
* 5:本机回路地址：127.0.0.1，对应着：localhost
* 6:如何实例化InetAddress:两个方法：getByName，getLocalHost
*   两个常用方法：getHostName，getHostAddress
* 7：端口号：正在计算机上运行的进程
*          要求：不同进程有不同的端口号
*          范围：被规定为一个16位的整数：0-65535
* 8：端口号与ip 地址组合得出一个网络套接字：Socket
*
*
* */
public class InetAdressTest {
    @Test
    public void test1(){
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName("192.168.3.17");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(inetAddress);
    }

    @Test
    public void test2(){
        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.atguigu.com");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(address);

        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
    }

    @Test
    public void test3(){
        InetAddress localHost = null;
        try {
            localHost = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(localHost);
    }





}

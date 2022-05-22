package com.atguigu.java;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/21
 */
/*
URL网络编程
* URL(Uniform Resource Locator)：统一资源定位符，它表示 Internet 上某一资源的地址。
* 通过 URL 我们可以访问 Internet 上的各种网络资源，
*   比如最常见的 www，ftp站点。浏览器通过解析给定的 URL 可以在网络上查找相应的文件或其他资源
URL的基本结构由5部分组成:
    <传输协议>：//<主机名>：<端口号>/<文件名>#片段名？参数列表

 常用方法
    public String getProtocol() 获取该 URL 的协议名
    public String getHost() 获取该 URL 的主机名
    public String getPort() 获取该 URL 的端口号
    public String getPath() 获取该 URL 的文件路径
    public String getFile() 获取该 URL 的文件名
    public String getQuery() 获取该 URL 的查询名


*
* */
public class URlTest {
    public static void main(String[] args) {
        URL url;

        {
            try {
                url = new URL("http://localhost:8080/examples/beauty.jpg?username=Tom");
//                public String getProtocol() 获取该 URL 的协议名
                System.out.println(url.getProtocol());
//                public String getHost() 获取该 URL 的主机名
                System.out.println(url.getHost());
//                public String getPort() 获取该 URL 的端口号
                System.out.println(url.getPort());
//                public String getPath() 获取该 URL 的文件路径
                System.out.println(url.getPath());
//                public String getFile() 获取该 URL 的文件名
                System.out.println(url.getFile());
//                public String getQuery() 获取该 URL 的查询名
                System.out.println(url.getQuery());


            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

    }
}

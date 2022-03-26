package com.atguigu.java3;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName NetWorkTest.java
 * @Description 代理模式
 * @createTime 2022年03月26日 11:23:00
 */
//接口的应用：代理模式
public class NetWorkTest {
    public static void main(String[] args) {
        Server server=new Server();
        ProxyServer proxyServer=new ProxyServer(server);
        proxyServer.browser();
    }
}
interface NetWork{
     void browser();
}
//被代理类
class Server implements NetWork{
    public void browser() {
        System.out.println("真实的服务器访问网络");
    }
}
//代理类
class ProxyServer implements NetWork{
    private NetWork netWork;

    //构造器
    public ProxyServer(NetWork netWork){
        this.netWork=netWork;

    }
    public void check(){
        System.out.println("联网之前的检查工作");
    }
    public void browser() {
        check();
        netWork.browser();

    }
}

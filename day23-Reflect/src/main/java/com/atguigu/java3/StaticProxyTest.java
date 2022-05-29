package com.atguigu.java3;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/29
 */
/*
 * 静态代理
 * 特点：代理类和被代理类在编译期间，就确定下来了
 *
 *
 * */
interface ClothFactory {
    void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory {

    private ClothFactory factory;//用被代理类对象进行实例化

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        factory.produceCloth();
        System.out.println("代理工厂做一些后续的收尾工作");

    }
}

//被代理类
class NickClothFactory implements ClothFactory {

    @Override
    public void produceCloth() {
        System.out.println("Nick工厂生产一些运动服");

    }
}

public class StaticProxyTest {
    public static void main(String[] args) {
        //创建被代理类对象
        NickClothFactory nickClothFactory = new NickClothFactory();

        //创建代理类 对象
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nickClothFactory);
        proxyClothFactory.produceCloth();
    }

}

package com.atguigu.java3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/29
 */
/*
 * 动态代理
 * */

interface HUuman {
    String getBelief();

    void eat(String food);
}

//被代理类
class SuperMan implements HUuman {

    @Override
    public String getBelief() {
        return "I believe I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃：" + food);

    }
}

/*
 *
 * 若想实现动态代理，需要解决的问题
 * 问题一：如何根据加载在内存中的被代理类，动态的创建一个代理类及其对象
 * 问题二：当通过代理类的对象调用方法时，如何动态的调用被代理类的同名方法
 *
 *
 * */
class ProxyFactory {
    public static Object getProxyInstance(Object o) {//o：被代理类的对象

        MyinvocationHandler handler = new MyinvocationHandler();
        handler.bind(o);
        return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), handler);

    }

}

class MyinvocationHandler implements InvocationHandler {
    private Object o;

    public void bind(Object o) {
        this.o = o;

    }

    //当我们通过代理类的对象，调用方法a时，就会自动的调用如下的方法：invoke()
    //将被代理类要执行的方法a的功能生命在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method:即为代理类对象调用的方法，此方法也就作为了被代理类对象调用的方法
        Object o = method.invoke(this.o, args);
        //上述方法的返回值就作为当前类中的invoke()的返回值
        return o;
    }
}

public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //proxyInstance:代理类对象
        HUuman proxyInstance = (HUuman) ProxyFactory.getProxyInstance(superMan);
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("四川麻辣烫");

    }
}

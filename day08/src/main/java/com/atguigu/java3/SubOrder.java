package com.atguigu.java3;

import com.atguigu.java2.Order;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SubOrder.java
 * @Description TODO
 * @createTime 2022年03月12日 16:41:00
 */
public class SubOrder extends Order {
    public void method(){
        //在不同包的子类中，不能调用Order类中声明为privated 和缺省权限的属性和方法
        orderProtected=1;
        orderPublic=2;
        methodProtected();
        methodPublic();
    }
}

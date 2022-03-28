package com.atuguigu.java5;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName MyException.java
 * @Description 自定义异常类
 * @createTime 2022年03月27日 22:15:00
 */
/*
* 如何自定义异常类：
* 1:继承于现有的异常结构：RuntimeException ,Exception
* 2:提供全局常量：serialVersionUID
* 3：提供重载的构造器
*
*
* */
public class MyException extends Exception{
    static final long serialVersionUID = -7034897190745766939L;
    public MyException(){

    }

    public MyException(String message) {
        super(message);
    }
}

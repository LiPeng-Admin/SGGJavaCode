package com.atuguigu.java4;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName OverrideTest.java
 * @Description TODO
 * @createTime 2022年03月27日 18:21:00
 */
/*
* 方法重写的规则之一：
* 子类重写的方法抛出的异常类型不大于父类被重写的方法的异常类型
*
*
*
*
*
*
* */
public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test=new OverrideTest();
        test.display(new SubClass());
    }

    public void display(SuperClass superClass){
        try {
            superClass.method();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
class SuperClass{
    public void method() throws IOException {

    }
}
class SubClass extends SuperClass {
    @Override
    public void method() throws FileNotFoundException {

    }
}


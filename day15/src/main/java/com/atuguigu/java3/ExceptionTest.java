package com.atuguigu.java3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ExceptionTest.java
 * @Description throws
 * @createTime 2022年03月27日 17:47:00
 */
/*
*
* 异常处理的方式二：throws+异常类型
* 1:throws+异常类型 写在方法的声明处，指明此方法执行时，可能会抛出的类型，一旦当方法体执行时，出现异常，仍会在异常代码处生成
* 一个异常类的对象。此对象满足throws 后异常类型时，就会被抛出。异常代码后续的代码将不再执行
* 2：体会：try-catch-finally:真正的将异常处理了
*         throws+异常类型：只是将异常抛给方法的调用者并没有真正的讲异常处理掉
* 3：开发中如何选择try-catch-finally 还是选择使用throws
*       3.1 若父类中被重写的方法没有throws 方式处理异常，则子类重写的方法也不能使用throws，意味着如果子类重写的方法中有异常，
*           必须使用try-catch-finally
*       3.2 若执行的方法a中，先后又调用了其他的方法，这几个方法时递进关系。建议这几个方法使用throws方法处理，而执行的方法a可以
*           考虑使用try-catch-finally
*
*
*
* */
public class ExceptionTest {

    public static void main(String[] args) {
        method3();

    }
    public static void method3(){
        try {
            method2();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void method2() throws  IOException{
        method1();
    }

    public  static void method1() throws FileNotFoundException, IOException {
        File file=new File("hello.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        int data=fileInputStream.read();
        while (data!=-1){
            System.out.println((char) data);
            fileInputStream.read();
        }
        fileInputStream.close();
    }
}

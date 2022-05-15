package com.atguigu.exer;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/4
 */
public class FileDemo {
    @Test
    public void test1() throws IOException {
        File file=new File("E:\\java_code\\SGGJavaCode\\io\\hello.txt");
        //创建一个与file同目录下的另外一个文件，文件名为hi.txt
        File file1=new File(file.getParent(),"hi.txt");
        boolean newFile = file1.createNewFile();
        if(newFile){
            System.out.println("创建成功！");
        }
    }
}

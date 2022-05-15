package com.atguigu.java2;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PropertiesTest.java
 * @Description TODO
 * @createTime 2022年04月14日 23:06:00
 */
public class PropertiesTest {
    //Properties:常用来处理配置文件.key-value都是String 类型
    @Test
    public void test() throws FileNotFoundException {
        FileInputStream fis = null;
        try {
            Properties pro = new Properties();
            fis = new FileInputStream("E:\\java_code\\SGGJavaCode\\jdbc.properties");
            pro.load(fis);//加载流对应的文件

            String name = pro.getProperty("name");
            String password = pro.getProperty("password");

            System.out.println("name:" + name + "," + "password:" + password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

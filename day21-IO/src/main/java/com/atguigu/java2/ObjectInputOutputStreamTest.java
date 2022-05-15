package com.atguigu.java2;

import org.junit.Test;

import java.io.*;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/15
 */
/*
* 对象流的使用
   ObjectInputStream：存储中的文件、通过网络接收过来 --->内存中的对象：反序列化过程
   *
 * ObjectOutputStream：内存中的对象--->存储中的文件、通过网络传输出去：序列化过程
 *
 * 作用：用于存储和读取基本数据类型或对象的处理流，它的强大之处在于就是可以把java中的对象写到数据源中，也能把对象从数据源中还原回来
 *
 * 对象的序列化机制
     * 对象序列化机制允许把内存中的Java对象转换成平台无关的二进制流，
     * 从而允许把这种二进制流持久地保存在磁盘上，或通过网络将这种二进制流传输到另一个网络节点。
     * //当其它程序获取了这种二进制流，就可以恢复成原来的Java对象。
     *
   序列化的好处：
   * 可将任何实现了Serializable接口的对象转化为字节数据，使其在保存和传输时可被还原。
   *
   序列化是RMI(Remote Method Invoke-远程方法调用)过程的参数和返回值都必须实现的机制，RMI是JavaEE的基础。
   *  因此序列化机制是JavaEE平台的基础
   *
   如果需要让某个对象支持序列化机制，则必须让对象所属的类及其属性是可序列化的，为了让某个类是可序列化的，该类必须实现如下两个接口之一。
   *   否则，会抛出 NotserializableEXception 异常
   * Serializable
     Externalizable
 *


*/
public class ObjectInputOutputStreamTest {
    /*
     * 序列化过程：将内存中的java 对象保存到磁盘中或通过网络传输出去
     * 使用ObjectOutputStream实现
     *
     * */
    @Test
    public void testObjectOutputStream() {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("object.dat"));
            outputStream.writeObject(new String("我爱北京天安门"));
            outputStream.flush();//刷新操作

            outputStream.writeObject(new Person("张三",28));
            outputStream.flush();

            outputStream.writeObject(new Person("王五",29,new Account(5000)));
            outputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    /*
    * 反序列化：将磁盘文件中的对象还原为内存中的一个Java对象
    * */

    @Test
    public void testObjectInputStream() {
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream("object.dat"));
            Object o = inputStream.readObject();
            String s = (String) o;
            System.out.println(s);

            Object object = inputStream.readObject();
            Person person=(Person) object;
            System.out.println(person);

            Object o1 = inputStream.readObject();
            Person person1 = (Person) o1;
            System.out.println(person1);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


}

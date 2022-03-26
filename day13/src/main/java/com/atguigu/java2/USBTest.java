package com.atguigu.java2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName USBTest.java
 * @Description 接口的使用
 * @createTime 2022年03月25日 03:38:00
 */
/*
* 1:接口使用上满足多态性
* 2：接口实际上就是定义了一种规范
* 3：开发中，体会面向接口编程
*
* */
public class USBTest {
    public static void main(String[] args) {
        Computer computer=new Computer();
        //1:创建了接口的非匿名实现类的非匿名对象
        Flash flash=new Flash();
        computer.transferData(flash);

        //2：创建了接口的非匿名实现类的匿名对象
        computer.transferData(new Printer());

        //3:创建了接口的匿名实现类的非匿名对象
        USB phone=new USB() {
            public void start() {
                System.out.println("手机开始工作了");
            }

            public void stop() {
                System.out.println("手机停止工作");

            }
        };
        computer.transferData(phone);

        //4:创建了接口的匿名实现类的匿名对象
        computer.transferData(new USB() {
            public void start() {
                System.out.println("mp3开始工作");
            }

            public void stop() {
                System.out.println("mp3停止工作");

            }
        });
    }
}

class Computer{
    public void transferData(USB usb){//USB usb=new Flash
        usb.start();
        System.out.println("具体传输数据的细节");
        usb.start();

    }
}
interface USB{
    //常量：定义了长，宽，最大最小传输速度
    void start();
    void  stop();
}
class Flash implements USB{

    public void start() {
        System.out.println("u盘开启工作");
    }

    public void stop() {
        System.out.println("u盘停止工作");

    }
}
class Printer implements USB{
    public void start() {
        System.out.println("打印机开始工作");
    }

    public void stop() {
        System.out.println("打印机停止工作");

    }
}

package com.atguigu.java2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SeasonTest.java
 * @Description TODO
 * @createTime 2022年04月08日 18:59:00
 */
//使用enum关键字枚举类
    /*
    * 使用enum定义的枚举类默认继承了 java.lang.Enum 类，因此不能再继承其他类
    * 必须在枚举类的第一行声明枚举类对象
    *
    * 实现步骤：
    * 1:提供当前枚举类的对象，多个对象之间用","隔开，末尾对象“；”结束
    * 2：声明Season对象的属性:private final修饰
    * 3：私化类的构造器,并给对象属性赋值
    * 4：其他需求1：，获取枚举类对象的属性
    *    其他需求2：，获取枚举类对象的toString（）方法
    *    。。。

    * */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring.toString());////返回当前枚举类对象常量的名称
        System.out.println(Season.class.getSuperclass());//class java.lang.Enum

      //返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
        Season[] values = Season.values();


        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]+" ");
           values[i].show();

        }
        System.out.println("***************");

        //valueOf(String str)：可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”
        //如不是，会有运行时异常 IllegalArgumentException
        Season winter = Season.valueOf("WINTER");
        System.out.println(winter);

        winter.show();
    }
}

interface
Info{
    void  show();
}
enum Season implements Info{

    //1:提供当前枚举类的对象，多个对象之间用","隔开，末尾对象“；”结束
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");

        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("荷塘月色");

        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天不回来");

        }
    },
    WINTER("冬天","冬寒夏暖"){
        @Override
        public void show() {
            System.out.println("大约在冬季");

        }
    };

    //2.声明Season对象的属性:private final修饰
    private final String name;
    private final String desc;

  //3.私化类的构造器,并给对象属性赋值

    private  Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

//    @Override
//    public void show() {
//        System.out.println("这是一个季节！");
//    }
}

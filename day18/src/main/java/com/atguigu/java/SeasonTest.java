package com.atguigu.java;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SeasonTest.java
 * @Description 枚举类的使用
 * @createTime 2022年04月08日 16:28:00
 */
/*
* 一：枚举类的使用：
* 1：枚举类的理解：类的对象只有有限个，确定的，我们称此类是枚举类，
* 2：当我们需要定义一组常量时，强烈建议使用枚举类
* 3：如果枚举类中只有一个对象，则可以作为单例模式的实现方式
*
* 二：如何定义枚举类
* 1：方式一：jdk5.0之前，自定义枚举类
* 2：方式二：jdk5.0时，可以使用enum关键字定义枚举类
*
*三：Enum类的常用方法
*    ①values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
     ②valueOf(String str)：可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”.
*                         如不是，会有运行时异常 IllegalArgumentException
     ③toString()：返回当前枚举类对象常量的名称*
*
四：使用enum关键字定义的枚举类实现接口的情况*
  1：实现接口，在enum类中实现抽象方法
* 2:让枚举类的对象分别实现接口中的抽象方法
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        System.out.println(summer.toString());

    }
}
class Season{
    //1:声明Season 对象的属性:private final修饰
    private final String name;
    private  final String desc;

    //2：私有化类的构造器,并给对象属性赋值

    private Season(String name,String desc) {
        this.name=name;
        this.desc=desc;
    }
    //3:提供当前枚举类的多个对象
    public static final Season SPRING=new Season("春天","春暖花开");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","秋高气爽");
    public static final Season WINTER=new Season("冬天","冬寒夏暖");

    //4:其他需求1：，获取枚举类对象的属性


    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


    //4:其他需求2：，获取枚举类对象的toString（）方法
    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

}

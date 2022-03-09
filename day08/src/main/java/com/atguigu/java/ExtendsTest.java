/**
 * @author lipeng
 * @version 1.0.0
 * @ClassName ExtendsTest.java
 * @Description 继承性
 * @createTime 2022年03月06日 21:09:00
 */
/*
* 面向对象的特征之二：继承性
* 一：继承性的优势：
* 1：减少代码的冗余，提高了代码的复用性
* 2：便于功能的扩展
* 3：为之后的多态性的使用，提供了前提
* 二：继承性的格式：class A extends B{}
* A:子类，派生类
* B：父类，超类，基类
*     2.1体现：一旦子类A 继承了父类B 以后，子类A中就获取了父类B 中声明的结构：属性，方法
*      特别的，父类中声明为privated 的属性和方法，子类继承父类后，仍然认为获取了父类中私有的结构
*      只是因为封装性的影响，使得子类不能直接调用父类的结构而已
*    2.2 子类继承父类以后。还可以声明自己特有的属性或方法，实现功能的扩展
*     子类和父类的关系，不同于子集和集合的关系
*
* 三：java 中关于继承性的规定
* 1：一个类可以被多个子类继承
* 2：java 中的单继承性：一个类只有一个父类
* 3：子父类是相对的概念
* 4：子类继承父类，也就继承直接或间接父类中声明的所有属性和方法
*
*四：1:如果我么没有显式的声明一个类的父类，则此类继承于java.lang.Object 类
*   2：所有的java 类（java.lang.Object 类）,都直接或间接的继承于java.lang.Object类
*
*
* */
public class ExtendsTest {
    public static void main(String[] args) {
        Person person=new Person();
//        person.age=1;
        person.eat();
        person.breath();
        System.out.println("*****************");

        Student student=new Student();
//        student.age=2;
        student.study();

        student.eat();
        student.setAge(20);
        System.out.println("学生的年龄是："+student.getAge());
        student.breath();
    }
}

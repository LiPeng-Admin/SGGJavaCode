package com.atguigu.java4;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName AnimalTest.java
 * @Description TODO
 * @createTime 2022年03月13日 14:18:00
 */
//多态性的使用举例一：
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest animalTest=new AnimalTest();
        animalTest.func(new Dog());
        System.out.println("************");
        animalTest.func(new Cat());

    }
    public void func(Animal animal){ //animal=new Dog
        animal.eat();
        animal.shout();

    }

}
class Animal{
    public void eat(){
        System.out.println("动物：进食");
    }
    public void shout(){
        System.out.println("动物：叫");
    }
}
class Dog extends  Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}

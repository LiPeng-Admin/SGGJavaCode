package com.atguigu.java4;

import org.junit.Test;

import java.util.Optional;

/**
 * @Description
 * @Author lipeng
 * @create 2022/6/4
 * <p>
 * Optional类：为了在程序中避免出现空指针异常而创建的。
 * 常用的方法：ofNullable(T t)
 *            orElse(T t)
 */
public class OptionalTest {
    /*
    * 创建Optional类对象的方法：
    Optional.of(T t): 创建一个Optional 实例，t必须非空；
    Optional.empty() : 创建一个空的Optional 实例
    Optional.ofNullable(T t)：t可以为null
    *
    * */
    @Test
    public void test() {
        Girl girl = new Girl();
//        girl=null;
        //of(T t):保证t是非空的
        Optional<Girl> girl1 = Optional.of(girl);


    }

    @Test
    public void test2() {
        Girl girl = new Girl();
//        girl=null;
        //ofNullable(T t)：t可以为null
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        System.out.println(optionalGirl);
     //orElse(T t1):如果当前的Optional内部封装的t是非空的，则返回内部的t.
        Girl girl1 = optionalGirl.orElse(new Girl("赵丽颖"));
        System.out.println(girl1);

    }

    public String getGirlName(Boy boy) {
        return boy.getGirl().getName();

    }

//    @Test
//    public void test3() {
//        String girlName = getGirlName(new Boy());
//        System.out.println(girlName);
//    }

    //使用Optional类的getGirlName():
    public String getGirlName1(Boy boy){
        Optional<Boy> optionalBoy = Optional.ofNullable(boy);
        Boy boy1 = optionalBoy.orElse(new Boy(new Girl("古力娜扎")));
        Girl girl = boy1.getGirl();
        Optional<Girl> girl1 = Optional.ofNullable(girl);
        Girl girl2 = girl1.orElse(new Girl("小花"));
        return girl2.getName();
    }
    @Test
    public void test4(){
        Boy boy = new Boy();
        boy=null;
        boy=new Boy();
        String girlName1 = getGirlName1(boy);
        System.out.println(girlName1);

    }
}

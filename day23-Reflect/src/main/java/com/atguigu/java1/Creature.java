package com.atguigu.java1;

import java.io.Serializable;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/22
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }
    public void eat(){
        System.out.println("生物进食");
    }
}

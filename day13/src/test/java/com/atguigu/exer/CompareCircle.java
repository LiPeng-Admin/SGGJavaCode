package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CompareCircle.java
 * @Description TODO
 * @createTime 2022年03月26日 14:20:00
 */
/*
定义一个CompareCircle类，继承Circle类并实现CompareObject接口
在CompareCircle类中给出接口方法compareTo的实现体，用来比较两个圆的大小
*
*
* */
public class CompareCircle extends Circle implements CompareObject{

    public CompareCircle() {
    }

    public CompareCircle(double redius) {
        super(redius);
    }

    public int compareTo(Object o) {
        if(this==o){
            return 0;
        }
        if(o instanceof CompareCircle){
            CompareCircle c=(CompareCircle) o;
            if(this.getRedius()>c.getRedius()){
                return 1;
            }else if(this.getRedius()<c.getRedius()){
                return -1;

            }else{
                return 0;
            }
        }else {
            return 0;
//             throw new RuntimeException("传入的数据类型不匹配");
        }

    }
}

package com.atguigu.java;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName TemplateTest.java
 * @Description 抽象类的应用：模板方法的设计模式
 * @createTime 2022年03月23日 23:32:00
 */
/*
*
* 抽象类的应用：模板方法的设计模式
*
*
* */
public class TemplateTest {
    public static void main(String[] args) {
        SubTemplate subTemplate=new SubTemplate();
        subTemplate.speedTime();
    }
}
abstract  class Template{

    public void speedTime(){
        long start=System.currentTimeMillis();
        code();
        long end=System.currentTimeMillis();
        System.out.println("花费的时间："+(end-start));
    }
    public abstract void code();
}
class SubTemplate extends Template{

    public void code() {

        for(int i=2;i<=1000;i++){
            boolean isFlag=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isFlag=false;
                    break;
                }
            }

            if(isFlag){
                System.out.println(i);
            }
        }

    }
}

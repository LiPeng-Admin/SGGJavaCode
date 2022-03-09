package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Kids.java
 * @Description TODO
 * @createTime 2022年03月08日 08:37:00
 */
public class Kids extends ManKind{
    private int yearOld;
    public Kids(){

    }
    public Kids(int yearOld){
        this.yearOld=yearOld;
    }

   public void printAge(){
       System.out.println(yearOld);
   }
   public void setYearOld(int yearOld){
       this.yearOld=yearOld;
   }
   public  int getYearOld(){
       return yearOld;
   }

}

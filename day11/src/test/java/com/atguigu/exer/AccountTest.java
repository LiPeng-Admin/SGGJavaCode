package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName AccountTest.java
 * @Description TODO
 * @createTime 2022年03月20日 19:00:00
 */
/*
* 编写一个类实现银行账户的概念，包含的属性有“账号”，“密码”，“存款余额”，“利率”，”最小余额“，
* 定义封装这些属性的方法，账号要自动生成
* 编写主类，使用银行账户类，输入，输出3个储户的上述信息
* 考虑：哪些属性可以设计成static 属性
*
* */
public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account();
        Account account1=new Account("123456",1000);

        Account.setInterestRate(0.0588);
        Account.setMinMoney(2.0);

        System.out.println(account.toString());
        System.out.println(account1);

        System.out.println(account.getInterestRate());
        System.out.println(account.getMinMoney());

    }
}
 class Account{
     private int id; //账号
     private String pwd="000000";//密码
     private double balance; //余额
     private static double interestRate; //年利率
     private static double minMoney=1.0; //最小余额
     private static int init=1001;//用于自动生成id 使用的

     public Account(){
         id=init++;
     }
     public Account(String pwd,double balance){
         id=init++;
         this.pwd=pwd;
         this.balance=balance;

     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getPwd() {
         return pwd;
     }

     public void setPwd(String pwd) {
         this.pwd = pwd;
     }

     public double getBalance() {
         return balance;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }

     public static double getInterestRate() {
         return interestRate;
     }

     public static void setInterestRate(double interestRate) {
         Account.interestRate = interestRate;
     }

     public static double getMinMoney() {
         return minMoney;
     }

     public static void setMinMoney(double minMoney) {
         Account.minMoney = minMoney;
     }

     @Override
     public String toString() {
         return "Account{" +
                 "id=" + id +
                 ", pwd='" + pwd + '\'' +
                 ", balance=" + balance +
                 '}';
     }
 }


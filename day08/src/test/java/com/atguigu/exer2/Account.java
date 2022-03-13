package com.atguigu.exer2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Account.java
 * @Description TODO
 * @createTime 2022年03月12日 20:50:00
 */
public class Account {
    //设置属性
    private int id;  //账号
    private double balance; //余额
    private double annuallnterestRate; // 年利率

    //构造器
    public Account(int id,double balance,double annuallnterestRate){
        super();
        this.id=id;
        this.balance=balance;
        this.annuallnterestRate=annuallnterestRate;
    }

    //设置方法
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public  void setAnnuallnterestRate(double annuallnterestRate){
        this.annuallnterestRate=annuallnterestRate;

    }
    public double getAnnuallnterestRate(){
        return  annuallnterestRate;
    }
    //返回月利率
    public double getMonthlyInterst(){
        return annuallnterestRate /12;

    }
    //取钱
    public  void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            return;
        }
            System.out.println("余额不足");


    }
    //存钱
    public void deposit(double amount){
        if(amount>=0){
            balance+=amount;
        }

    }
}

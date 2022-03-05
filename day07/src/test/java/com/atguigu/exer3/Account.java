package com.guigu.exer3;

public class Account {
    //定义三个属性
    private int id; //账号
    private  double balance; //余额
    private double annualInterestRate; //年利率

  //定义构造器

    public Account(int id,double balance,double annualInterestRate){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }

    public void setId(int id){
        this.id=id;


    }
    public int getId(){
        return id;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;

    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    //在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求。，如果不能嫩，应给出相应提示
    public void withdraw(double amount){ //取钱
        if(balance<amount){
            System.out.println("余额不足，提款失败");
        }else {
            balance-=amount;
            System.out.println("成功取出:"+amount);
        }

    }
    public void deposit(double amount){ //存钱
        if(amount>0){
            System.out.println("成功存钱："+amount);
        }
    }

}

package com.guigu.exer4;

public class Account {
    private double balance;

    public Account(double init_balance){
        this.balance=init_balance;

    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amt){ //存钱
        if(amt>0){
            balance+=amt;
            System.out.println("成功存钱："+amt);
        }

    }
    public void withdraw(double amt){ //取钱
        if(balance>=amt){
            balance-=amt;
            System.out.println("取钱成功："+amt);
        }else {
            System.out.println("余额不足，提款失败");
        }

    }
}

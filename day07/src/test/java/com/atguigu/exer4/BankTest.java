package com.guigu.exer4;

public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.addCustomer("Jane","Smith");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(200);
        double balance=bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户"+bank.getCustomer(0).getFirstName()+"余额为："+balance);

        System.out.println("******************");
        bank.addCustomer("Jack","Chen");
        System.out.println("银行客户有："+bank.getNumberOfCustomer());
    }
}

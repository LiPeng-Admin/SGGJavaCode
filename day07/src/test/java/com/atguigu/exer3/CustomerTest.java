package com.guigu.exer3;
/*
* 写一个测试程序
* 1：创建一个Customer ,名字叫Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23%
* 2：对Jane Smith操作
* 存入100元，再取出960元，在取出2000元
* 打印出Jane Smith 的基本信息
*  成功存入：100
* 成功取出：960
* 余额不足，取款失败
*
* Customer[Smith,Jane]has a account:1000,annualInterestRate is 1.23%,balance is 1040.0

 * */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer=new Customer("Jane","Smith");
        Account account=new Account(1000,2000,0.0123);
        customer.setAccount(account);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        System.out.println("Customer["+customer.getLastName()+","+customer.getFirstName()+"]"+
                "has a account:"+customer.getAccount().getId()+",annualInterestRate is "
                +customer.getAccount().getAnnualInterestRate()*100+"%,"+
                "balance is "+customer.getAccount().getBalance());


    }
}

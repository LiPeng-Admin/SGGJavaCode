package com.atguigu.exer2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName AccountTest.java
 * @Description TODO
 * @createTime 2022年03月12日 21:56:00
 */
/*
* 写一个用户程序测试AccountTest,在用户程序中
* 创建一个账号为1122,余额为20000，年利率4.5%的Account对象
* 使用withdraw 方法提款30000，并打印余额
* 使用withdraw方法提款2500元
* 使用deposit 方法存款3000元，然后打印余额和月利率
*
*
* */
public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account(1122,20000,0.045);
       account.withdraw(30000);
        System.out.println("余额是："+account.getBalance());
        account.withdraw(2500);
        System.out.println("你的余额是："+account.getBalance());
        account.deposit(3000);
        System.out.println("您现在的余额是"+account.getBalance()+",你的月利率是："+(account.getMonthlyInterst())*100+"%");
    }

}

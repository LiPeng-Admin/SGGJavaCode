package com.atguigu.exer2;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CheckAccount.java
 * @Description TODO
 * @createTime 2022年03月12日 22:53:00
 */
/*
* 创建Account 类的一个子类CheckAccount 代表可透支的账号，该账户中定义一个属性overdraft 代表可透支限额
* 在CheckAccount 类中重写withdraw方法，其算法如下：
* 如果（取款余额<账户余额），
* 可直接提取
* 如果（取款金额 >账户余额），
* 计算需要透支的额度
* 判断可透支额overdraft 是否足够支付透支需要，如果可以，将账户余额修改为0，冲减可透支金额，
* 如果不可以，
* 提示用户超过可透支额的限额
*
*
* */
public class CheckAccount extends Account{
    private double overdraft; //可透支限额
    public CheckAccount(int id,double balance,double annuallnterestRate,double overdraft){
        super(id,balance,annuallnterestRate);
        this.overdraft=overdraft;
    }

    @Override
    public void withdraw(double amount) {

        if(amount<=getBalance()){  //余额足够消费
            //方式一：
//            setBalance(getBalance()-amount);
            //方式二：
            super.withdraw(amount);

        }else if(overdraft>=amount-getBalance()){
            overdraft-=(amount-getBalance());
            setBalance(0);
        }else {
            System.out.println("超过可透支额的限额");
        }
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }
}

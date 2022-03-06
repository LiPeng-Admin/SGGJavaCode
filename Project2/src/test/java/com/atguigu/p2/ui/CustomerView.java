package com.atguigu.p2.ui;

import com.atguigu.p2.CMUtility;
import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;

/**
 * @author lipeng
 * @version 1.0.0
 * @ClassName CustomerView.java
 * @Description 负责菜单的显示和处理用户操作
 * @createTime 2022年03月05日 23:05:00
 */
public class CustomerView {
    private CustomerList customerList=new CustomerList(10);
    public CustomerView(){
        Customer customer=new Customer("王涛",'男',28,"18654118978","18654118978@126.com");
        customerList.addCustomer(customer);
    }

    public void enterMainMenu(){
        boolean isFlag=true;
        while(isFlag){
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退      出\n");
            System.out.print("                   请选择(1-5)：");
        char menu=CMUtility.readMenuSelection();
        switch (menu) {
            case '1':
                addNewCustomer();
                break;

            case '2':
                modifyCustomer();
                break;
            case '3':
                deleteCustomer();
                break;
            case '4':
                listAllCustomer();
                break;
            case '5':
//                System.out.println("退出");
                System.out.print("确认是否退出(Y/N):");
                char isExit = CMUtility.readConfirmSelection();
                if (isExit=='Y') {
                    isFlag = false;
                }
                break;
        }

        }


    }
    public void addNewCustomer(){
//        System.out.println("添加客户操作");
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name=CMUtility.readString(10);
        System.out.print("性别：");
        char gender= CMUtility.readChar();
        System.out.print("年龄：");
        int age=CMUtility.readInt();
        System.out.print("电话：");
        String phone=CMUtility.readString(13);
        System.out.print("邮箱：");
        String email=CMUtility.readString(30);
        //将上述数据封装到对象中
        Customer customer=new Customer( name, gender, age, phone, email);
       boolean isSuccess=customerList.addCustomer(customer);
       if(isSuccess){
         System.out.println("---------------------添加完成---------------------");
       }else {
           System.out.println("----------------记录已满,无法添加-----------------");

       }


    }
    public  void modifyCustomer(){
//        System.out.println("修改客户操作");
        System.out.println("---------------------修改客户---------------------");
        Customer cust;
        int number;
        for(;;){
            System.out.print("请选择待修改客户编号(-1退出)：");
           number= CMUtility.readInt();
           if(number==-1){
               return;
           }
         cust = customerList.getCustomer(number-1); //注意此处使用number-1
            if(cust==null){
                System.out.println("无法找到指定客户！");
            }
            else{
                break;
            }
        }
        //修改客户信息
        System.out.print("姓名("+cust.getName()+"):");
        String name=CMUtility.readString(10,cust.getName());
        System.out.print("性别("+cust.getGender()+"):");
        char gender=CMUtility.readChar(cust.getGender());
        System.out.print("年龄("+cust.getAge()+"):");
        int age=CMUtility.readInt(cust.getAge());
        System.out.print("电话("+cust.getPhone()+"):");
        String phone=CMUtility.readString(13,cust.getPhone());
        System.out.print("邮箱("+cust.getEmail()+"):");
        String email=CMUtility.readString(30,cust.getEmail());
        Customer newCustomer=new Customer(name,gender,age,phone,email);
        boolean isReplace=customerList.replaceCustomer(number-1,newCustomer);
        if(isReplace){
            System.out.println("---------------------修改完成---------------------");
        }
        else {
            System.out.println("----------无法找到指定客户,修改失败--------------");
        }


     }
    public void deleteCustomer(){
//        System.out.println("删除客户操作");
        System.out.println("---------------------删除客户---------------------");
        Customer customer;
        int number;
       for(;;){
           System.out.print("选择待删除客户的编号(-1退出):");
            number= CMUtility.readInt();
           if(number==-1){
               return;
           }
           else{
              customer= customerList.getCustomer(number-1);
               if(customer==null){
                   System.out.println("无法找到指定客户！");
               }
               else {
                   break;
               }

           }
       }
       //找到了指定的客户
        System.out.print("是否删除客户(Y/N)");
       char isDelece=CMUtility.readConfirmSelection();
        if (isDelece == 'Y') {
            boolean isDelect=customerList.deleteCustomer(number-1);
            if(isDelect){
                System.out.println("---------------------删除完成---------------------");
            }
            else {
                System.out.println("----------无法找到指定客户,删除失败--------------");
            }
        }
        else {
            return;
        }

    }


    public void listAllCustomer(){
//        System.out.println("查询客户操作");
        System.out.println("---------------------------客户列表---------------------------");
       int total= customerList.getTotal();
       if(total==0){
           System.out.println("没有客户记录");
       }else {
           System.out.println("编号\t姓名\t\t性别\t年龄\t\t电话\t\t邮箱");
           Customer[] cust=customerList.getAllCustomers();
           for(int i=0;i<cust.length;i++){
               System.out.println((i+1)+"\t"+cust[i].getName()+"\t"+cust[i].getGender()+"\t"
                       +cust[i].getAge()+"\t"+cust[i].getPhone()+"\t"+cust[i].getEmail());
           }
       }
        System.out.println("-------------------------客户列表完成-------------------------");

    }

    public static void main(String[] args) {
        //创建对象
        CustomerView customerView=new CustomerView();
        customerView.enterMainMenu();

    }
}

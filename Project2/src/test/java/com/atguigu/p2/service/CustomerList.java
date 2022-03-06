package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * @author lipeng
 * @version 1.0.0
 * @ClassName CustomerList.java
 * @Description CustomerList 为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的添加，删除，修改，和遍历方法
 * 供CustomerView调用
 * @createTime 2022年03月05日 23:06:00
 */
public class CustomerList {
   private Customer []customers; //用来保存客户对象的数组
   private int total=0; //记录已保存客户对象的数量
   /**
    * @title
    * @description :用来初始化customers数组的构造器
    * @updateTime 2022/3/6 2022/3/6
    * @throws
    */
    public CustomerList(int totalCustomer){
        customers=new Customer[totalCustomer];

    }
    /**
     * @title 添加客户
     * @description  将指定的客户添加到数组中
     * @author lipeng
     * @updateTime 2022/3/6 2022/3/6
     * @throws
     * @return true:添加成功，false:添加失败
     */
    public boolean  addCustomer(Customer customer){
        if(total>=customers.length){
            return false;
        }else{
            customers[total]=customer;
            total++;
        }
        return  true;

    }
    /**
     * @title 修改客户
     * @description 修改指定位置上的客户信息
     * @author lipeng
     * @updateTime 2022/3/6 2022/3/6
     * @throws
     * @return true:修改成功，false:修改失败
     */
    public boolean replaceCustomer(int index,Customer customer){
        if(index <0||index>=total){
            return false;
        }else{
            customers[index]=customer;

        }
        return true;


    }
    public boolean deleteCustomer(int index){
        /**
         * @title deleteCustomer
         * @description 删除指定索引位置上的客户
         * @author lipeng
         * @param: index
         * @updateTime 2022/3/6 2022/3/6
         * @return: boolean
         * @throws
         */
        if(index <0|| index>=total){
            return false;
        }
        for(int i=index;i<total-1;i++){
            customers[i]=customers[i+1];
        }
        //最后有数据的元素需要置空
        customers[total-1]=null;
        total--;
        return true;

    }
    public Customer[] getAllCustomers(){
        /**
         * @title getAllCustomers
         * @description  获取所有的客户信息
         * @author lipeng
         * @updateTime 2022/3/6 2022/3/6
         * @return: com.atguigu.p2.bean.Customer[]
         * @throws
         */
        Customer[] custs=new Customer[total];
        for(int i=0;i<total;i++){
            custs[i]=customers[i];
        }
        return custs;


    }
    public Customer getCustomer(int index){
        /**
         * @title getCustomer
         * @description 获取指定索引位置上的客户
         * @author lipeng
         * @updateTime 2022/3/6 2022/3/6
         * @return: com.atguigu.p2.bean.Customer
         * @throws
         */
        if(index <0 || index>=total){
            return null;
        }
        return customers[index];

    }
    /**
     * @title
     * @description 获取存储的客户数量
     * @author admin
     * @updateTime 2022/3/6 2022/3/6
     * @throws
     */
    public int getTotal(){
        return total;


    }
}

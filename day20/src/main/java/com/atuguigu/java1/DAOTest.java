package com.atuguigu.java1;

import org.junit.Test;

import java.util.List;

/**
 * @Description
 * @Author lipeng
 * @Version V1.0.0
 * @Since 1.0
 * @create 2022/4/17
 */
public class DAOTest {
   @Test
    public void test1(){
       CustomerDAO customerDAO=new CustomerDAO();
       customerDAO.add(new Customer());

       List<Customer> list = customerDAO.getList();

       StudentDAO studentDAO=new StudentDAO();
       Student index = studentDAO.getIndex(10);
   }
}

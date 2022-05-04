package com.atguigu.exer1;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/4
 */

import java.util.List;

/**
 *创建DAO类的对象，分别调用其save,get,update,list,delete方法操作user 对象，使用Junit单元测试类进行测试
 *
 * */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User>dao=new DAO<>();
        dao.save("1001",new User(1001,28,"周杰伦"));
        dao.save("1002",new User(1002,48,"张宇"));
        dao.save("1003",new User(1003,38,"周华建"));

        dao.update("1003",new User(1003,40,"刘德华"));
        dao.delete("1001");
        List<User> list = dao.list();
        for (User user : list) {
            System.out.println(user);
        }

    }

}

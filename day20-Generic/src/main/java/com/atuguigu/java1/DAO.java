package com.atuguigu.java1;

import java.util.List;

/**
 * @Description
 * @Author lipeng
 * @Version V1.0.0
 * @Since 1.0
 * @create 2022/4/17
 * DAO:data(base)access object
 */
public class DAO<T> {
    //添加一条记录
    public void add(T t){

    }
    //删除一条记录
    public boolean remove(int index){
        return false;
    }
    //修改一条记录
    public void update(int index,T t){

    }
    //查询一条记录
    public T getIndex(int i){
        return null;
    }
    //查询多条记录
    public List<T> getList(){
        return null;
    }
    //泛型方法

    //举例：获取表中一共有多少条记录？获取员工的入职时间
    public <E>E getValue(){
        return null;
    }
}

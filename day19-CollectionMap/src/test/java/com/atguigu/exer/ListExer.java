package com.atguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ListExer.java
 * @Description TODO
 * @createTime 2022年04月10日 18:07:00
 */
public class ListExer {
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//[1, 2]-->[1, 3]

    }
    public  void updateList(List list){
//        list.remove(2);
        list.remove(new Integer(2));
    }
}

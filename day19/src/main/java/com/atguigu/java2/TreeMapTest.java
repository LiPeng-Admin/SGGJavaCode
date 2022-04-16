package com.atguigu.java2;

import org.junit.Test;

import java.util.*;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName TreeMapTest.java
 * @Description TODO
 * @createTime 2022年04月13日 23:19:00
 */
public class TreeMapTest {
    /*
    * 向TreeMap中添加key-value，要求key必须是由同一个类创建的对象 要照key进行排序：自然排序 、定制排序
    *
    * */

    @Test
    public void test1(){
        //自然排序：按照姓名从小到大排序,年龄从小到大排列
        User user=new User("Tom",18);
        User user1=new User("Jerry",20);
        User user2=new User("Jack",21);
        User user3=new User("Mark",16);
        User user4=new User("Rose",20);
        TreeMap map=new TreeMap();

        map.put(user,98);
        map.put(user1,67);
        map.put(user2,78);
        map.put(user3,59);
        map.put(user4,87);

        //自然排序
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry=(Map.Entry)obj;
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
    @Test
    public void test2(){

        //定制排序：按照年龄大小排
        TreeMap map=new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User user=(User) o1;
                    User user1=(User) o2;
                    //    按照年龄大小排
                    return Integer.compare(user.getAge(),user1.getAge());
                }
                throw new RuntimeException("输入的数据有误！");
            }
        });
        User user=new User("Tom",18);
        User user1=new User("Jerry",20);
        User user2=new User("Jack",21);
        User user3=new User("Mark",16);
        User user4=new User("Rose",20);
        map.put(user,54);
        map.put(user1,65);
        map.put(user2,78);
        map.put(user3,89);
        map.put(user4,92);

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry=(Map.Entry)obj;
            System.out.println(entry.getKey() + "----->" + entry.getValue());
        }

    }
}

package com.atguigu.exer1;

/**
 * @Description
 * @Author lipeng
 * @create 2022/4/18
 */
/*
 * 定义个泛型类DAO<T>在其中定义一个Map,成员变量，Map的键为String类型，值为T类型
 * 分别创建以下方法：
 * public void save(String id,T entrity):保存T类型的对象到Map成员变量中
 * public T get(String id):从map中获取id 对应的对象
 * public void update(String id,T entrity):替换map 中key为id 的内容，改为entrity对象
 * public List<T>list():返回map中存放的所有T对象
 * public void delete(String id):删除指定 id 对象
 *
 *
 *
 * */
public class DAO<T> {
    private Map<String, T> map=new HashMap<>();

    //保存T类型的对象到Map成员变量中
    public void save(String id, T entrity) {
        map.put(id, entrity);

    }

    //从map中获取id 对应的对象
    public T get(String id) {
        return map.get(id);

    }

    //替换map 中key为id 的内容，改为entrity对象
    public void update(String id, T entrity) {
        if (map.containsKey(id)) {
            map.put(id, entrity);
        }

    }

    //返回map中存放的所有T对象
    public List<T> list() {
        ArrayList<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t : values) {
            list.add(t);

        }
        return list;

    }

    //删除指定 id 对象
    public void delete(String id) {
        map.remove(id);

    }


}

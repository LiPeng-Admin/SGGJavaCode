package com.atuguigu.java5;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName StudentTest.java
 * @Description throw:手动的生成一个异常对象,并抛出（throw）
 * @createTime 2022年03月27日 21:55:00
 */
public class StudentTest {
    public static void main(String[] args) {
        try {
            Studnet studnet=new Studnet();
            studnet.regist(-1022);
            System.out.println(studnet.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Studnet{
    private int id;
    public void regist(int id) throws Exception {
        if(id>0){
            this.id=id;
        }else {
//            System.out.println("输入的数据非法！");
//            throw new RuntimeException("输入的数据非法"); //手动的生成一个异常对象,并抛出（throw）
//            throw new Exception();
            throw new MyException("不能输入负数");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Studnet{" +
                "id=" + id +
                '}';
    }
}
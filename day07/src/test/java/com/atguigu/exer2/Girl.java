package com.atigui.exer2;

public class Girl {
    private String name;
    private int age;


    public Girl(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void marray(Boy boy){
        System.out.println("我想嫁"+boy.getName());
        boy.marray(this);

    }
    /*
    * compare:比较两个对象的大小
    * 若为正数，则当前对象大
    * 若为负数，则当前对象小
    *0：当前对象与形参对象相等
    * */
    public int compare(Girl girl){
        if(this.age> girl.age){
            return 1;
        }else if(this.age<girl.age){
            return -1;
        }
        else{
            return 0;
        }

    }
}

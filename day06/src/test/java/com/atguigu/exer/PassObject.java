package com.atguigu.exer;
/*
定义一个PassObject类，在类中定义一个方法printAreas(),
该方法的定义如下：public void printAreas(Cicle c,int time)
在printAreas 方法中打印输出1到time 之间的每个整数半径值，以及对应的面积
例如：time为5 时，则输出半径为1,2,3,4,5,以及对应圆的面积

在main()方法调用printAreas()方法，调用完毕后输出当前半径值
*
*
* */


public class PassObject {
    public static void main(String[] args) {
        PassObject passObject=new PassObject();

        Circle circle=new Circle();
        passObject.printAreas(circle,6);
        System.out.println("now radius is "+ circle.radius);

    }
    public void printAreas(Circle c,int time){
        System.out.println("Radius"+"\t\t"+"Areas");
        for(int i=1;i<=time;i++){
            //圆的半径
            c.radius=i;

            System.out.println(c.radius+"\t\t"+c.findArea());
        }
        c.radius=time+1;

    }

}

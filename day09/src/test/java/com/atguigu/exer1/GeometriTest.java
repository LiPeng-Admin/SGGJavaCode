package com.atguigu.exer1;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName GeometriTest.java
 * @Description TODO
 * @createTime 2022年03月18日 09:06:00
 */
/*
* 定义一个测试类GeometriTest
* 编写equalsArea方法测试两个对象的面积是否相等
* 编写displayGeometricObject方法显示对象的面积
*
*
* */
public class GeometriTest {
    public static void main(String[] args) {
    GeometriTest test=new GeometriTest();
    Circle circle1=new Circle(2.3,"white",1.0);
    test.displayGeometricObject(circle1);
    Circle circle2=new Circle(3.3,"green",1.0);
    test.displayGeometricObject(circle2);
        System.out.println(test.equalArea(circle1, circle2));

        MyRectangle myRectangle=new MyRectangle(2.3,3.6,"red",1.0);
        test.displayGeometricObject(myRectangle);


    }



    //编写equalsArea方法测试两个对象的面积是否相等
    public boolean equalArea(GeometricObject geometricObject,GeometricObject geometricObject1){
        return geometricObject.findArea()==geometricObject1.findArea();
    }
    //编写displayGeometricObject方法显示对象的面积
    public void displayGeometricObject(GeometricObject geometricObject){ //多态性的使用：
        // GeometricObject geometricObject=new Circle
//
        System.out.println("面积为："+geometricObject.findArea());
    }

    }


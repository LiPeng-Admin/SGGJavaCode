package com.atguigu.exer;
/*
* 对象数组
* 定义类Student,包含三个属性：学号number(int),年级state(int)，成绩score(int).
* 创建20个学生对象，学号从1到20，年级和成绩都由随机数确定
* 问题一：打印出3年级（state值为3）的学生信息
* 问题二：使用冒泡排序安学生成绩排序，并遍历所有学生的信息
*
* 提示：生成随机数：Math.random(),返回值类型为double
* 四舍五入取整：Math.round(double d),返回值类型为long
*
* */
public class StudentTest {
    public static void main(String[] args) {
        Student[] student=new Student[20];

        for(int i=0;i<student.length;i++){
            //给数组元素赋值
            student[i]=new Student();
            //给Student 对象的属性赋值
            student[i].number=i+1;
            //学生年级[1,6]
            student[i].state= (int)(Math.random()*6+1);
            //学生成绩[0,100]
            student[i].score=(int)(Math.random()*101);

        }
        //遍历所有学生信息
        for(int i=0;i<student.length;i++){

            System.out.println(student[i].info());
        }
        System.out.println("******************");
        for(int i=0;i<student.length;i++){
            if(student[i].state==3){
                System.out.println(student[i].info());
            }
        }
        System.out.println("*******************");

        //使用冒泡排序安学生成绩排序
        for(int i=0;i<student.length-1;i++){
            for(int j=0;j<student.length-1-i;j++){
                if(student[j].score>student[j+1].score){
                  //如果需要排序，交换的是数组元素，Student对象！！！！
                    Student temp=student[j];
                    student[j]=student[j+1];
                    student[j+1]=temp;
                }
            }
        }
        //排序后遍历所有学生的信息
        for(int i=0;i<student.length;i++){
            System.out.println(student[i].info());
        }

    }

}

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
public class StudentUpdateTest {
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
        StudentUpdateTest test= new StudentUpdateTest();
        //问题一：打印出3年级（state值为3）的学生信息
        test.print(student);

        //问题二：使用冒泡排序安学生成绩排序
        test.studentState(student,3);
        //排序后遍历所有学生的信息
        test.sort(student);
        test.print(student);


    }
    public  void print(Student[] students){
        //遍历所有学生信息
        for(int i=0;i<students.length;i++){

            System.out.println(students[i].info());
        }
        System.out.println("******************");

    }
    public void studentState(Student[] students,int state){
        for(int i=0;i<students.length;i++){
            if(students[i].state==state){
                System.out.println(students[i].info());
            }
        }
        System.out.println("*******************");
    }
    public void sort(Student[] students){
        for(int i=0;i<students.length-1;i++){
            for(int j=0;j<students.length-1-i;j++){
                if(students[j].score>students[j+1].score){
                    //如果需要排序，交换的是数组元素，Student对象！！！！
                    Student temp=students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }
            }
        }

    }

}






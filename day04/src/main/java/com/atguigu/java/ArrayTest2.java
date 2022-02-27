package com.atguigu.java;

//二维数组
/* 1：二维数组的声明和初始化
 * 2：如何调用数组的指定位置的元素
 * 3：如何获取数组的长度
 * 4：如何遍历数组
 * 5：数组元素的默认初始化值
 * 6：数组的内存解析
*
**/
public class ArrayTest2 {
    public static void main(String[] args) {
   //1：二维数组的声明和初始化
        //静态初始化
        int [][]arr=new int[][]{{1,2,3},{4,5},{7,8,9}};
        //动态初始化1
        String [][]strings=new String[3][2];
        //动态初始化2
        String[][]strings1=new String[3][];

        //简写方式
        int[][]ints={{1,2,3},{4,5},{7,8,9}};

        //2：如何调用数组的指定位置的元素
        System.out.println(arr[0][1]);//2

        //3：如何获取数组的长度
        System.out.println(arr.length);//3
        System.out.println(arr[0].length);//3

        //4：如何遍历数组
        for(int i=0;i<ints.length;i++){
            for(int j=0;j<ints[i].length;j++){
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
        //5：数组元素的默认初始化值
        /*
        * 针对初始化方式一：如 int[][]ints=new int[4][3]
        * 外层元素的初始化值为：地址值
        * 内层元素的初始化为：整型：0，浮点型：0.0，char型：0,布尔型：false,String 或引用数据类型：null
        * 针对初始化方式二：如 int[][]ints=new int[4][]
        * 外层元素的初始化值为：null
        * 内层元素的初始化：npe 异常
        *
        *
        * */
        int [][]ns=new int[4][3];

        System.out.println(ns[0]);//  //地址值,[I@4554617c
        System.out.println(ns[0][1]); //0
        System.out.println("***************");
        String [][] strings2=new String[4][2];
        System.out.println(strings2[1]);//地址值
        System.out.println(strings2[0][1]);//null

        double [][]doubles=new double[3][];
        System.out.println(doubles[2]); //null
        System.out.println(doubles[2][1]); //npe




    }
}

 /*
  *使用简单数组
  * 1：创建一个类名为ArrayExer4类，在main()方法中声明array1和array2两个变量，
  * 他们是int []类型的数组
  * 2：使用大括号{},把array1初始化为8个素数：2,3,5,7,11,13,17,19
  * 3：显示array 的内容
  * 4：实现复制array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
  * (如array[0]=0,array[2]=2),
  * 打印array1
  *
  * */

package com.atguigu.exer;

public class ArrayExer3 {
    public static void main(String[] args) {
        int[] array3,array4;
        array3=new int[]{2,3,5,7,11,13,17,19};
        //显示array3 的内容
        for(int i=0;i<array3.length;i++){
            System.out.print(array3[i]+" ");
        }
        //数组的复制
        array4=new int[array3.length];
        //修改array4中的偶索引元素，使其等于索引值
        for(int i=0;i< array4.length;i++){
            if(i%2==0){
                array4[i]=array3[i];
            }

        }

        System.out.println();
        //打印array3
        for(int i=0;i<array3.length;i++){
            System.out.print(array3[i]+" ");
        }




    }
}

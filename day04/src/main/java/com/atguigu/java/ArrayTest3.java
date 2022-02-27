//算法的考察：求数值型数组中元素的最大值，最小值，平均数，总和等
package com.atguigu.java;
/*
* 定义一个int 型的一维数组。包含10个元素，分别赋一些随机整数
* 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来
* 要求：所有随机数都是两位整数:[10,99] [a,b]:Math.random()*(b-a+1)+a
*
* */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] ints=new int[10];
        for(int i=0;i<ints.length;i++) {
            //获取所有随机数都是两位整数
            ints[i] = (int) (Math.random() * 90 + 10);
            System.out.print(ints[i]+" ");
        }
        System.out.println();

            //获取所有元素的最大值
            int maxValue=ints[0];
            for(int i=1;i<ints.length;i++){
                if(maxValue<ints[i]){
                    maxValue=ints[i];

                }
            }
            System.out.println("随机的两位整数最大值为："+maxValue);
            //获取所有元素的最小值
            int minValue=ints[0];
            for(int i=1;i<ints.length;i++){
                if(minValue>ints[i]){
                   minValue=ints[i];
                }

            }
        System.out.println("随机的两位整数最小值为："+minValue);

            //获取所有元素的总和
        int sum=0;
        for(int i=0;i<ints.length;i++){
            sum+=ints[i];
        }
        System.out.println("随机的两位整数的总和是："+sum);

            //获取所有元素的平均值
        int avgValue=0;
        avgValue=sum/ints.length;
        System.out.println("随机的两位整数的平均值："+avgValue);

        }

    }


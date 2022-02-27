package com.atguigu.java;

public class ArraysUtils {
    //输出数组中的最大值
    public int getMaxValue(int [] arr) {
        int maxValue=arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxValue<arr[i]){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }

    //输出数组中的最小值
    public int getMixValue(int [] arr) {
        int mixValue=arr[0];
        for(int i=0;i<arr.length;i++){
            if(mixValue>arr[i]){
                mixValue=arr[i];
            }
        }
        return mixValue;
    }

    //输出数组中的总和
    public int getSum(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    //输出数组中的平均值

    public int getAvg(int[] arr){

        return getSum(arr) /arr.length;

    }

    //复制该数组
    public int[] copy(int[]arr){
        int []arr2=new int[]{arr.length};
        for(int i=0;i<arr.length;i++){
            arr[i]=arr2[i];
        }
        return arr2;
    }

    //遍历数组
    public  void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //数组的反转

    public void reverse(int[] arr) {
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        print(arr);

    }


    //数组的排序
    public void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
      print(arr);
    }

    //数组的查找(线性查找)
    public int getIndex(int []arr,int dest){
        for(int i=0;i<arr.length;i++){
            if(dest==arr[i]){
                return i;
            }
        }

        return -1; //返回一个负数表示没有找到
    }


}

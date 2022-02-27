package com.atguigu.exer;

public class BubbleSortExer {
    public static void main(String[] args) {
        int [] arr=new int[]{-1,0,-3,-2,0,22,3,8,6,5,10,88,33,44};
        //冒泡排序的实现(从小到大排列)
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //实现数组的反转
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //复制数组，得到一个新的数组
        int [] arr2=new int[arr.length];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i];
        }
        System.out.println();
        //使用线性查找，从上面的数组中查找是否存在22，若存在，返回所在位置的索引。不存在，输出提示信息
        boolean isFlag=true;
        int value=22;
        for(int i=0;i<arr2.length;i++){
            if(value==arr2[i]){
                System.out.print("该元素在数组的索引位置是："+i);
                isFlag=false;
                break;
            }

        }
        if(isFlag){
            System.out.println("很遗憾，未在该数组中找到该元素！");
        }
        System.out.println();

        //使用二分法查找
        int []ints=new int[]{-4,-2,0,12,14,16,18,22,33,55};
        int head=0;
        int end=ints.length-1;
        int dest=33;
        boolean isFlag1=true;
        while(head<=end){
            int middle=(head+end)/2;
                if(dest==ints[middle]){
                    System.out.print("该元素在数组的索引位置是："+middle);
                    isFlag1=false;
                    break;
                }else if(dest>ints[middle]){
                    head= middle+1;
                }else if(dest<ints[middle]){
                    end=middle-1;
                }

        }

        if(isFlag1){
            System.out.println("很遗憾，该元素未在该数组中找到！");

        }


    }
}

//算法的考查：数组的复制，反转，查找（线性查找,二分法查找）
package com.atguigu.java;

public class ArrayTest4 {
    public static void main(String[] args) {
        String []strings=new String[]{"aa","bb","cc","dd","ee"};
        for(int i=0;i<strings.length;i++){

            System.out.print(strings[i]+" ");
        }
        System.out.println();
        //数组的复制
        String[]strings1=new String[strings.length];
        for(int i=0;i<strings1.length;i++){
            strings1[i]=strings[i];
        }
        //数组的反转
        for(int i=0;i<strings.length/2;i++){
            String temp=strings[i];
            strings[i]=strings[strings.length-i-1];
            strings[strings.length-i-1]=temp;
        }
        for(int i=0;i<strings.length;i++){
            System.out.print(strings[i]+" ");
        }
        System.out.println();
        //数组查找
        //线性查找
        String [] strings2=new String[]{"A","B","C","D","E"};

        //定义一个需要查找的目标
        String dest="D";
        boolean isFlag=true;
        for(int i=0;i<strings2.length;i++){
            if(dest.equals(strings2[i])){
                System.out.println("当前数组存在此元素，位置为："+i);
                isFlag=false;
                break;
            }
        }
        if(isFlag){
            System.out.println("很遗憾，当前数组中不存在该元素！");
        }

        //二分法查找（前提：数组是有序的）:所谓二分法查找即从数组中间的目标开始查找
        int [] ints=new int[]{-12,-9,-6,0,5,7,9,12,15};
        //定义查找的目标
        int dest2=-9;
        int head=0; //首索引
        int end= ints.length-1;  //结束索引
        boolean isFlag1=true;
        while(head<=end){
            int middle=(end+head)/2;  //中间的索引位置
            if(dest2==ints[middle]){
                System.out.println("找到了该元素，元素位置为："+middle);
                isFlag1=false;
                break;

            }else if(dest2>ints[middle]){
                head=middle+1;
            }else if(dest2<ints[middle]){
                end=middle-1;
            }

        }
        if(isFlag1){
            System.out.println("很遗憾，没有找到目标元素！");
        }
    }
}

/*
*女儿家长要嫁女儿，提出要求
* 高：180cm 以上；富：财富1千万以上；帅：是
*如果这三个条件同时满足，则：我一定要嫁该他
* 如果这三个条件有为真的情况，则：嫁吧，比上不足比下有余
* 如果这三个都不满足，则：不嫁
* */


import java.util.Scanner;

public class IfExerTwoTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的身高(cm):");
        int height=scanner.nextInt();
        System.out.println("请输入你的财富(千万):");
        double wealth=scanner.nextDouble();
        //方式一：
//        System.out.println("是否帅气(true/false)");
//        boolean isHandsome=scanner.nextBoolean();
//
//        if(height>=180&& wealth>=1&& isHandsome){
//            System.out.println("我一定要嫁给他");
//
//        }else if(height>=180 ||wealth>=1 ||isHandsome){
//            System.out.println("嫁吧，比上不足比下有余");
//        }else{
//            System.out.println("不嫁");
//        }

        //方式二：
        System.out.println("是否帅气(是/否)");
        String isHandsome=scanner.next();
        if(height>=180&& wealth>=1&& isHandsome.equals("是")){
            System.out.println("我一定要嫁给他");

        }else if(height>=180 ||wealth>=1 ||isHandsome.equals("是")){
            System.out.println("嫁吧，比上不足比下有余");
        }else{
            System.out.println("不嫁");
        }


    }
}

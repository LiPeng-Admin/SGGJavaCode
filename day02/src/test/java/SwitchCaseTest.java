/*

*分支结构
格式
switch (表达式){
    case 常量1:
    break;
    case 常量2:
    break;
    ...
    default:
    break;
}
*根据switch 表达式中的值，依次匹配各个case 中的常量，一旦匹配成功，则进入相应case 结构中，
调用其执行语句，当调用完成执行语句以后，仍继续向下执行其他case 结构中的执行语句，
直到遇到break关键词或此switch-case结构末尾结束
switch 结构中的表达式，只能是如下的6种数据类型：byte,short,char,int,枚举了，String



* */

public class SwitchCaseTest {
    public static void main(String[] args) {
        int num=1;
        switch (num){
            case 0:
                System.out.println("zero");
               break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");

        }
        String season="summer";
        switch (season){
            case  "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬眠");
                break;
            default:
                System.out.println("输入的季节有误");
                break;

        }

    }
}

import java.util.Scanner;

/*
* 2019年，用户输入月份，日期，查询这是2019年的第多少天
*
*
* */
public class SwitchCaseThreeTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入month:");
        int month=scanner.nextInt();
        System.out.println("请输入day:");
        int day=scanner.nextInt();
        //定义一个变量
        int sumDay=0;
        //方法一：代码冗余
//        if(month==1){
//            System.out.println("这是2019年的第"+day+"天");
//        }else if(month==2){
//            System.out.println("这是2019年的第"+(day+31)+"天");
//        }else if(month==3){
//            System.out.println("这是2019年的第"+(day+31+28)+"天");
//        }
//        ...
//        else if(month==12){
//            System.out.println();
//
//        }
        //方法二：代码冗余
//        switch (sumDay){
//            case 1:
//                System.out.println("这是2019年的第"+day+"天");
//                break;
//            case 2:
//                System.out.println("这是2019年的第"+(day+31)+"天");
//                break;
//            case 3:
//                System.out.println("这是2019年的第"+(day+31+28)+"天");
//                ....
//
//            case 12:
//                System.out.println();
//        }
        //方法三
        //说明：break是可选的，开发中多数情况下是加上break
        switch (month){
            case 12:
                sumDay+=30;

            case 11:
                sumDay+=31;

            case 10:
                sumDay+=30;

            case 9:
                sumDay+=31;

            case 8:
                sumDay+=31;
            case 7:
                sumDay+=30;
            case 6:
                sumDay+=31;
            case 5:
                sumDay+=30;
            case 4:
                sumDay+=31;
            case 3:
                sumDay+=28;
            case 2:
                sumDay+=31;
            case 1:
                sumDay+=day;

        }
        System.out.println("这是2019年"+month+"月"+day+"日的第"+sumDay+"天");

    }
}

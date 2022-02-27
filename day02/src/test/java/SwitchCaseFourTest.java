

/*
* 从键盘分别输入年，月，日，判断这一天是当年的第几天
* 注：判断一年是否是闰年的标准
* 1）可以被4整除，但是不能被100整除
* 或2）可以被400整除
*
* */
import java.util.Scanner;
public class SwitchCaseFourTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入当前的年份year:");
        int year=scanner.nextInt();
        System.out.println("请输入当前的月份month:");
        int month=scanner.nextInt();
        System.out.println("请输入当前的日期day:");
        int day=scanner.nextInt();

        //定义一个当前总天数
        int sumDays=0;
        switch (month){
            case 12:
                sumDays+=30;
            case 11:
                sumDays+=31;
            case 10:
                sumDays+=30;
            case 9:
                sumDays+=31;
            case 8:
                sumDays+=31;
            case 7:
                sumDays+=30;
            case 6:
                sumDays+=31;
            case 5:
                sumDays+=30;
            case 4:
                sumDays+=31;
            case 3:
                //判断当前输入的是否是闰年
                if(year%4 ==0 && year%100!=0 ||year %400==0){
                    sumDays+=29;

                }else{
                    sumDays+=28;
                }
            case 2:
                sumDays+=31;
            case 1:
                sumDays+=day;

        }
        System.out.println("现在是"+year+"年"+month+"月"+day+"号"+"的第"+sumDays+"天");


    }
}

import java.util.Scanner;

public class IfExerTest {
    public static void main(String[] args) {
        int x=4;
        int y=1;
        if(x>2){
            if(y>2)
                System.out.println(x+y);
            System.out.println("atguigu"); //输出的结果为atguigu
        }else{
            System.out.println("x="+x);
        }
        /*
        * 我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每一年相当于人类的10.5岁，
        * 之后每增加一年就增加4岁，那么5岁的狗相当于人类多少年龄呢？
        * 编写一个程序。获取用户输入的狗的年龄,通过程序显示其相当于人类的年龄
        *
        * */
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入狗的年龄：");
        double dogAge=scanner.nextDouble();

        if(dogAge>0&&dogAge<=2){
            System.out.println(dogAge*10.5);
        }else if(dogAge>2){
            System.out.println("相当于人类的年龄是:"+(2*10.5+(dogAge-2)*4));
        }else {
            System.out.println("请正确输入狗的年龄");
        }

        //如何获取一个两位数的随机数：10-99
        //公式：[a,b]:(int)(Math.random()*(b-a+1)+a)
        int value=(int)(Math.random()*90+10);
        System.out.println("产生的随机数是: "+value);
    }
}

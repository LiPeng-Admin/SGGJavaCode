/*
成绩为100分时，奖励一辆BMW
成绩为(80-99]时，奖励一台iphone xs max
成绩为[60,80]，奖励一个iPad
其他时，什么奖励也没有
请从键盘输入小明的成绩，并加以判断
 */
import java.util.Scanner;
public class IfScannerTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入小明的成绩(0-100):");

        int score=scanner.nextInt();
        if(score==100){
            System.out.println("奖励一辆BMW");
        }else if(score >80 &&score<=99){
            System.out.println("奖励一台iphone xs max");
        }else if(score >=60&&score<=80){
            System.out.println("奖励一个iPad");
        }else {
            System.out.println("什么奖励也没有");
        }

    }
}

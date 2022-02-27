/*
给出一个三位数的整数，计算出百位上的值，十位上的数，各位上的数

* */
public class AriExer {
    public static void main(String[] args) {
        int num=187;
        int bai=num /100;
        int shi=num /10 %10;
        int ge=num %10;
        System.out.println("百位上的值："+bai);
        System.out.println("十位上的值："+shi);
        System.out.println("个位上的值："+ge);
    }
}

/*
For循环的使用
:一：循环结构的四个要素
1：初始化条件
2：循环条件(是boolean 类型)
3：循环体
4：迭代条件
二：for 循环的结构
for (1;2;4){
3
}

*
* */
public class ForTest {
    public static void main(String[] args) {
 //打印5次HelloWorld!
        for(int i=1;i<=5;i++){
            System.out.println("HelloWorld!");
        }
        //判断输出的结果
        int num=1;
        for(System.out.print("a");num<=3; System.out.print("c"),num++){
            System.out.print("b");
        }
        System.out.println();

        //输出100以内的奇数,所有奇数的和,计算所有奇数的个数

        int sum=0;
        int count=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println(i+" ");
                sum+=i;
                count++;
            }
        }
        System.out.println();
        System.out.println("所有奇数的和:"+sum);
        System.out.println("所有奇数的个数是:"+count);
    }
}

/*
运算符之四：逻辑运算符
& && | || ! ^
逻辑运算符的操作都是boolean 类型的变量
* */
public class LogicTest {
    public static void main(String[] args) {
        //区分& 与 &&
        //相同点：& 与 &&的运算结果相同
        //不同点：当符号左边是false,& 继续执行符号右边的运算，&& 不在执行
        boolean b1=true;
        b1=false;
        int num1=10;
        if(b1 &(num1++>0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num1="+num1);

        boolean b2=true;
        b2=false;
        int num2=10;
        if(b2 && (num2++>0)){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println("num2="+num2);
        //区分 | 与 ||
        //相同点：| 与||运算结果相同
        //相同点：当符号左边运算结果为false 时，| 与||都会执行符号右边的运算
        //不同点：符号左边的运算结果为true时，| 会继续执行符号右边的运算，而||不再执行符号右边的运算
        boolean b3=false;
        b3=true;
        int num3=10;
        if(b3 |num3++>0){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println("num3="+num3);

        boolean b4=false;
        b4=true;
        int num4=10;
        if(b4 || num4++>0){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println("num4="+num4);

        //Exercise
        int x=1;
        int y=1;
        if(x++==2 & ++y==2){
            x=7;
        }
        System.out.println("x="+x+",y="+y); //x=2,y=2

        int x1=1,y1=1;
        if(x1++==2 &&++y1==2){
            x1=7;
        }
        System.out.println("x1="+x1+",y1="+y1);//x1=2,y1=1

        int x2=1;
        int y2=1;
        if(x2++==1 |++y2==1){
            x2=7;
        }
        System.out.println("x2="+x2+",y2="+y2); //x2=7,y2=2

        int x3=1,y3=1;
        if(x3++==1 ||++y3==1){
            x3=7;
        }
        System.out.println("x3="+x3+",y3="+y3);//x3=7,y3=1

    }
}

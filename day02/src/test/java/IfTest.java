
/*
* 分支结构中的if-else
* 1：三种结构
* 第一种if(条件表达式){
* 执行表达式}
*
*第二种：二选一
* if(条件表达式){
* 执行表达式1
* }else{
* 执行表达式2}
*
* 第三种：多选一
* if(条件表达式1){
*执行表达式1
* }else if(条件表达式2){
* 执行表达式2
* }else if(条件表达式3){
* 执行表达式3
* }...else{
* 执行表达式。。
* }
*
* */
public class IfTest {
    public static void main(String[] args) {
        //举例一
        int heartBeats=79;
        if(heartBeats<60 ||heartBeats>100){
            System.out.println("需要做进一步检查");
        }
        System.out.println("体检结束，正常");
        //举例二：
        int age=23;
        if(age<18){
            System.out.println("未成年，可以看动画片");
        }else{
            System.out.println("已成年，可以看成年电影了");
        }
        //举例三：
           int age2=30;
        if(age2<0){
            System.out.println("输入不合法");
        }else if(age<18){
            System.out.println("青少年时期");
        }else if(age<35){
            System.out.println("青壮年时期");
        }else if(age<60){
            System.out.println("中年时期");
        }else {
            System.out.println("老年时期，退休年纪");
        }


    }
}

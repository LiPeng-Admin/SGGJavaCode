/*

使用switchc-case 判断成绩是否合格(0-100)
* */
public class SwitchCaseTwoTest {
    public static void main(String[] args) {
        int score=78;
        //方法一：
//        switch (score/10){
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("成绩不及格");
//                break;
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 10:
//                System.out.println("成绩及格");
//                break;
//            default:
//                System.out.println("请重新输入");
//                break;
//        }
        //方法二：
        switch (score /60){
            case 0:
                System.out.println("成绩不及格");
                break;
            case 1:
                System.out.println("成绩及格");
                break;
            default:
                System.out.println("请重新输入");
                break;
        }

    }
}

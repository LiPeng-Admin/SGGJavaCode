package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName EcmDef.java
 * @Description TODO
 * @createTime 2022年03月27日 22:38:00
 */
/*
* 编程程序EcmDef.java ，接收命令行的两个参数，要求不能输入负数，计算两数相除
* 对数据类型不一致，（NumberFormatException）,缺少命令行参数(ArrayIndexOutOfBoundsException)
* 除0（ArithmeticException）及输入负数（EcmDef自定义异常类）进行异常处理
* 提示：
*   1：在主类（EcmDef）中定义异常方法（ecm）完成两数相除功能
*   2：在main()方法中使用异常处理语句进行异常处理
*   3：在程序中，自定义对应输入对应异常类（EcDef）
*   4:运行时接收参数java EcmDef 20 10 //args[0]="20" args[1]="10"
*   5:Interger类的static方法parseInt(String s)将s转换成为对应的int 值
*      如：int a=Interger.parseInt("314") //a=314
*
*
* */
public class EcmDef {
    public static void main(String[] args) {
        try {
        int i=Integer.parseInt(args[0]);
        int j=Integer.parseInt(args[1]);

            int result= ecm(i,j);
            System.out.println(result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }catch (ArithmeticException e){
            e.printStackTrace();
        } catch (EcDef ecDef) {
            ecDef.printStackTrace();
        }

    }
    public static int ecm(int i,int j) throws EcDef {
        if(i<0||j<0){
            throw new EcDef("分子或分母不能为负数");
        }
        return i/j;

    }
}

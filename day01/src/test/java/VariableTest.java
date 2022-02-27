/*
Java 中的变量
    是程序中最基本的存储单元，包含 变量类型 变量名=存储的值;
    说明：
    变量必须先声明，后使用
    变量都定义再其作用域内，在作用域内，它是有效的
    同一个作用域内，不可以声明两个同名的变量

 */
public class VariableTest {
    public static void main(String[] args) {
        int myAge=12;
        System.out.println(myAge);
        int myNumber;
        //编译错误：使用myNumber 之前并未赋值
        //System.out.println(myNumber);
        myNumber=20;
    }
}

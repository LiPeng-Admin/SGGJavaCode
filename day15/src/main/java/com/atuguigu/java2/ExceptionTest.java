package com.atuguigu.java2;

import org.junit.Test;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ExceptionTest.java
 * @Description 异常处理
 * @createTime 2022年03月27日 13:15:00
 */
/*
* 一：异常处理：抓抛模型
*
*     过程一："抛"：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象，并
*             将此对象抛出。一旦抛出对象后，其他的代码就不在执行
*           关于异常对象的产生：①系统自动生成的异常对象
*                            ②手动的生成一个异常对象,并抛出（throw）
*     过程二："抓"：可以理解为异常的处理方式：①try-catch-finally,②throws
*
*二：try-catch-finally的使用
*     try{
* //可能出现异常的代码
* }catch(异常类型1 变量名1){
* //处理异常的方式1
* }catch(异常类型2 变量名2){
* //处理异常的方式2
* }catch(异常类型3 变量名3){
 * //处理异常的方式3
 * }
 * ...
 *
 *}finally{
 * 一定会执行的代码
 * }
*说明：
* 1:finally 是可选的
* 2:使用try 将可能出现异常的代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象
*   根据此对象的类型，去catch 中进行匹配
* 3：一旦try 中的异常对象匹配到某一个catch 时，就进入catch中进行异常的处理，一旦处理完成，跳出当前的
* try-catch 结构（在没有写finally的情况）继续执行其后的代码
* 4：若catch中的异常类型没有子父类关系，则谁声明在上，谁声明在下无所谓
*    若满足子父类关系，则要求子类一定声明在父类上面
*
* 5:常用的异常处理方式：①e.getMessage()② e.printStackTrace()
* 6:在try 结构中定义的变量，在出了try结构以后，不能再被调用
*
* 体会1：使用try-catch-finally 处理编译时异常，使得程序在编译时就不在报错，但是运行时仍可能报错，相当于我们是用
*       try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现
*
* 体会2：开发中，由于运行时异常比较常见，所以我们通常不针对运行时异常编写try-catch-finally
*       针对编译时异常，一定要考虑异常处理
*
*
* */
public class ExceptionTest {
    @Test
    public void test1(){
        String str="123";
        str="abc";
        try{

            Integer integer=Integer.parseInt(str);
            System.out.println("hello....1");
        }catch(NullPointerException e){
            System.out.println("出现空指针异常，不找着急。。。");
        }catch (NumberFormatException e){
//            System.out.println("出现数据转换异常，不找着急。。。");
            //
//            System.out.println(e.getMessage());
            //
            e.printStackTrace();

        }catch (Exception e){
            System.out.println("出现异常了！");
        }
        System.out.println("hello....2");
    }
}

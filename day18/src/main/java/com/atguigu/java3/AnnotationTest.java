package com.atguigu.java3;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName AnnotationTest.java
 * @Description 注解的使用
 * @createTime 2022年04月08日 22:57:00
 */
/*
* 1：注解的使用：
* ① jdk 5.0 新增的功能
  ② Annotation 其实就是代码里的特殊标记, 这些标记可以在编译, 类加载, 运行时被读取, 并执行相应的处理。
*               通过使用 Annotation,程序员可以在不改变原逻辑的情况下, 在源文件中嵌入一些补充信息。
* ④ 在JavaSE中，注解的使用目的比较简单，例如标记过时的功能，忽略警告等。在JavaEE/Android 中注解占据了更重要的角色，
*               例如用来配置应用程序的任何切面，代替JavaEE旧版中所遗留的繁冗 代码和XML配置等。
*
*2. 注解的使用示例
*   示例一：生成文档相关的注解
*   示例二：在编译时进行格式检查(JDK内置的个基本注解)
*   示例三：跟踪代码依赖性，实现替代配置文件功能
*
* 3：如何自定义注解：参照 @SuppressWarnings 定义
*       1:注解声明为：@interface
*       2:内部定义成员，通常使用value表示
*       3:可以指定成员的默认值，使用default定义
*       4:如果自定义注解没成员，表明是一个标识作用。
*
     如果注解有成员，在使用注解时，需要指明成员的值
     * 自定义注解必须配上注解的信息处理流程（使用反射）才有意义
     * 自定义注解通过都会指明两个元注解：Retention，Target
     *
  4:java 中的4种元注解：
  * 元注解：对现有的注解进行解释说明的注解
  *    1：@Retention：指定所修饰的 Annotation 的生命周期：SOURCE\CLASS（默认行为）\RUNTIME只有声明为RUNTIME生命周期的注解，
  *       才能通过反射获取。
       2：@Target:用于指定被修饰的 Annotation 能用于修饰哪些程序元素
       *****出现的频率较低*********
       3：@Documented:表示所修饰的注解在被javadoc解析时，保留下来。
       4：@Inherited:被它修饰的 Annotation 将具继承性。
       *
   5:通过反射获取注解信息
   *
   6:jdk8中注解的新特性： 可重复注解、类型注解
       *可重复注解：
             ① 在MyAnnotation上声明 @Repeatable，成员值为 MyAnnotations.class
             ② MyAnnotation的Target和Retention等元注解与MyAnnotations相同。
             *
        类型注解：
        ElementType.TYPE_PARAMETER 表示该注解能写在类型变量的声明语句中（如：泛型声明。）
        ElementType.TYPE_USE 表示该注解能写在使用类型的任何语句中。




*
* */
public class AnnotationTest {

}
@MyAnnotationTest(value = "hi")
@MyAnnotationTest(value = "abc")
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void walk(){
        System.out.println("人走路");
    }
    public void eat(){
        System.out.println("人吃饭");
    }


}

interface Info{
    void show();
}
class  Student extends Person implements Info{
    @Override
    public void walk() {
        System.out.println("学生走路");
    }


    @Override
    public void show() {
        System.out.println("学生信息");
    }
}
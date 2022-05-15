package com.atguigu.java;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/4
 */

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * File 类的使用
 * 1：File 类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
 *
 *
 *
 * */
public class FileTest {
    /*
     * 1:如何创建File 类的实例
         * File(Sting filePath)
         * File(String parentPath,String childPath)
         * File(String parentFile,String childPath)
       2:File类中涉及到文件或文件目录的创建，删除，重命名，修改时间，文件大小等方法
       * 并未涉及到写入或读取文件内容的操作，如果需要写入或读取文件内容，必须使用IO流来完成

       3:后续File 类的对象常会作为参数传入到流的构造器中，指明读取或写入的“终点”
       *
     * */
    @Test
    public void test1(){
        //构造器1：
        File file=new File("hello.txt");
        File file1=new File("E:\\java_code\\SGGJavaCode\\day21-IO\\he.txt");
        System.out.println(file);
        //构造器2：
        File file2=new File("E:\\java_code\\SGGJavaCode","day21-IO");
        System.out.println(file2);

        //构造器3：
        File file3=new File(file2,"hi.txt");
        System.out.println(file3);
    }
    /*
    2：file 常用方法
    *  2.1 File类的获取功能
          public String getAbsolutePath()：获取绝对路径
        * public String getPath()：获取路径
        * public String getName() ：获取名称
        * public String getParent()：获取上层文件目录路径。若无，返回 null
        * public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
        * public long lastModified() ：获取最后一次的修改时间，毫秒值

        如下的两个方法适用于文件目录：
        * public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
        * public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组

       2.2 File类的重命名功能

        public boolean renameTo(File dest):把文件重命名为指定的文件路径
        注意：file1.renameTo(file2)为例：要想保证返回 true ,需要file1在硬盘中是存在的，且file2不能在硬盘中存在。

       2.3 File类的判断功能
        public boolean isDirectory()：判断是否是文件目录
        public boolean isFile() ：判断是否是文件
        public boolean exists() ：判断是否存在
        public boolean canRead() ：判断是否可读
        public boolean canWrite() ：判断是否可写
        public boolean isHidden() ：判断是否隐藏

       2.4  Flie类的创建功能
        创建硬盘中对应的文件或文件目录
        public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
        public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
        public boolean mkdirs() ：创建文件目录。如果此文件目录存在，就不创建了。如果上层文件目录不存在，一并创建

       2.5File类的删除功能

        删除磁盘中的文件或文件目录
        public boolean delete()：删除文件或者文件夹
        删除注意事项：Java中的删除不走回收站。


 */
    @Test
    public void test2() {

        File file = new File("hello.txt");
        File file1 = new File("E:\\java_code\\SGGJavaCode\\io.hi.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.lastModified());

        System.out.println("********************");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

    }
    //public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
    //public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组
    @Test
    public void test3(){
        File file=new File("E:\\java_code\\SGGJavaCode");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);

        }
        System.out.println("***********");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);

        }
    }
    //File类的重命名功能

    @Test
    public void test4(){

        File file=new File("hello.txt");
        File file1=new File("E:\\java_code\\SGGJavaCode\\io\\hi.txt");

        //要想保证返回 true ,需要file1在硬盘中是存在的，且file2不能在硬盘中存在。
        boolean renameTo = file1.renameTo(file);
        System.out.println(renameTo);

    }

    // File类的判断功能
    @Test
    public void test5(){
        File file=new File("hello.txt");
        System.out.println(file.isDirectory());//false
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());//false

        System.out.println("**********************");

        File file1=new File("E:\\java_code\\SGGJavaCode\\io");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());//false
        System.out.println(file1.exists());
        System.out.println(file1.isHidden());//false
        System.out.println(file1.canWrite());
        System.out.println(file1.canRead());


    }
    @Test
    public void test6() throws IOException {
        File file=new File("hi.txt");
        if(!file.exists()){
            //文件的创建
            file.createNewFile();
            System.out.println("创建成功");
        }else {
            file.delete();
            System.out.println("删除成功");
        }

    }
    @Test
    public void test7(){
        File file=new File("E:\\java_code\\SGGJavaCode\\io\\io1\\io3");
        boolean mkdir = file.mkdir();
        if (mkdir){
            System.out.println("创建成功io1");
        }

        File file1=new File("E:\\java_code\\SGGJavaCode\\io\\io1\\io4");
        boolean mkdirs = file1.mkdirs();
        if (mkdirs){
            System.out.println("创建成功io4");

        }
    }

}

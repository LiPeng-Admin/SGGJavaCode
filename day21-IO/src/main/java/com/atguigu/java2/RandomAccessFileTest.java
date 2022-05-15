package com.atguigu.java2;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/15
 */
/*
RandomAccessFile的使用
1：RandomAccessFile直接继承于java.lang.Object类，实现了DataOutput，DataInput接口
2：RandomAccessFile既可以作为输入流，也可以作为输出流
3:RandomAccessFile 作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建，
    如果文件存在，则会对与原有内容进行覆盖，（默认情况下，是从头开始覆盖）



 */

public class RandomAccessFileTest {
    @Test
    public void testRandomAccessFile() {
        RandomAccessFile randomAccessFile = null;
        RandomAccessFile randomAccessFile1 = null;
        try {
            randomAccessFile = new RandomAccessFile(new File("pc.png"), "r");
            randomAccessFile1 = new RandomAccessFile(new File("pc1.png"), "rw");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = randomAccessFile.read(buffer)) != -1) {
                randomAccessFile1.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (randomAccessFile != null)
                    randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (randomAccessFile1 != null)
                    randomAccessFile1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    @Test
    public void testRandomAccessFile2() throws IOException {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("char.txt", "rw");
            //将指针调到角标为3的位置上
            file.seek(3);
            file.write("xyz".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            file.close();
        }

    }


}

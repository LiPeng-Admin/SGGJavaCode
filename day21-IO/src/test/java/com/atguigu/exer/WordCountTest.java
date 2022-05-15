package com.atguigu.exer;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Author lipeng
 * @create 2022/5/8
 */
//需求：统计文本字符出现的次数

    /*
    思路
    1:遍历文本的每一个字符
    2：字符出现的次数存在Map 中
    3：把map 中的数据写入文件
    *
    *
    * */
public class WordCountTest {
    @Test
    public void testWordCount() {
        FileWriter fileWriter=null;
        FileReader fileReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            File srcFile = new File("hello.txt");
            File destFile = new File("wordcount.txt");

            //1：创建Map集合
            Map<Character, Integer> map = new HashMap<>();
            //2:遍历每一个字符，每一个字符出现的次数放到map中
            fileReader = new FileReader(srcFile);
            int c = 0;
            while ((c = fileReader.read()) != -1) {
                //int 还原 char
                char ch = (char) c;
                //判断char 是否在map 中第一次出现
                if (map.get(ch) == null) {
                    map.put(ch, 1);

                } else {
                    map.put(ch, map.get(ch) + 1);
                }

            }
            //3；map中数据存在文件wordcount.txt
            fileWriter = new FileWriter(destFile);

            bufferedWriter = new BufferedWriter(fileWriter);
            //遍历map,在写入数据
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            for (Map.Entry<Character, Integer> entry : entries) {
                switch (entry.getKey()) {
                    case ' ':
                        bufferedWriter.write("空格= " + entry.getValue());
                        break;
                    case '\t':
                        bufferedWriter.write("tab键= " + entry.getValue());
                        break;
                    case '\r':
                        bufferedWriter.write("回车= " + entry.getValue());
                        break;
                    case '\n':
                        bufferedWriter.write("换行= " + entry.getValue());
                        break;
                    default:
                        bufferedWriter.write(entry.getKey() + "=" + entry.getValue());
                        break;
                }
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

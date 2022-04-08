package com.atguigu.java;

import org.junit.Test;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName StringMethodTest.java
 * @Description String 常用方法
 * @createTime 2022年04月04日 11:04:00
 */
public class StringMethodTest {
    /*
    *   int length():返回字符串的长度：return value.length
    *   char charAt(int index)： 返回某索引处的字符 return value[index]
        boolean isEmpty()：判断是否是空字符串：return value.length == 0
        String toLowerCase()：使用默认语言环境，将 String 中的所字符转换为小写
        String toUpperCase()：使用默认语言环境，将 String 中的所字符转换为大写
        String trim()：返回字符串的副本，忽略前导空白和尾部空白
        boolean equals(Object obj)：比较字符串的内容是否相同
        boolean equalsIgnoreCase(String anotherString)：与 equals() 方法类似，忽略大小写
        String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用 +
        int compareTo(String anotherString)：比较两个字符串的大小
        String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex 开始截取到最后的一个子字符串。
        String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从 beginIndex 开始截取到 endIndex (不包含)的一个子字符串。


   */
    @Test
    public void test1() {
        String str = "HelloWorld";
        System.out.println(str.length());//10
        System.out.println(str.charAt(5)); //w
        System.out.println(str.isEmpty()); //false
        String str2 = str.toLowerCase();
        System.out.println(str);//HelloWorld,str 不可变的，仍为原来的字符串
        System.out.println(str2);//helloworld
        System.out.println("****************");
        String str3 = " he ll o wor ld ";
        String str4 = str3.trim();
        System.out.println("-------" + str3 + "---------");
        System.out.println("-------" + str4 + "---------");

    }

    @Test
    public void test2() {
        String str = "HelloWorld";
        String str2 = "helloworld";
        System.out.println(str.equals(str2)); //false
        System.out.println(str.equalsIgnoreCase(str2));//true

        String str3="hello";
        String str4=str3.concat("world");
        System.out.println(str4);

        String str5="abc";
        String str6="ace";
        System.out.println(str5.compareTo(str6));//比较两个字符串的大小,涉及到字符串排序

        String str7="北京尚硅谷教育";

        //返回一个新的字符串，它是此字符串的从beginIndex 开始截取到最后的一个子字符串。
        String str8=str7.substring(2);
        System.out.println(str7);//北京尚硅谷教育
        System.out.println(str8);//尚硅谷教育

        //返回一个新字符串，它是此字符串从 beginIndex 开始截取到 endIndex (不包含)的一个子字符串。
        String str9=str7.substring(2,5);
        System.out.println(str9);//尚硅谷

    }
    /*
    *   boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束
        boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始
        boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
    * */
    @Test
    public void test3(){
        String str="helloworld";

        //测试此字符串是否以指定的后缀结束
        boolean str2 = str.endsWith("rld");
        System.out.println(str2);
        //测试此字符串是否以指定的前缀开始
        boolean str3 = str.startsWith("He");
        System.out.println(str3);

        //测试此字符串从指定索引开始的子字符串是否以指定前缀开始
        boolean str4 = str.startsWith("o", 4);
        System.out.println(str4); //true

    }

    /*
    *
    *boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true
    int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引
    int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
    int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引
    int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索

    * indexOf 和 lastIndexOf 方法如果未找到都是返回-1
    *
    * 什么情况下，indexOf（str） 与lastIndexOf(str)返回值相同？
    * 情况一：存在唯一的一个str
    * 情况二：不存在str
    *

    * */
    @Test
    public void test4(){
        String str="helloworld";
        String str2="wo";
        System.out.println(str.contains(str2));//true

        //返回指定子字符串在此字符串中第一次出现处的索引
        System.out.println(str.indexOf("lo"));//3

        //返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
        System.out.println(str.indexOf("lo", 5));//-1,表示没找到

        //回指定子字符串在此字符串中最右边出现处的索引
        String str3="hellorworldor";
        System.out.println(str3.lastIndexOf("or"));//1

        //返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索
        System.out.println(str3.lastIndexOf("or", 5));//4

    }


    /*
    * 替换：
    *   String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所 oldChar 得到的。
        String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所匹配字面值目标序列的子字符串。
        String replaceAll(String regex, String replacement)：使用给定的 replacement 替换此字符串所匹配给定的正则表达式的子字符串。
        String replaceFirst(String regex, String replacement)：使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
      匹配:
        boolean matches(String regex)：告知此字符串是否匹配给定的正则表达式。

      切片：
      * String[] split(String regex)：根据给定正则表达式的匹配拆分此字符串。
        String[] split(String regex, int limit)：根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，
        *                                        如果超过了，剩下的全部都放到最后一个元素中。
    */

    @Test
    public void test5(){
        //替换
        String str="北京尚硅谷教育北京教育";
        //返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所 oldChar 得到的。
        String str2 = str.replace('北', '南');
        System.out.println(str);//北京尚硅谷教育北京教育
        System.out.println(str2);//南京尚硅谷教育南京教育

        //使用指定的字面值替换序列替换此字符串所匹配字面值目标序列的子字符串
        String str3=str.replace("北京","上海");
        System.out.println(str3);//上海尚硅谷教育上海教育

        System.out.println("**********************");
        String str4="12hello34world5java7891mysql456";
        //把字符串中的数字替换成"，"
        String str5 = str4.replaceAll("\\d+", ",");
        System.out.println(str5);//,hello,world,java,mysql,
        //如果结果中开头和结尾有"，"的话去掉
        String str6 = str5.replaceAll("^,|,$", "");
        System.out.println(str6);//hello,world,java,mysql
        System.out.println("**********************");

//       匹配:
//        boolean matches(String regex)：告知此字符串是否匹配给定的正则表达式。
        String str7="123466789abc";
        boolean matches1 = str7.matches("\\d+");
        System.out.println(matches1);

        //判断这是否是一个杭州的固定电话
        String tel="0571-4534289";
        boolean tel2 = tel.matches("0571-\\d{7,8}");
        System.out.println(tel2);
        System.out.println("*********************");

        // 切片：
        // String[] split(String regex)：根据给定正则表达式的匹配拆分此字符串。
        // String[] split(String regex, int limit)：根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，
        //        *                                 如果超过了，剩下的全部都放到最后一个元素中。

        String str8="hello|world|java";
        String [] strs=str8.split("\\|");
        for (int i = 0; i <strs.length ; i++) {
            System.out.print(strs[i]+" ");

        }
        System.out.println();
        String str9="hello.world.java";
        String []strs2=str9.split("\\.");
        for (int i = 0; i < strs2.length; i++) {
            System.out.print(strs2[i]+" ");

        }


    }

}

package test;


import java.io.*;
import java.util.*;


/***0-9对应Ascii 48-57
 *A-Z 65-90
 *a-z 97-122
 *第33～126号(共94个)是字符，其中第48～57号为0～9十个阿拉伯数字
 */

public class SaiMaTest {
    public static void main(String[] args) {

//        String a = "abc";
//        byte[] bytes = a.getBytes();
//        char[] chars = a.toCharArray();
//
//        for (int i = 0; i < bytes.length; i++) {
//            LogUtils.logLn(bytes[i]);
//        }

//        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(10,10,true);
//        map.put("1", 1);
//        map.put("2", 2);
//        map.put("3", 3);
//        map.put("4", 4);
//        map.put("a", 5);
//        map.put("b", 6);
//
//        final Integer a = map.get("a");
//
//
//        for(Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("key:" + entry.getKey() + "   value:" + entry.getValue());
//        }
//        for (int i = 0; i < chars.length; i++) {
//            LogUtils.logLn(chars[i]);
//        }
//        ArrayList<String> strings = new ArrayList<String>();
//        strings.add("Hello, World!");
//        strings.add("Welcome to online interview system of Acmcoder.");
//        strings.add("This system is running Java 8.");
//
//        for (String string : strings) {
//            System.out.println(string);
//        }
//
//        int a, b;
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()) {
//            a = in.nextInt();
//            b = in.nextInt();
//            System.out.printf("Your result is : %d\n", a + b);
//        }
    }
}

/**
 * 判断字符重复出现次数
 */
class Test2 {
    public static char FindThreeChar(String str) {

        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();//抛出异常
        }
        int[] count = new int[255];//存储每个字符
        char[] chars = str.toCharArray();//String类型转换为字符数组
        for (char c : chars) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                count[c]++;//对每个字符进行计数
                if (count[c] == 3) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        System.out.print(FindThreeChar("Have you ever gone shopping and"));
    }
}

/*
 *酒店区间
 */
class test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end, price;
        int minDay = 0;
        int maxDay = 0;
        int[] money = new int[10000];
        while (input.hasNext()) {
            start = input.nextInt();
            end = input.nextInt();
            price = input.nextInt();
            for (int i = start; i <= end; i++) {
                money[i] = price;
            }
            if (minDay > start)
                minDay = start;
            if (maxDay < end)
                maxDay = end;
        }
        int min_id;
        for (int i = minDay; i <= maxDay; i++) {
            min_id = i;
            if (money[i] == 0)
                continue;
            while (money[i] == money[i + 1] && i + 1 <= maxDay)
                i++;
            System.out.print("[" + min_id + "," + i + "," + money[i] + "]");
            if (i != maxDay)
                System.out.print(",");
        }
    }
}



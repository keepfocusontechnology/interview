package test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyTest {


    public static void main(String[] args) {
        squareRoot(4);
    }


    static void system(char[] chars) {
        for (int n = 0; n < chars.length; n++) {
            System.out.print(chars[n]);
        }
    }


    static <T> void system1(List<T> c) {
        for (int n = 0; n < c.size(); n++) {
            System.out.println(c.get(n));
        }
        System.out.println("------------------------");
    }

    public static void test() {

        List<User> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User u2 = new User();
            u2.setFirstName("123");
            u2.setLastName("456");
            list1.add(u2);
        }

        System.out.println("start");
        system1(list1);

        List<User> list2 = new ArrayList<>(list1);

//        list2.add(list1.get(0));
//        list2.add(list1.get(1));
//
//        for (int i = 0; i < list2.size(); i++) {
//            list2.get(i).setLastName("abc");
//        }
//
//        System.out.println("end");
//        system1(list1);
//        system1(list2);

        List<User> users = new ArrayList<>();
        try {
            users = deepCopy(list1);

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < users.size(); i++) {
            users.get(i).setLastName("abc");
        }

        System.out.println("end");
        system1(list1);
        system1(users);

    }

    public static <T> List<T> deepCopy(List<T> src) throws Exception {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        out.writeObject(src);

        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(byteIn);
        @SuppressWarnings("unchecked")
        List<T> dest = (List<T>) in.readObject();
        return dest;
    }

    public static int squareRoot(int x) {

        String _s = "x";
        final double sqrt = Math.sqrt(x);
        final String s = String.valueOf(sqrt);

        String replace = s.replace(".", _s);
        if (replace.contains(_s)) {
            String[] split = replace.split(_s);
            System.out.println(split.length);
            return Integer.valueOf(split[0]);
        }
        return Integer.valueOf(s);
    }

    public static void test1() {

        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = "a";
            list1.add(s);
        }

        System.out.println("start");
        system1(list1);

        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);

        for (int i = 0; i < list2.size(); i++) {
            String s = list2.get(i);
            s = "b";
        }

        System.out.println("end");
        system1(list1);
        system1(list2);

    }
}



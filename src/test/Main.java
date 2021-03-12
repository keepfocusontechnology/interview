package test;

public class Main {


    public static void main(String[] args) {

//        String test = "hello world !";
//        char[] chars = test.toCharArray();
//        String test1 = "abcd";
//        system(revertChars(test1.toCharArray(), 0, 3));
//        system(revertStr(chars));
        test();
    }

//    static char[] revertStr(char[] chs) {
//        int start = 0;
//        int stop = 0;
//
//        for (int n = 0; n < chs.length; n++) {
//            char aChar = chs[n];
//            if (aChar == ' ') {
//                stop = n - 1;
//                revertChars(chs, start, stop);
//                start = n + 1;
//            }
//        }
//        revertChars(chs, 0, chs.length);
//        return chs;
//    }
//
//    static char[] revertChars(char[] chars, int start, int end) {
//        if (end < start) {
//            return chars;
//        }
//
//        if (end > chars.length - 1) {
//            end = chars.length - 1;
//        }
//
//        for (int i = start; i < end; i++) {
//            if (end == i) {
//                break;
//            }
//            char temp = chars[i];
//            chars[i] = chars[end];
//            chars[end] = temp;
//            end--;
//        }
//        return chars;
//    }


    static void system(char[] chars) {
        for (int n = 0; n < chars.length; n++) {
            System.out.print(chars[n]);
        }
    }

    public static void test() {


        User u1 = new User();
        u1.setFirstName("xixi");
        u1.setLastName("haha");
        change(u1); // 不变 xixi haha
        System.out.println(u1);
        changeR(u1); // 不变 ，只是copy了一份地址给它
        System.out.println(u1);

    }

    public static void change(User u2) {

        u2 = new User();
        u2.setFirstName("xx");
        u2.setLastName("yy");
    }

    public static User changeR(User user) {

        User u2 = new User();
        u2.setFirstName("xx");
        u2.setLastName("yy");
        user = u2;
        System.out.println("123"+user);
        return user;
    }


}



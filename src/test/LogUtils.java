package test;

import test.link.ListNode;

import java.util.Stack;

public class LogUtils {

    public static void logLn(int s) {
        System.out.println(s);
    }

    public static void log(int s) {
        System.out.print(s);
    }

    public static void logLn(String s) {
        System.out.println(s);
    }


    public static void log(String s) {
        System.out.print(s);
    }


    public static void log(Object s) {
        System.out.println(s);
    }

    public static void logLine(){
        System.out.println("------------------------------------------------------------");
    }

    public static void printArray(int[][] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.print(arr[x][y]);
            }
            System.out.println();
        }
    }


    public static void printArray(Object[] chars) {
        if (chars.length <= 0) {
            System.out.println("error len = 0");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int n = 0; n < chars.length; n++) {
            if (n == 0) {
                sb.append("[" + chars[n] + ",");
            } else if (n == chars.length - 1) {
                sb.append(chars[n] + "]");
            } else {
                sb.append(chars[n] + ",");
            }
            System.out.print(sb.toString());
        }
    }

    public static void printArray(Stack stack) {
        if (stack.size() <= 0) {
            System.out.println("error len = 0");
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop()+ ",");
        }
        System.out.print(sb.toString());
    }

    public static void logArr(int[] nums) {
        printArray(nums);
    }

    public static void printArray(int[] chars) {
        if (chars.length <= 0) {
            System.out.println("error len = 0");
            return;
        }
        StringBuilder sb = new StringBuilder();

        if(chars.length==1){
            sb.append("["+chars[0] + "]");
            System.out.println(sb.toString());
            return;
        }
        for (int n = 0; n < chars.length; n++) {
            if (n == 0) {
                sb.append("[" + chars[n] + ",");
            } else if (n == chars.length - 1) {
                sb.append(chars[n] + "]");
            } else {
                sb.append(chars[n] + ",");
            }
        }
        System.out.println(sb.toString());
    }


    public static void logNode(ListNode<Integer> node){
        if(node!=null){
            int[] nums = new int[node.getLength(node)];
            int i=0;
            while (node!=null){
                nums[i++] =node.val;
                node = node.next;
            }
            printArray(nums);
        }
    }
}

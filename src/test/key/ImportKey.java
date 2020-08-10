package test.key;

import test.link.MyNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 每天一默写
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-08-04 17:01
 **/
public class ImportKey {


    /**
     * 每天一默写 ---快排
     *
     * @param nums
     * @param left
     * @param right
     * @return
     */
    public int[] quickSort(int[] nums, int left, int right) {
        if (left >= right || nums.length < 2) {
            return nums;
        }

        int mid = getMid(nums, left, right);

        quickSort(nums, left, mid);
        quickSort(nums, mid + 1, right);
        return nums;
    }

    private int getMid(int[] nums, int left, int right) {

        int temp = nums[left];

        while (left < right) {

            while (left < right && nums[right] >= temp) {
                right--;
            }

            nums[left] = nums[right];

            while (left < right && nums[left] <= temp) {
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = temp;
        return left;
    }

    /**
     * 打印杨辉三角形
     */
    public void printTriangle(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row - j; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n <= i; n++) {
                System.out.print(getNums(i, n) + " ");
            }
            System.out.println("");
        }
    }


    private int getNums(int x, int y) {
        if (x == 0 || y == 0 || x == y) {
            return 1;
        }
        return getNums(x - 1, y - 1) + getNums(x - 1, y);
    }


    /**
     * 按数字大小合并两个单链表
     *
     * @return
     */
    public MyNode<Integer> mergeTwoNode(MyNode<Integer> l1, MyNode<Integer> l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val <= l2.val) {
            l1.next = mergeTwoNode(l1.next, l2);
            System.out.println("return l1" + l1);
            return l1;
        } else {
            l2.next = mergeTwoNode(l1, l2.next);
            System.out.println("return l1" + l2);
            return l2;
        }
    }


    /**
     * 获取乘积，不用乘法
     *
     * @param a
     * @param b
     * @return
     */
    public int getX(int a, int b) {
        while (b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            System.out.println("c = " + c);
            a ^= b; // a = 非进位和
            System.out.println("a = " + a);
            b = c; // b = 进位
        }
        return a;
    }

    /**
     * 单链表反转
     */

    public MyNode<Integer> reverse(MyNode<Integer> src) {
        if (src.next == null) {
            return src;
        }
        MyNode<Integer> node = reverse(src.next);
        src.next.next = src;
        src.next = null;
        return node;
    }


    /**
     * 二叉树Z字型打印
     */

    public void printZTree() {

    }


    /**
     * 算法判断一个数是不是2的n次幂
     */
    public boolean isTwoPow(int n) {
        int i = n & (n - 1);
        return i == 0;
    }


    /**
     * 获取阶乘
     *
     * @param n
     * @return
     */
    public int getJC(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * getJC(n - 1);
        }
    }


    /**
     * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
     * <p>
     * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
     * <p>
     * L   C   I   R
     * E T O E S I I G
     * E   D   H   N
     * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
     */
    public String getStr(String s, int rowNum) {

        if (rowNum < 2) return s;
        List<StringBuilder> rows = new ArrayList<>();

        for (int j = 0; j < rowNum; j++) {
            rows.add(new StringBuilder());
        }

        int i = 0;
        int flag = -1;

        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == rowNum - 1) {
                flag = -flag;
            }

            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);
        return res.toString();
    }

    public MyNode<Integer> addTwoNumbers(MyNode<Integer> l1, MyNode<Integer> l2) {
        StringBuilder s1 = new StringBuilder();
        while (l1!= null) {
            s1.append(l1.val);
            l1 = l1.next;
        }

        StringBuilder s2 = new StringBuilder();
        while (l2 != null) {
            s2.append(l2.val);
            l2 = l2.next;
        }

        int result = Integer.valueOf(s1.toString()) +
                Integer.valueOf(s2.toString());

        String temp = String.valueOf(result);
        char[] ctrs = temp.toCharArray();

        MyNode<Integer> head = new MyNode<>(Integer.valueOf(ctrs[0] + ""));
        MyNode<Integer> node = new MyNode<>(Integer.valueOf(ctrs[1] + ""));
        head.next = node;
        for (int i = 2; i < ctrs.length; i++) {
            MyNode<Integer> res = new MyNode<>(Integer.valueOf(ctrs[2] + ""));
            node.next = res;
            node = res;
        }


        return reverse(head);
    }


}

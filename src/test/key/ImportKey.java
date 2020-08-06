package test.key;

import test.link.MyNode;

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

        if (l1.t <= l2.t) {
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
        if (src == null || src.next == null) {
            return src;
        }
        MyNode reverse = reverse(src.next);
        src.next.next = src;
        src.next = null;
        return reverse;
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


}

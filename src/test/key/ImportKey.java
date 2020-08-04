package test.key;

import test.LogUtils;
import test.link.MyLinkedList;

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

        if (null == nums || nums.length < 2) { //边界情况控制
            return nums;
        }

        if (left < right) {
            int mid = getMid(nums, left, right);
            //递归
            quickSort(nums, left, mid);
            quickSort(nums, mid + 1, right);
        }


        return nums;
    }

    private int getMid(int[] nums, int left, int right) {

        int temp = nums[left];

        while (left < right) {

            while (left < right && temp <= nums[right]) {
                right--;
            }

            if (left < right) {
                nums[left] = nums[right];
            }
            while (left < right && temp >= nums[right]) {
                left++;
            }
            if (left < right)
                nums[right] = nums[left];
        }

        nums[left] = temp;
        return left;
    }

    /**
     * 打印杨辉三角形
     */
    public void printTriangle(int row) {
        if (row == 1) {
            LogUtils.log(1);
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(getNums(i, j) + " ");
            }
            System.out.println("");
        }
    }


    // 1, 0
    private int getNums(int x, int y) {
        if (x == 0 || y == x) {
            return 1;
        }
        if ( y == 0) {
            return 1;
        }
        int c = getNums(x - 1, y - 1) + getNums(x - 1, y);
        return c;
    }


    /**
     * 按数字大小合并两个单链表
     *
     * @param list1
     * @param list2
     * @return
     */
    public MyLinkedList<Integer> mergeTwoNode(MyLinkedList<Integer> list1, MyLinkedList<Integer> list2) {

        //例如：node1 = {1,2,3,4} node2 = {1,2,3,5},合并完{1,1,2,2,3,3,4,5}

        return null;
    }


    /**
     * 单链表反转
     */

    public MyLinkedList<Integer> reverse(MyLinkedList<Integer> src) {
        return null;
    }


    /**
     * 二叉树Z字型打印
     */

    public void printZTree() {

    }


    /**
     * 算法判断一个数是不是2的n次幂
     */
    public boolean isTwoPow() {

        return false;
    }


}

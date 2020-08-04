package test.key;

import test.LogUtils;
import test.link.MyLinkedList;
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


    private int getNums(int x, int y) {
        if (x == 0 || y == x || y == 0) {
            return 1;
        }
        int c = getNums(x - 1, y - 1) + getNums(x - 1, y);
        return c;
    }


    /**
     * 按数字大小合并两个单链表
     *
     * @return
     */
    public MyNode<Integer> mergeTwoNode(MyNode<Integer> node, MyNode<Integer> node1) {

        MyNode<Integer> head = null;

        if (node == null) {
            return node1;
        }
        if (node1 == null) {
            return node;
        }
        if (node.t <= node1.t) {//如果l1节点的值小于等于l2节点的值，由于这两个链表是有序的，所以合并后最小的节点(head节点)就是它们两者中的小者
            head = node;
            node = node.next;//后移，用于继续比较选出接下来最小的节点
        }else {
            head = node1;
            node1 = node1.next;
        }

        MyNode<Integer> result= head;

        while (node != null && node1 != null) {
            if (node.t <= node1.t) {
                result.next = node;
                node = node.next;
            } else {
                result.next = (node1);
                node1 = node1.next;
            }
            result = result.next;
        }

        if (node != null) {
            result.next = node;
        }

        if (node1 != null) {
            result.next = node1;
        }

        return head;
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

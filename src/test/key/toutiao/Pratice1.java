package test.key.toutiao;


import org.omg.CORBA.PUBLIC_MEMBER;
import test.LogUtils;
import test.link.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * <p>
 * k 是一个正整数，它的值小于或等于链表的长度。
 * <p>
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * <p>
 * <p>
 * 进阶：
 * <p>
 * 你可以设计一个只使用常数额外空间的算法来解决此问题吗？
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-nodes-in-k-group
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Pratice1 {

    public static void main(String[] args) {

        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(2);
        ListNode<Integer> node3 = new ListNode<>(3);
        ListNode<Integer> node4 = new ListNode<>(4);
        ListNode<Integer> node5 = new ListNode<>(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        int k = 2;

        LogUtils.logNode(node1);

        ListNode re = reverseKGroup2(node1, k);
        LogUtils.logNode(re);
    }

    //自个儿的笨方法，通过栈做的。
    public static ListNode<Integer> reverseKGroup(ListNode<Integer> head, int k) {
        ListNode<Integer> temp = head;

        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        ListNode<Integer> src1 = head;

        int result = 0;
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if (k <= len) {
            int nums = len / k;
            int nums_src = 0;
            while (nums_src < nums) {
                for (int i = 0; i < k; i++) {
                    stack.push(src1.val);
                    src1 = src1.next;
                }
                for (int i = 0; i < k; i++) {
                    list.add(stack.pop());
                }
                nums_src++;
            }

            while (src1 != null) {
                list.add(src1.val);
                src1 = src1.next;
            }
        } else {
            return null;
        }

        ListNode<Integer> finalRe = new ListNode<>(list.get(0));
        ListNode<Integer> other = finalRe;

        for (int i = 1; i < list.size(); i++) {
            ListNode<Integer> temp1 = new ListNode<>(list.get(i));
            other.next = temp1;
            other = temp1;
        }

        return finalRe;
    }


    /*
     *递归方法,网上看的
     */
    public static ListNode reverseKGroup2(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            //剩余数量小于k的话，则不需要反转。
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        // 反转前 k 个元素
        ListNode newHead = reverse(head, tail);
        //下一轮的开始的地方就是tail
        head.next = reverseKGroup(tail, k);

        return newHead;
    }

    /*
    左闭又开区间
     */
    private static ListNode reverse(ListNode head, ListNode tail) {
        ListNode pre = null;
        ListNode next = null;
        while (head != tail) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }


}

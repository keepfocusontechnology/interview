package test.link;

import test.LogUtils;
import test.key.ImportKey;

/**
 * 链表测试
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-07-30 10:55
 **/
public class LinkedTest {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(2);
        ListNode<Integer> node3 = new ListNode<>(3);
        ListNode<Integer> node4 = new ListNode<>(4);
        ListNode<Integer> node5 = new ListNode<>(5);
        ListNode<Integer> node6 = new ListNode<>(6);
//        list.add(node1);
//        list.add(node2);
//        list.add(node3);
//        list.add(node4);
//        list.add(node5);
//        list.printSelf();
//        SysUtils.log("----");
//        final Integer delete = list.delete(1);
//        SysUtils.log(delete);
//        SysUtils.log("----");
//        list.printSelf();

//        boolean circle = list.isCircle();
//        LogUtils.log(circle);
        node1.next =node2;
        node2.next =node3;
        node3.next =node4;
        node4.next =node5;
        node5.next =node6;


        LogUtils.logNode(node1);
//        ListNode node =  NodeExercises.delK(node1,2);
//        LogUtils.logNode(NodeExercises.delK(node6,1));

        ImportKey key = new ImportKey();
        LogUtils.logNode(key.reverse1(node1));
    }
}

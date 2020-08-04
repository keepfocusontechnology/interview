package test.link;

import test.LogUtils;

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
        MyNode<Integer> node1 = new MyNode<>(1);
        MyNode<Integer> node2 = new MyNode<>(2);
        MyNode<Integer> node3 = new MyNode<>(3);
        MyNode<Integer> node4 = new MyNode<>(4);
        MyNode<Integer> node5 = new MyNode<>(5);
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.add(node5);

        list.printSelf();
//        SysUtils.log("----");
//        final Integer delete = list.delete(1);
//        SysUtils.log(delete);
//        SysUtils.log("----");
//        list.printSelf();

        boolean circle = list.isCircle();
        LogUtils.log(circle);
    }
}

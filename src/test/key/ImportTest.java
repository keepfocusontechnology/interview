package test.key;

import test.LogUtils;
import test.link.MyNode;

/**
 * 测试归类
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-08-04 17:06
 **/
public class ImportTest {

    public static void main(String[] args) {
        final ImportKey importKey = new ImportKey();


//        LogUtils.log("快速排序前:");
//
//
//        int[] nums = {3, 8, 1, 9, 4, 5, 7, 10, 6};
//        LogUtils.printArray(nums);
//
//        LogUtils.log("快速排序后:");
//
//        LogUtils.printArray(importKey.quickSort(nums, 0, nums.length - 1));

//
//        LogUtils.log("杨辉三角打印:");
//
//        importKey.printTriangle(3);

//?
//
//
//
//        MyNode<Integer> node = importKey.mergeTwoNode(node1, node2_2);
//
//        LogUtils.log(node);
        MyNode<Integer> node1 = new MyNode<>(1);
        MyNode<Integer> node2 = new MyNode<>(8);
//        MyNode<Integer> node3 = new MyNode<>(3);

        node1.next=node2;
//        node2.next=node3;

        MyNode<Integer> node1_1 = new MyNode<>(0);
//        MyNode<Integer> node2_2 = new MyNode<>(6);
//        MyNode<Integer> node3_3 = new MyNode<>(4);

//        node1_1.next=node2_2;
//        node2_2.next=node3_3;

//        LogUtils.log(node1);

//        importKey.reverse(node1);
//        LogUtils.log(importKey.reverse(node1));


//        LogUtils.log(importKey.getJC(4));

//        LogUtils.log(importKey.isTwoPow(5));

//        int x = 4;
//        int y = 5;
//
//        int n = importKey.getX(x, y);
//
//        LogUtils.log(n);


        LogUtils.log(importKey.addTwoNumbers(node1,node1_1));

    }
}

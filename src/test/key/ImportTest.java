package test.key;

import sun.rmi.runtime.Log;
import test.LogUtils;

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
            LogUtils.log(importKey.minPartitions("123456"));

//        LogUtils.log("排序前:");
//        int[] nums = {3, 8, 1, 9, 4, 5, 7, 10, 6};
//        LogUtils.printArray(nums);
//        LogUtils.log("排序后:");

//        LogUtils.printArray(importKey.quickSort(nums, 0, nums.length - 1));
//        LogUtils.printArray(importKey.shell_sort(nums));
//        LogUtils.logLn("杨辉三角打印:");
//        importKey.printTriangle(10);
//        MyNode<Integer> node = importKey.mergeTwoNode(node1, node2_2);
//
//        LogUtils.log(node);
//        MyNode<Integer> node1 = new MyNode<>(1);
//        MyNode<Integer> node2 = new MyNode<>(8);
//        MyNode<Integer> node3 = new MyNode<>(3);

//        node1.next=node2;
//        node2.next=node3;

//        MyNode<Integer> node1_1 = new MyNode<>(0);
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


//        LogUtils.log(importKey.addTwoNumbers(node1,node1_1));

//        TreeNode root1 = new TreeNode(1);
//        root1.left = new TreeNode(2);
//        root1.right = new TreeNode(3);
//        root1.left.left = new TreeNode(4);
//        root1.left.right = new TreeNode(5);
//        root1.right.left = new TreeNode(6);
//        root1.right.right = new TreeNode(7);

//        System.out.println(importKey.printZTree(root1));
//        importKey.dfs(root1);
//        importKey.bfs(root1);
    }
}

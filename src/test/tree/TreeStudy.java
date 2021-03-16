package test.tree;

import test.LogUtils;
import test.node.TreeNode;

import java.util.List;

/**
 * 学习下树
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-07-10 17:26
 **/
public class TreeStudy {

    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(10);
//        TreeNode treeNode2 = new TreeNode(9);
//        TreeNode treeNode3 = new TreeNode(20);
//        TreeNode treeNode4 = new TreeNode(15);
//        TreeNode treeNode5 = new TreeNode(35);
//        treeNode.left = treeNode2;
//        treeNode.right = treeNode3;
//        treeNode3.left = (treeNode4);
//        treeNode3.right = (treeNode5);

//        midRecursive(treeNode);

//        System.out.println("max = " + getHeight(treeNode));

//        int[] src = {2, 1, 3, 4, 5};
//        TreeNode result = buildTree(src);

//        midRecursive(result);
//        preRecursive(result);



        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        List<List<Integer>> sequence = new SequenceTraversal().getSequence(treeNode1);
        LogUtils.log(sequence);
    }


    /**
     * 先序 中-->左-->右
     *
     * @param TreeNode
     */
    public static void preRecursive(TreeNode TreeNode) {

        if (TreeNode != null) {
            System.out.println(TreeNode);
            if (TreeNode.left != null) {
                preRecursive(TreeNode.left);
            }
            if (TreeNode.right != null) {
                preRecursive(TreeNode.right);
            }
        }
    }

    /**
     * 中序 左-->中-->右
     *
     * @param TreeNode
     */
    public static void midRecursive(TreeNode TreeNode) {

        if (TreeNode != null) {
            if (TreeNode.left != null) {
                midRecursive(TreeNode.left);
            }
            System.out.println(TreeNode);

            if (TreeNode.right != null) {
                midRecursive(TreeNode.right);
            }
        }
    }


    /**
     * 右序 左-->右-->中
     *
     * @param TreeNode
     */
    public static void afterRecursive(TreeNode TreeNode) {

        if (TreeNode != null) {

            if (TreeNode.left != null) {
                afterRecursive(TreeNode.left);
            }
            if (TreeNode.right != null) {
                afterRecursive(TreeNode.right);
            }

            System.out.println(TreeNode);
        }
    }


    /**
     * 获取树的深度
     *
     * @param treeNode
     * @return
     */
    public static int getHeight(TreeNode treeNode) {

        if (treeNode == null) {
            System.out.print("   return 0  ");
            return 0;
        } else {

            //左边的子树深度
            int left = getHeight(treeNode.left);

            System.out.print("   left = " + left);

            //右边的子树深度
            int right = getHeight(treeNode.right);

            System.out.print("___right = " + right);

            int max = left;

            if (right > max) {
                max = right;
            }
            return max + 1;
        }
    }


    /**
     * 数组构建二叉树
     *
     * @param src 数组
     * @return
     */
    public static TreeNode buildTree(int[] src) {

        TreeNode node = new TreeNode(src[0]);
        for (int i = 1; i < src.length; i++) {
            buildNode(node, src[i]);
        }
        return node;
    }

    public static void buildNode(TreeNode node, int val) {
        while (node != null) {
            if (node.val > val) {
                //插入左子树
                if (node.left == null) {
                    node.left = new TreeNode(val);
                    return;
                }
                node = node.left;
            } else {
                if (node.right == null) {
                    node.right = new TreeNode(val);
                    return;
                }
                node = node.right;
            }
        }
    }
}

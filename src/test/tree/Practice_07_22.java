package test.tree;

/**
 * 镜像二叉树
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-07-22 11:14
 **/
public class Practice_07_22 {


    public static void main(String[] args) {

        int[] nums = {8,6,5,7,10,9,11};

        DualTreeNode dualTreeNode = TreeStudy.buildTree(nums);

        TreeStudy.preRecursive(dualTreeNode);

        mirrorTree(dualTreeNode);

        System.out.println("---");

        TreeStudy.preRecursive(dualTreeNode);

    }


    static void mirrorTree(DualTreeNode node) {

        if (node == null) {
            return;
        }
        DualTreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        if (node.left != null) {
            mirrorTree(node.left);
        }

        if (node.right != null) {
            mirrorTree(node.right);
        }

    }
}

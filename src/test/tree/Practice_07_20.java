package test.tree;

/**
 * https://leetcode-cn.com/problems/balanced-binary-tree
 * <p>
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-07-20 17:44
 **/
public class Practice_07_20 {

    public static void main(String[] args) {

        int[] tree1 = {3, 9, 20, 0, 0, 15, 7};

        final DualTreeNode dualTreeNode = TreeStudy.buildTree(tree1);

        new Solution().isBalanced(dualTreeNode);
    }

    static class Solution {

        public boolean isBalanced(DualTreeNode root) {
            return recur(root) != -1;
        }

        private int recur(DualTreeNode root) {
            if (root == null) {
                System.out.println("return 0 ");
                return 0;
            }
            int left = recur(root.left);
            System.out.println("root.left = " + root.left);
            if (left == -1) {
                System.out.println("left return -1 ");
                return -1;
            }

            int right = recur(root.right);
            System.out.println("root.right = " + root.right);
            if (right == -1) {
                System.out.println("right return -1 ");
                return -1;
            }

            final int i = Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
            System.out.println("Math.abs(left - right) < 2  = " + i);
            return i;
        }

    }
}

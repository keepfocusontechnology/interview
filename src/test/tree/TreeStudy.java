package test.tree;
/**
 * 学习下树
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-07-10 17:26
 **/
public class TreeStudy {

    public static void main(String[] args) {
//        DualTreeNode treeNode = new DualTreeNode(10);
//        DualTreeNode treeNode2 = new DualTreeNode(9);
//        DualTreeNode treeNode3 = new DualTreeNode(20);
//        DualTreeNode treeNode4 = new DualTreeNode(15);
//        DualTreeNode treeNode5 = new DualTreeNode(35);
//
//        treeNode.setLeft(treeNode2);
//        treeNode.setRight(treeNode3);
//        treeNode3.setLeft(treeNode4);
//        treeNode3.setRight(treeNode5);

//        midRecursive(treeNode);

//        System.out.println("max = " + getHeight(treeNode));

        int[] src = {2, 1, 3, 4, 5};
        DualTreeNode result = buildTree(src);

//        midRecursive(result);
        preRecursive(result);
    }


    /**
     * 先序 中-->左-->右
     *
     * @param dualTreeNode
     */
    public static void preRecursive(DualTreeNode dualTreeNode) {

        if (dualTreeNode != null) {
            System.out.println(dualTreeNode);
            if (dualTreeNode.getLeft() != null) {
                preRecursive(dualTreeNode.getLeft());
            }
            if (dualTreeNode.getRight() != null) {
                preRecursive(dualTreeNode.getRight());
            }
        }
    }

    /**
     * 中序 左-->中-->右
     *
     * @param dualTreeNode
     */
    public static void midRecursive(DualTreeNode dualTreeNode) {

        if (dualTreeNode != null) {
            if (dualTreeNode.getLeft() != null) {
                midRecursive(dualTreeNode.getLeft());
            }
            System.out.println(dualTreeNode);

            if (dualTreeNode.getRight() != null) {
                midRecursive(dualTreeNode.getRight());
            }
        }
    }


    /**
     * 右序 左-->右-->中
     *
     * @param dualTreeNode
     */
    public static void afterRecursive(DualTreeNode dualTreeNode) {

        if (dualTreeNode != null) {

            if (dualTreeNode.getLeft() != null) {
                afterRecursive(dualTreeNode.getLeft());
            }
            if (dualTreeNode.getRight() != null) {
                afterRecursive(dualTreeNode.getRight());
            }

            System.out.println(dualTreeNode);
        }
    }


    /**
     * 获取树的深度
     *
     * @param treeNode
     * @return
     */
    public static int getHeight(DualTreeNode treeNode) {

        if (treeNode == null) {
            System.out.print("   return 0  ");
            return 0;
        } else {

            //左边的子树深度
            int left = getHeight(treeNode.getLeft());

            System.out.print("   left = " + left);

            //右边的子树深度
            int right = getHeight(treeNode.getRight());

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
    public static DualTreeNode buildTree(int[] src) {

        DualTreeNode node = new DualTreeNode(src[0]);
        for (int i = 1; i < src.length; i++) {
            buildNode(node, src[i]);
        }
        return node;
    }

    public static void buildNode(DualTreeNode node, int val) {
        while (node != null) {
            if (node.val > val) {
                //插入左子树
                if (node.left == null) {
                    node.left = new DualTreeNode(val);
                    return;
                }
                node = node.left;
            } else {
                if (node.right == null) {
                    node.right = new DualTreeNode(val);
                    return;
                }
                node = node.right;
            }
        }
    }
}

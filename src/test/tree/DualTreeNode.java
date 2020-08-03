package test.tree;

/**
 * 二叉树啦
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-07-10 17:24
 **/
public class DualTreeNode {


    public int val;

    public DualTreeNode left;

    public DualTreeNode right;


    public DualTreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val + ']';
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public DualTreeNode getLeft() {
        return left;
    }

    public void setLeft(DualTreeNode left) {
        this.left = left;
    }

    public DualTreeNode getRight() {
        return right;
    }

    public void setRight(DualTreeNode right) {
        this.right = right;
    }
}

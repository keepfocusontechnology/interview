package test.tree;

import test.node.TreeNode;

import java.util.*;

/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9 20
 * / \
 * 15 7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */
public class SequenceTraversal {

    public List<List<Integer>> getSequence(TreeNode treeNode){
        if(treeNode == null){
            return Collections.emptyList();
        }

        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                temp.add(poll.val);
                if(poll.left != null){
                    queue.add(poll.left);
                }
                if(poll.right != null){
                    queue.add(poll.right);
                }
            }
            list.add(temp);
        }
        return list;
    }
}

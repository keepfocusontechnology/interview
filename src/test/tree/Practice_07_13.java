package test.tree;
import test.node.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 检查子树。你有两棵非常大的二叉树：T1，有几万个节点；T2，有几万个节点。设计一个算法，判断 T2 是否为 T1 的子树。
 * <p>
 * 如果 T1 有这么一个节点 n，其子树与 T2 一模一样，则 T2 为 T1 的子树，也就是说，从节点 n 处把树砍断，得到的树与 T2 完全相同。
 * <p>
 * 示例1:
 * <p>
 * 输入：t1 = [1, 2, 3], t2 = [2]
 * 输出：true
 * 示例2:
 * <p>
 * 输入：t1 = [1, null, 2, 4], t2 = [3, 2]
 * 输出：false
 * 提示：
 * <p>
 * 树的节点数目范围为[0, 20000]。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-subtree-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-07-13 14:38
 **/
public class Practice_07_13 {

    public static void main(String[] args) {
        int[] treeNode1 = {1, 2, 3};
        int[] treeNode2 = {2};


        final boolean b = new Solution().checkSubTree(TreeStudy.buildTree(treeNode1), TreeStudy.buildTree(treeNode2));

        System.out.println(b);
    }

    static class Solution {
        public boolean checkSubTree(TreeNode t1, TreeNode t2) {
            List<Integer> node = getNode(t1);
            List<Integer> node1 = getNode(t2);

            for (int s : node1) {
                if (node.contains(s)) {
                    return true;
                }
            }
            return false;
        }


        public List<Integer> getNode(TreeNode node) {

            List<Integer> list = new ArrayList<>();

            if (node == null) {
                return list;
            } else {
                list.add(node.val);
                if (node.left != null) {
                    getNode(node.left);
                }
                if (node.right != null) {
                    getNode(node.right);
                }
            }
            return list;
        }
    }
}

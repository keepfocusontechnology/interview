package test.link;

public class NodeExercises {


    /**
     * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     *
     * 进阶：你能尝试使用一趟扫描实现吗？
     *
     * 输入：head = [1,2,3,4,5], n = 2
     * 输出：[1,2,3,5]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static ListNode<Integer> delK(ListNode<Integer> node, int k){
        if(node == null){
            return null;
        }
        ListNode<Integer> temp  = node;
        int len = ListNode.getLength(node);
        ListNode<Integer> result  = node;
        if(len < k){
            return null;
        }else if(len == k){
            return result.next;
        }else {
            for(int i=0;i<len;i++){
                if(i == len-k-1){
                    result.next = result.next.next;
                    break;
                }
                result = result.next;
            }
        }
        return node;
    }



}

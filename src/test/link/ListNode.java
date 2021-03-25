package test.link;

/**
 * 链表节点
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-07-30 10:36
 **/
public class ListNode<T> {

    public T val;
    public ListNode<T> next;

    public ListNode(T val, ListNode<T> next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {
    }

    public ListNode(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public void add(T newval) {
        ListNode<T> newNode = new ListNode<>(newval);
        if(next == null)
            next = newNode;
        else {
            next.add(newval);
        }
    }


    public static int getLength(ListNode node){
        int len = 1;
        if(node ==null){
            return 0;
        }
        if(node.next==null){
            return 1;
        }
        do{
            len++;
            node = node.next;
        }while (node.next!=null);
        return len;
    }
}

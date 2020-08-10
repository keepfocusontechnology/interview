package test.link;

/**
 * 链表节点
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-07-30 10:36
 **/
public class MyNode<T> {

    public T val;
    public MyNode next;

    public MyNode(T val, MyNode next) {
        this.val = val;
        this.next = next;
    }

    public MyNode() {
    }

    public MyNode(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

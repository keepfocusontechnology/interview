package test.link;

/**
 * 链表节点
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-07-30 10:36
 **/
public class MyNode<T> {

    public T t;
    public MyNode next;

    public MyNode(T t, MyNode next) {
        this.t = t;
        this.next = next;
    }

    public MyNode() {
    }

    public MyNode(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "t=" + t +
                ", next=" + next +
                '}';
    }
}

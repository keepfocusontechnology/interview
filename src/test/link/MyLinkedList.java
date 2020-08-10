package test.link;

import test.LogUtils;

/**
 * 链表
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-07-30 10:39
 **/
public class MyLinkedList<T> {

    private MyNode<T> firstNode; //头节点不占容量
    private MyNode<T> lastNode;

    private int size;


    public int size() {
        return size;
    }

    public MyLinkedList() {
        firstNode = new MyNode<>();
        lastNode = firstNode;
        size = 0;
    }

    /**
     * 插尾
     *
     * @param t
     */
    public void add(T t) {
        if (null == t) {
            return;
        }
        MyNode<T> node = new MyNode<>(t);
        lastNode.next = node;
        lastNode = node;
        size++;
    }


    /**
     * 插尾
     *
     * @param t
     */
    public void add(MyNode<T> t) {
        if (null == t) {
            return;
        }
        lastNode.next = t;
        lastNode = t;
        size++;
    }

    public T delete(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        if (index == 0) { //头结点不占容量
            final MyNode<T> next = firstNode.next;
            firstNode.next = next.next;
            size--;
            return next.val;
        }
        MyNode<T> cur = getNode(index);
        for (int i = 0; i < size; i++) {
            if (i == index) {
                MyNode<T> node = getNode(index - 1);
                node.next = cur.next;
                size--;
                break;
            }
        }
        return cur.val;
    }

    public void delete(MyNode<T> node) {
        if (node == null) {
            return;
        }

        for (int i = 0; i < size; i++) {
            if (getNode(i) == node) {
                if (i == 0) {
                    final MyNode<T> node1 = getNode(0);
                    firstNode.next = node1.next;
                    size--;
                    return;
                }
                MyNode<T> cur = getNode(i - 1);
                cur.next = node.next;
                size--;
                break;
            }
        }
    }


    public MyNode<T> getNode(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        MyNode<T> cur = firstNode.next;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    public void printSelf() {
        if (size == 0 || firstNode == null) {
            LogUtils.log("size == 0 || firstNode == null");
            return;
        }
        MyNode<T> node = firstNode.next;
//
//        for (int i = 0; i < size; i++) {
//            SysUtils.log(node.val);
//            node = node.next;
//        }

        while (node != null) {
            LogUtils.log(node.val);
            node = node.next;
        }
    }


    public boolean isCircle() {

        MyNode<T> node1 = firstNode.next;
        MyNode<T> node2 = node1.next;
        while (node2 != null) {
            if (node1 == node2) {
                return true;
            }
            node1 = node1.next;
            node2 = node2.next.next;

            if (node2 == null) {
                return false;
            }
        }
        return false;
    }
}

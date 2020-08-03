package test.link;

import test.LogUtils;

public class DoubleLinkList<E> {

    private int n; // node number
    private Node fistNode;
    private Node lastNode;


    public class Node {
        public E val;
        public Node pre;
        public Node last;
    }


    public DoubleLinkList() {


    }


    public void add(E e) {
        Node node = new Node();
        node.val = e;

        if (n == 0) {
            fistNode = lastNode = node;
        }

        if (lastNode != node) {
            lastNode.last = node;
            node.pre = lastNode;
            lastNode = node;
        }
        n++;
    }


    public E delete(int index) {

        if (index < 0 || index >= n)
            return null;

        Node temp = index(index);
        E e = temp.val;
        Node pre1 = temp.pre; //null
        Node last = temp.last; // 2
        if (pre1 != null)
            pre1.last = last;
        else
            fistNode = last;

        if (last != null) {
            last.pre = pre1;
        }else {
            lastNode =pre1;
        }



        n--;
        return e;
    }

    public void rmFirst() {
        Node sec = fistNode.last;
        sec.pre = null;
        fistNode = sec;
        n--;
    }


    public Node index(int index) {
        Node temp = fistNode;

        for (int i = 0; i < index; i++) {
            temp = temp.last;
        }
        return temp;
    }

    public Node getFirst() {
        return fistNode;
    }


    public void print() {
        Node node = fistNode;
        for (int i = 0; i < n; i++) {
            LogUtils.log(node.val + "");
            node = node.last;
        }
    }


}

package test.node;

import java.util.Stack;

public class SingleNode {

    private int val;
    private SingleNode next;


    public SingleNode(int val) {
        this.val = val;
    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleNode{" +
                "val=" + val +
                '}';
    }


    public static SingleNode reverse(SingleNode node) {
        if (null == node || node.next == null) {
            return node;
        }

        System.out.println(node);
        SingleNode newNode = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return newNode;
    }


    public static SingleNode reverseWithStack(SingleNode node) {

        Stack<SingleNode> stack = new Stack<>();

        SingleNode r = null;

        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        if (stack.size() > 1) {
            r = stack.pop();
        } else {
            return null;
        }
        SingleNode temp = null;

        while (!stack.isEmpty()) {
            temp = stack.pop();
            temp.getNext().setNext(temp);
            temp.setNext(null);
        }
        return r;
    }


    public static void printSelf(SingleNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
    }
}

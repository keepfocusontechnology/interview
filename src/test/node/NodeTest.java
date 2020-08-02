package test.node;

public class NodeTest {

    public static void main(String[] args) {
        SingleNode node1 = new SingleNode(1);
        SingleNode node2 = new SingleNode(2);
        SingleNode node3 = new SingleNode(3);
        SingleNode node4 = new SingleNode(4);
        SingleNode node5 = new SingleNode(5);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

//        SingleNode.printSelf(node1);

        final SingleNode reverse = SingleNode.reverseWithStack(node1);

        SingleNode.printSelf(reverse);

    }
}

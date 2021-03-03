package test.queue;

import test.LogUtils;

public class QueueTest {


    public static void main(String[] args) {

        CircleQueue queue = new CircleQueue(5);

        queue.push(0);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        LogUtils.log(queue.pop());
        LogUtils.log(queue.pop());
        LogUtils.log(queue.pop());


        queue.push(3);
        queue.push(4);

        queue.printSelf();
        LogUtils.log(queue.pop());
    }
}

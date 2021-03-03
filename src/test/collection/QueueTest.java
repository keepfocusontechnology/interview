package test.collection;

import test.LogUtils;

import java.util.ArrayList;
import java.util.List;

public class QueueTest {


    public static void main(String[] args) {

//        CircleQueue queue = new CircleQueue(5);
//
//        queue.push(0);
//        queue.push(1);
//        queue.push(2);
//        queue.push(3);
//        queue.push(4);
//
//        LogUtils.log(queue.pop());
//        LogUtils.log(queue.pop());
//        LogUtils.log(queue.pop());
//
//
//        queue.push(3);
//        queue.push(4);
//
//        queue.printSelf();
//        LogUtils.log(queue.pop());

         int[][] map = {                           //迷宫地图,1代表墙壁，0代表通路
                {1,1,1,1,1,1,1,1,1,1},
                {1,0,0,1,0,0,0,1,0,1},
                {1,0,0,1,0,0,0,1,0,1},
                {1,0,0,0,0,1,1,0,0,1},
                {1,0,1,1,1,0,0,0,0,1},
                {1,0,0,5,1,0,0,0,0,1},
                {1,0,1,6,0,0,1,0,0,1},
                {1,0,1,1,1,0,1,1,0,1},
                {1,1,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1}
        };

        LogUtils.log(map[6][3]);
    }
}

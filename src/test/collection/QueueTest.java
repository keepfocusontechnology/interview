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

//         int[][] map = {                           //迷宫地图,1代表墙壁，0代表通路
//                {1,1,1,1,1,1,1,1,1,1},
//                {1,0,0,1,0,0,0,1,0,1},
//                {1,0,0,1,0,0,0,1,0,1},
//                {1,0,0,0,0,1,1,0,0,1},
//                {1,0,1,1,1,0,0,0,0,1},
//                {1,0,0,5,1,0,0,0,0,1},
//                {1,0,1,6,0,0,1,0,0,1},
//                {1,0,1,1,1,0,1,1,0,1},
//                {1,1,0,0,0,0,0,0,0,1},
//                {1,1,1,1,1,1,1,1,1,1}
//        };
//
//        LogUtils.log(map[6][3]);

        calculateSize(1024);


    }

    //扩容，2的n次幂
    private static int calculateSize(int var0) {
        int var1 = 8;
        //当传入8时
//        var1 = 00000000 00000000 00000000 00001000
//        var0 = 00000000 00000000 00000000 00001000
        if (var0 >= var1) {
            var1 = var0 | var0 >>> 1;
            // 先右移一位，var0 = 00000000 00000000 00000000 00000100 ==> 4
            // 或 var1 = 00001100 ==> 12; 高位0忽略，低位
            LogUtils.logLn("第一步"+var1);
            var1 |= var1 >>> 2;
            // 先右移2位，var1 = 00000000 00000000 00000000 00000011 ==> 3
            // 或 var1 = 0000 1100 | 0000 0011 = 0000 1111 = 1+2+4+8(15);
            LogUtils.logLn("第二步"+var1);
            var1 |= var1 >>> 4;
            // 先右移4位，var1 = 00000000 00000000 00000000 00000000 ==> 0
            // 或 var1 = 0000 1111 | 0000 0000 = 0000 1111 = 1+2+4+8(15);
            LogUtils.logLn("第三步"+var1);
            var1 |= var1 >>> 8;
            LogUtils.logLn("第四步"+var1);
            var1 |= var1 >>> 16;
            LogUtils.logLn("第五步"+var1);
            //一直到第五步，都是15
            ++var1;
            // 这边加1 0001 0000 ==> 16
            LogUtils.logLn("++"+var1);
            if (var1 < 0) {
                var1 >>>= 1;
            }
        }
        LogUtils.logLn("result="+var1);
        return var1;
    }
}

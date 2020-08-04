package test.key;

import test.LogUtils;

/**
 * 测试归类
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-08-04 17:06
 **/
public class ImportTest {

    public static void main(String[] args) {
        final ImportKey importKey = new ImportKey();


//        LogUtils.log("快速排序前:");
//
//
//        int[] nums = {3, 8, 1, 9, 4, 5, 7, 10, 6};
//        LogUtils.printArray(nums);
//
//        LogUtils.log("快速排序后:");
//
//        LogUtils.printArray(importKey.quickSort(nums, 0, nums.length - 1));
//

        LogUtils.log("杨辉三角打印:");

        importKey.printTriangle(10);

    }
}

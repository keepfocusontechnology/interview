package test.sort;

import test.LogUtils;

public class SortTest {

    public static void main(String[] args) {

//
//        int[] nums = {3, 8, 1, 9, 4, 5, 7, 10, 6};
//        LogUtils.printArray(nums);
//        SortSingle.getSingle().quickSort(nums, 0, nums.length - 1);
//
//        LogUtils.printArray(nums);
//
//
//        int i = 11;
//        int j = 12;


//        int re = (i & j) ;
//        System.out.println(re);
//        int y = i ^ j;
//
//        int n = re ^ y;

//        System.out.println(add2(i, j));


      int[] srcArr =  randomRepeatCommon(0,100,10);
      LogUtils.printArray(srcArr);
      int[] result = null;
      IArraySort sort = new CountArraySort();
        try {
            result = sort.sort(srcArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LogUtils.printArray(result);
    }

    public static int add(int a, int b) {
        while (b != 0) { // 当进位为 0 时跳出

            int c = (a & b) << 1;  // c = 进位
            System.out.println("c = " + c);
            a ^= b; // a = 非进位和
            b = c; // b = 进位

        }
        return a;
    }


    public static int add2(int i, int j) {

        while (j != 0) {
            int temp = (i & j) << 1;
            System.out.println("<< temp = " + temp);
            int temp2 = i ^ j;
            System.out.println("^^ temp2 = " + temp2);
            i = temp2;
            j = temp;
        }
        return i;
    }

    /**
     * 随机指定范围内N个不重复的数
     * 最简单最基本的方法
     *
     * @param min 指定范围最小值
     * @param max 指定范围最大值
     * @param n   随机数个数
     */
    public static int[] randomCommon(int min, int max, int n) {
        if (n > (max - min + 1) || max < min) {
            return null;
        }
        int[] result = new int[n];
        int count = 0;
        while (count < n) {
            int num = (int) (Math.random() * (max - min)) + min;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (num == result[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = num;
                count++;
            }
        }
        return result;
    }


    /**
     * 随机指定范围内可以重复的数
     * 最简单最基本的方法
     *
     * @param min 指定范围最小值
     * @param max 指定范围最大值
     * @param n   随机数个数
     */
    public static int[] randomRepeatCommon(int min, int max, int n) {
        int[] result = new int[n];
        int count = 0;
        while (count < n) {
            int num = (int) (Math.random() * ((max+1) - min)) + min;
            result[count] = num;
            count++;
        }
        return result;
    }
}

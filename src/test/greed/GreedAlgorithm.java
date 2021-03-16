package test.greed;

import test.LogUtils;

/**
 * 贪心算法，拼接一串整数中最大的数字
 */
public class GreedAlgorithm {

    public static void main(String[] args) {

        int[] nums = { 5,6,7,8,88,123};
        LogUtils.printArray(maxJoin(nums));
    }


    /**
     * 拼接出最大的整数
     *
     * @param nums
     * @return
     */
    public static int[] maxJoin(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(!compare(nums[i],nums[j])){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }


    /**
     * 如果 a > b 则返回true
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean compare(int a, int b) {
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        int ab = Integer.parseInt(aStr + bStr);
        int ba = Integer.parseInt(bStr + aStr);

        return ab > ba;
    }

}

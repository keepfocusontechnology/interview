package test.dynamic_program;

/**
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * <p>
 * 要求时间复杂度为O(n)。
 * <p>
 *  
 * <p>
 * 示例1:
 * <p>
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *  
 *
 * @author zhangying54@meituan.com
 * @version v1.0
 * @create 2020-08-04 15:12
 **/
public class MaximumSum {

    public int maxSubArray(int[] nums) {


        int max = Integer.MIN_VALUE, sum = 0;

        for (int num : nums) {
            sum = Math.max(num, sum + num);
            max = Math.max(sum, max);
        }
        return max;
    }
}

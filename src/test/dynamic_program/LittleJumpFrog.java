package test.dynamic_program;


/**
 * 问题描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class LittleJumpFrog {


    /**
     * 返回多少次跳法
     *
     * @param n n级台阶
     * @return
     */
    public int solution(int n) {

        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[n] = dp[n - 2] + dp[n - 1];

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }
}

package test.dynamic_program;


import test.LogUtils;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * <p>
 * 问总共有多少条不同的路径？
 */
public class RobotStepNumber {

    public int solution(int m, int n) {

        int[][] s = new int[m][n];

        s[0][0] = 1;

        for (int i = 1; i <= m - 1; i++) {
            s[i][0] = 1;
        }

        for (int i = 1; i <= n - 1; i++) {
            s[0][i] = 1;
        }

        for (int i = 1; i <= m - 1; i++) {
            for (int j = 1; j <= n - 1; j++) {
                s[i][j] = s[i - 1][j] + s[i][j - 1];
            }
        }

        LogUtils.printArray(s);
        return s[m-1][n-1];
    }

}

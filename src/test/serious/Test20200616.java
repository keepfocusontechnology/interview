package test.serious;


public class Test20200616 {


    public static void main(String[] args) {
//        int[] nums = {3, 1, 2, 10, 1};
//        final Solution solution = new Solution();
//        final int[] ints = solution.runningSum(nums);
//        printArray(ints);

        String str1= "yyx";
        String str2= "xyy";
        System.out.println(new Solution2().minimumSwap(str1,str2));

    }

    public static void printArray(int[] chars) {
        StringBuilder sb = new StringBuilder();
        for (int n = 0; n < chars.length; n++) {
            if (n == 0) {
                sb.append("{");
            }
            sb.append(chars[n]);
            if (n == chars.length - 1) {
                sb.append("}");
                continue;
            }
            sb.append(",");

        }
        System.out.println(sb.toString());
    }

    /**
     * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     * <p> easy
     * 请返回 nums 的动态和。
     */
    public static class Solution {

        public Solution() {
        }

        public int[] runningSum(int[] nums) {


            int[] result = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                int[] ints = subNums(i, nums);
                result[i] = getSun(ints);
            }
            return result;
        }


        public int getSun(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            return sum;
        }


        public int[] subNums(int index, int[] nums) {
            int[] result = new int[index + 1];
            System.arraycopy(nums, 0, result, 0, result.length);
            return result;
        }
    }

    /**
     * 有两个长度相同的字符串 s1 和 s2，且它们其中 只含有 字符 "x" 和 "y"，你需要通过「交换字符」的方式使这两个字符串相同。
     *
     * 每次「交换字符」的时候，你都可以在两个字符串中各选一个字符进行交换。
     *
     * 交换只能发生在两个不同的字符串之间，绝对不能发生在同一个字符串内部。也就是说，我们可以交换 s1[i] 和 s2[j]，但不能交换 s1[i] 和 s1[j]。
     *
     * 最后，请你返回使 s1 和 s2 相同的最小交换次数，如果没有方法能够使得这两个字符串相同，则返回 -1 。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：s1 = "xx", s2 = "yy"
     * 输出：1
     * 解释：
     * 交换 s1[0] 和 s2[1]，得到 s1 = "yx"，s2 = "yx"。
     * 示例 2：
     *
     * 输入：s1 = "xy", s2 = "yx"
     * 输出：2
     * 解释：
     * 交换 s1[0] 和 s2[0]，得到 s1 = "yy"，s2 = "xx" 。
     * 交换 s1[0] 和 s2[1]，得到 s1 = "xy"，s2 = "xy" 。
     * 注意，你不能交换 s1[0] 和 s1[1] 使得 s1 变成 "yx"，因为我们只能交换属于两个不同字符串的字符。
     * 示例 3：
     *
     * 输入：s1 = "xx", s2 = "xy"
     * 输出：-1
     * 示例 4：
     *
     * 输入：s1 = "xxyyxyxyxx", s2 = "xyyxyxxxyx"
     * 输出：4
     *  
     *
     * 提示：
     *
     * 1 <= s1.length, s2.length <= 1000
     * s1, s2 只包含 'x' 或 'y'。
     */
    public static class Solution2{
        public Solution2() {
        }

        public int minimumSwap(String s1, String s2) {
            int len = s1.length(), xy = 0, yx = 0;
            char[] cs1 = s1.toCharArray();
            char[] cs2 = s2.toCharArray();
            for(int i = 0; i < len; i ++) {
                if(cs1[i] == cs2[i]) {
                    continue;
                }
                else if(cs1[i] == 'x') {
                    xy ++;
                }
                else {
                    yx ++;
                }
            }
            return ((xy + yx) & 1) == 1 ? -1 : (xy + 1) / 2 + (yx + 1) / 2;
        }
    }

}
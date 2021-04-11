package test.key;


import test.LogUtils;

/**
 * 位运算相关
 */
public class BitOperation {


    /**
     * 将 long 型数字的二进制反转
     *
     * 例如1 变成 2的^31次方
     *
     * @param srcNum
     * @return
     */
    public int operation(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) + (n & 1);
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int operation = new BitOperation().operation(4);
        LogUtils.log(operation);
    }

}

package test.sort;

import test.LogUtils;

public class SortTest {

    public static void main(String[] args) {


        int[] nums = {3, 8, 1, 9, 4, 5, 7, 10, 6};
        LogUtils.printArray(nums);
        SortSingle.getSingle().quickSort(nums,0,nums.length-1);

        LogUtils.printArray(nums);


        int i = 11;
        int j = 12;

//        int re = (i & j) ;
//        System.out.println(re);
//        int y = i ^ j;
//
//        int n = re ^ y;

//        System.out.println(add2(i, j));
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

        while (j!=0){
            int temp = (i & j) << 1;
            System.out.println("<< temp = " + temp);
            int temp2 = i ^ j;
            System.out.println("^^ temp2 = " + temp2);
            i = temp2;
            j = temp;
        }
        return i;
    }


}

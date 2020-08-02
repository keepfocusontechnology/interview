package test.sort;

public class SortSingle {

    private static volatile SortSingle INSTANCE;

    private SortSingle() {
    }


    public static SortSingle getSingle() {
        if (INSTANCE == null) {
            synchronized (SortSingle.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SortSingle();
                }
            }
        }
        return INSTANCE;
    }


    /**
     * 冒泡排序
     */
    public int[] bubbleSort(int[] arrs) {

        if (null == arrs || arrs.length < 2) {
            return null;
        }

        for (int i = 0; i < arrs.length; i++) {
            for (int j = i + 1; j < arrs.length - 1; j++) {
                if (arrs[i] > arrs[j]) {
                    arrs[i] = arrs[i] + arrs[j] - (arrs[j] = arrs[i]);
                }
            }
        }
        return arrs;
    }


    /**
     * 快速排序
     *
     * @param arrs
     * @return
     */
    public int[] quickSort(int[] arrs, int left, int right) {
        if (null == arrs || arrs.length < 2) {
            return null;
        }

        if (left == right) {
            return arrs;
        }

        int mid = getMid(arrs, left, right);
        quickSort(arrs, left, mid);
        quickSort(arrs, mid + 1, right);
        return arrs;
    }

    private int getMid(int[] arrs, int left, int right) {

        int temp = arrs[left];
        while (left < right && arrs[left] < arrs[right]) {

            while (left < right && arrs[right] >= temp) {
                right--;
            }

            if (left < right) {
                arrs[left] = arrs[right];
                left++;
            }

            while (left < right && arrs[left] < temp) {
                left++;
            }

            if (left < right) {
                arrs[right] = arrs[left];
                right--;
            }
        }
        arrs[left] = temp;
        return left;
    }
}



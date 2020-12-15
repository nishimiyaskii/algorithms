package 剑指Offer.bit;

/**
 * 2个数只出现一次，其他都出现2次
 */
public class single_nums_I {

    public int[] singleNumbers(int[] arr) {
        int s = 0;
        for (int a : arr) s ^= a;
        int k = 0;
        while (((s >>> k) & 1) == 0) k ++;
        int left = 0;
        for (int a : arr) {
            if (((a >>> k) & 1) == 0) left ^= a;
        }
        return new int[]{left, s ^ left};
    }

}

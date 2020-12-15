package 剑指Offer.dp;

/**
 * 数组的最大连续子数组的和
 */
public class max_of_continuous_arr {

    public int maxSubArray(int[] arr) {
        int res = Integer.MIN_VALUE, last = Integer.MIN_VALUE;
        for (int a : arr) {
            last = Math.max(0, last) + a;
            res = Math.max(last, res);
        }
        return res;
    }

}

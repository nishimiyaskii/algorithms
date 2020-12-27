package LeetCode.HOT200;

/**
 * 最大乘积子数组
 * @author aimerrhythms
 */
public class HOT094_Maximum_Product_Subarray {

    /**
     * 由于dp过程中，dp[i]至于dp[i - 1]有关，所以可以用滚动数组（二维dp）/2个变量优化
     */
    public int maxProduct(int[] nums) {
        int n = nums.length;
        // 由于存在负负得正的情况，所以维护一个最小值
        // max[i]、min[i]表示以nums[i]结尾的连续子数组的最大乘积
        int[] max = new int[2], min = new int[2];
        max[1] = min[1] = nums[0];
        // 是对所有的max[]取一个最大值，不是max[n]
        int res = nums[0];
        for (int i = 2; i <= n; i ++) {
            max[i & 1] = Math.max(nums[i - 1], Math.max(max[i - 1 & 1] * nums[i - 1], min[i - 1 & 1] * nums[i - 1]));
            res = Math.max(max[i & 1], res);
            min[i & 1] = Math.min(nums[i - 1], Math.min(max[i - 1 & 1] * nums[i - 1], min[i - 1 & 1] * nums[i - 1]));
        }
        return res;
    }

    class Solution {
        public int maxProduct(int[] nums) {
            int n = nums.length;
            if (n < 1) return 0;
            int f = nums[0], g = nums[0], res = nums[0];
            for (int i = 1; i < n; i ++) {
                int a = nums[i], fa = f * a, ga = g * a;
                f = Math.max(a, Math.max(fa, ga));
                g = Math.min(a, Math.min(fa, ga));
                res = Math.max(res, f);
            }
            return res;
        }
    }

}

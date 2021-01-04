package LeetCode.HOT200;

/**
 * 最长上升子序列
 *
 * @Author aimerrhythms
 * @Date 2021/1/3 16:36
 */
public class HOT137_Longest_Increasing_Subsequence {

    public int lengthOfLIS(int[] nums) {
        int n = nums.length, res = 0;
        if (n < 2) return n;
        int[] dp = new int[n + 1]; // dp[i]表示以i结尾的最长上升子序列的长度
        for (int i = 1; i <= n; i ++) {
            dp[i] = 1;
            for (int j = 1; j < i; j ++) {
                if (nums[j - 1] < nums[i - 1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }

}

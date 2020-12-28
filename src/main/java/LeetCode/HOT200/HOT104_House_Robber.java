package LeetCode.HOT200;

/**
 * 打家劫舍
 * @author aimerrhythms
 */
public class HOT104_House_Robber {

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        dp[2] = Math.max(nums[0], nums[1]);
        for (int i = 3; i <= n; i ++) {
            // 不抢这家
            dp[i] = dp[i - 1];
            // 抢这家
            dp[i] = Math.max(dp[i], dp[i - 2] + nums[i - 1]);
        }
        return dp[n];
    }

}

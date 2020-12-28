package LeetCode.HOT200;

/**
 * 打家劫舍II：环球村
 *
 * 第一家和最后一家只能抢一家，所以有两种情况
 *
 */
public class HOT105_House_Robber_II {

    public static void main(String[] args) {
        System.out.println(new HOT105_House_Robber_II().rob(new int[]{1, 2, 3, 1}));
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));
    }

    int rob(int[] nums, int l, int r) {
        if (l == r) return nums[l];
        int[] dp = new int[r - l + 2];
        dp[1] = nums[l];
        dp[2] = Math.max(nums[l], nums[l + 1]);
        for (int i = 3; i <= r - l + 1; i ++) {
            // 不抢
            dp[i] = dp[i - 1];
            // 抢
            dp[i] = Math.max(dp[i], dp[i - 2] + nums[i + l - 1]);
        }
        return dp[r - l + 1];
    }

}

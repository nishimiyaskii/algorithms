package LeetCode.HOT200;

/**
 * 分割等和子集
 *
 * 01背包
 *
 * @Author cx
 * @Data 2021/1/13 15:58
 */
public class HOT153_Partition_Equal_Subset_Sum {

    public boolean canPartition (int[] nums) {
        int n = nums.length, sum = 0;
        for (int x : nums) sum += x;
        if ((sum & 1) == 1) return false;
        sum /= 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i ++) {
            for (int j = sum; j >= nums[i - 1]; j --) dp[j] |= dp[j - nums[i - 1]];
        }
        return dp[sum];
    }

}

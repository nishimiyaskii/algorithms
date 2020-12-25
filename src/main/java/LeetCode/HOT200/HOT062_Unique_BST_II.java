package LeetCode.HOT200;

/**
 * 不同的BST：求方案数
 */
public class HOT062_Unique_BST_II {

    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i ++) {
            for (int k = 1; k <= i; k ++) {
                dp[i] += dp[k - 1] * dp[i - k];
            }
        }
        return dp[n];
    }

}

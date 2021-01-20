package LeetCode.All._0081_0100;

/**
 * 不同的二叉搜索树
 * @Author cx
 * @Data 2021/1/20 15:31
 */
public class LC96_Different_BST_II {

    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1; dp[1] = 1;
        for (int i = 2; i <= n; i ++) {
            for (int j = 1; j <= i; j ++) {
                // 注意是dp[i]=..,不是dp[j]
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

}

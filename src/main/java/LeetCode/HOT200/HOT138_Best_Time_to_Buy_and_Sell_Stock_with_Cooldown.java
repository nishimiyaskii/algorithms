package LeetCode.HOT200;

import java.util.Arrays;

/**
 * 买股票：包含冷冻期
 *
 * 状态机DP
 *
 * @Author aimerrhythms
 * @Date 2021/1/3 17:17
 */
public class HOT138_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n < 1) return 0;
        final int INF = (int) Math.pow(10, 8);
        int[][] dp = new int[n][3];
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < 3; j ++) {
                dp[i][j] = -INF;
            }
        }
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i ++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = dp[i - 1][1] + prices[i];
        }
        return Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
    }

}

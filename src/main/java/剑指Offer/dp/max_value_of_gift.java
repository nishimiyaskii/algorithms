package 剑指Offer.dp;

import java.util.Arrays;

/**
 * 礼物的最大价值
 */
public class max_value_of_gift {

    public int maxValue(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n + 1][m + 1];
        dp[1][1] = grid[0][0];
        for (int y = 2; y <= m; y ++) dp[1][y] = dp[1][y - 1] + grid[0][y - 1];
        for (int x = 2; x <= n; x ++) dp[x][1] = dp[x - 1][1] + grid[x -1][0];
        for (int x = 2; x <= n; x ++) {
            for (int y = 2; y <= m; y ++) {
                dp[x][y] = Math.max(dp[x - 1][y], dp[x][y - 1]) + grid[x - 1][y - 1];
            }
        }
        return dp[n][m];
    }

}

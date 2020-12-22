package LeetCode.HOT200;

/**
 * 不同路径
 */
public class HOT042_Unique_Path {

    public int uniquePaths(int m, int n) {
        if (m < 1 || n < 1) return 0;
        int[][] dp = new int[m][n];
        for (int x = 0, y = 0; x < m || y < n; x ++, y ++) {
            if (x < m) {
                dp[x][0] = 1;
            }
            if (y < n) {
                dp[0][y] = 1;
            }
        }
        for (int x = 1; x < m; x ++) {
            for (int y = 1; y < n; y ++) {
                dp[x][y] = dp[x - 1][y] + dp[x][y - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

}

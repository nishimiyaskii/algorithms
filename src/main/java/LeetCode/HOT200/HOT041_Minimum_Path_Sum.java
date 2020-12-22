package LeetCode.HOT200;

public class HOT041_Minimum_Path_Sum {

    public int minPathSum(int[][] grid) {
        if (grid.length < 1 || grid[0].length < 1) return 0;
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int x = 0, y = 0, xs = 0, ys = 0; x < m || y < n; x ++, y ++) {
            if (x < m) {
                xs += grid[x][0];
                dp[x][0] = xs;
            }
            if (y < n) {
                ys += grid[0][y];
                dp[0][y] = ys;
            }
        }
        for (int x = 1; x < m; x ++) {
            for (int y = 1; y < n; y ++) {
                dp[x][y] = Math.min(dp[x - 1][y], dp[x][y - 1]) + grid[x][y];
            }
        }
        return dp[m - 1][n - 1];
    }

}

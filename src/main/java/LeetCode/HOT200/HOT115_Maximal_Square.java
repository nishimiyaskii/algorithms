package LeetCode.HOT200;

/**
 * 最大正方形（类比最大矩形LC85）
 *
 *      f[i,j]表示以(i,j)为右下角的最大正方形的边长
 *      可以证明f[i,j] <= min(f[i, j] + 1, f[i, j-1] + 1, f[i-1, j-1] + 1)
 *          并且f[i,j] >= min(f[i, j] + 1, f[i, j-1] + 1, f[i-1, j-1] + 1)
 *      所以：f[i,j] = min(f[i, j] + 1, f[i, j-1] + 1, f[i-1, j-1] + 1)
 *
 * @Author aimerrhythms
 * @Date 2020/12/31 8:12
 */
public class HOT115_Maximal_Square {

    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[n + 1][m + 1];
        int res = 0;
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= m; j ++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res * res;
    }

}

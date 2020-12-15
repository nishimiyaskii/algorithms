package 剑指Offer.dp;

/**
 * n个骰子的点数
 */
public class n_dices_probability {

    /**
     * 递归的做法会超时 n = 10时lc超时。因为递归是枚举每一种情况
     */
    public double[] dicesProbability(int n) {
        /*
            // dfs
            List<Integer> points = new ArrayList<>();
            for (int i = n; i <= 6 * n; i ++) points.add(dfs(n, i));
            int s = 0;
            for (int t : points) s += t;
            double[] res = new double[points.size()];
            for (int i = 0; i < res.length; i ++) {
                res[i] = (double) points.get(i) / s;
            }
            return res;
        */

        // dp
        int[][] dp = new int[n + 1][6 * n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i ++) {
            for (int j = i; j <= 6 * n; j ++) {
                for (int k = 1; k <= 6; k ++) {
                    if (j >= k) {
                        dp[i][j] += dp[i - 1][j - k];
                    }
                }
            }
        }
        int s = 0;
        for (int i = n; i <= 6 * n; i ++) s += dp[n][i];
        double[] res = new double[5 * n + 1];
        int index = 0;
        for (int i = n; i <= 6 * n; i ++) {
            res[index ++] = (double) dp[n][i] / s;
        }
        return res;
    }

    /**
     * dfs的标识n个骰子出现和=s的情况数
     */
    private int dfs(int n, int s) {
        if (s < 0) return 0;
        if (n == 0) return s == 0 ? 1 : 0;
        int res = 0;
        for (int i = 1; i <= 6; i ++) {
            res += dfs(n - 1, s - i);
        }
        return res;
    }

}

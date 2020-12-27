package LeetCode.HOT200;

/**
 * 买卖股票IV：最多交易k次
 *
 * 状态机模型DP
 *      0表示手里没有股票
 *      1表示手里有股票
 *
 */
public class HOT079_Best_Time_to_Buy_and_Sell_Stock_IV {

    public static void main(String[] args) {
        System.out.println(new HOT079_Best_Time_to_Buy_and_Sell_Stock_IV().maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
    }

    public int maxProfit(int k, int[] prices) {
        int res = 0, n = prices.length;
        if (k >= n / 2) {
            for (int i = 1; i < n; i ++) res += (prices[i] > prices[i - 1] ? prices[i] - prices[i - 1] : 0);
        } else {
            // 状态一：f[i][j]表示已经走了i条边且转了j圈的所有方案的最大值
            // 状态二：g[i][j]表示已经走了i条边且正在转第j圈的所有方案的最大值
            int[][] f = new int[2][k + 1], g = new int[2][k + 1];

            // 拥有股票的所有状态下，利润初始化为无穷小
            for (int i = 0; i <= k; i ++) g[0][i] = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i ++) {
                for (int j = 0; j <= k; j ++) {
                    f[i & 1][j] = Math.max(f[i - 1 & 1][j], g[i - 1 & 1][j] +  prices[i - 1]);
                    g[i & 1][j] = g[i - 1 & 1][j];
                    if (j > 0) g[i & 1][j] = Math.max(g[i & 1][j], f[i - 1 & 1][j - 1] - prices[i - 1]);
                    res = Math.max(res, f[i & 1][j]);
                }
            }
        }
        return res;
    }

}

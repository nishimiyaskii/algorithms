package LeetCode.HOT200;

/**
 * 买卖股票III：最多两次交易，不能同时参与多笔交易
 *
 * “交易两次”的规范化：可以枚举 两次交易的分界点
 *      前后缀分解：
 *          枚举第二次开始交易的那天i。
 *          则res = max(前i-1天) + max(i~n天)
 *
 */
public class HOT078_Best_Time_to_Buy_and_Sell_Stock_III {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] f = new int[n + 1];
        for (int i = 1, min = Integer.MAX_VALUE; i <= n; i ++) {
            f[i] = Math.max(f[i - 1], prices[i - 1] - min);
            min = Math.min(min, prices[i - 1]);
        }
        int res = 0;
        for (int i = n, max = 0; i > 0; i --) {
            res = Math.max(res, f[i - 1] + (max - prices[i - 1]));
            max = Math.max(max, prices[i - 1]);
        }
        return res;
    }

}

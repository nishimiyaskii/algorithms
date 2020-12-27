package LeetCode.HOT200;

/**
 * 买卖股票II：可以多次交易，但是买必须在卖操作之后
 *
 * 核心：交易的分解
 *
 */
public class HOT077_Best_Time_to_Buy_and_Sell_Stock_II {

    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i ++) {
            res += prices[i] > prices[i - 1] ? prices[i] - prices[i - 1] : 0;
        }
        return res;
    }

}

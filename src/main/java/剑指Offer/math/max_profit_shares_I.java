package 剑指Offer.math;

/**
 * 股票的最大利润I
 */
public class max_profit_shares_I {

    public int maxProfit(int[] prices) {
        int minPrice = 0, maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(price, minPrice);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

}

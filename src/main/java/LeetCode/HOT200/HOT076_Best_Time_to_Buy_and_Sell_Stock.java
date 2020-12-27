package LeetCode.HOT200;

/**
 * 购买股票I：买卖1次，没有手续费
 */
public class HOT076_Best_Time_to_Buy_and_Sell_Stock {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, res = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            res = Math.max(res, price - min);
        }
        return res;
    }

}

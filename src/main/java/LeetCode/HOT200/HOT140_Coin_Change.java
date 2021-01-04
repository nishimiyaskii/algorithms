package LeetCode.HOT200;

import java.util.Arrays;

/**
 * 零钱兑换：完全背包
 * @Author aimerrhythms
 * @Date 2021/1/4 10:40
 */
public class HOT140_Coin_Change {

    public int coinChange(int[] v, int V) {
            // 背包总体积V，每个物品的体积v，重量均为1
            // 求背包满了，但是重量最小
            int N = v.length;
            int[] dp = new int[V + 1];
            final int INF = Integer.MAX_VALUE - 10;
            Arrays.fill(dp, INF);
            dp[0] = 0;
            for (int i = 1; i <= N; i ++) {
                for (int j = v[i - 1]; j <= V; j ++) {
                    dp[j] = Math.min(dp[j], dp[j - v[i - 1]] + 1);
                }
            }
            return dp[V] == INF ? -1 : dp[V];
    }

}

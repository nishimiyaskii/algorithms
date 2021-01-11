package LeetCode.HOT200;

import java.util.Arrays;

/**
 * 完全平方数：完全背包
 * @Author aimerrhythms
 * @Date 2021/1/3 10:54
 */
public class HOT132_Perfect_Squares {

    public static void main(String[] args){
        new HOT132_Perfect_Squares().numSquares(12);
    }

    public int numSquares(int n) {
        final int N = (int) Math.sqrt(n);
        int[] v = new int[N];
        for (int i = 1; i <= N; i ++) {
            v[i - 1] = i * i;
        }
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= N; i ++) {
            for (int j = v[i - 1]; j <= n; j ++) {
                dp[j] = Math.min(dp[j], dp[j - v[i - 1]] + 1);
            }
        }
        return dp[n];
    }

}

package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角II：返回第n行，要求O(k)的空间
 * 滚动数组，即把所有的第一维都加上&1（最机械的修改）
 */
public class HOT074_Pascals_Triangle {

    public List<Integer> getRow(int n) {
        int[][] dp = new int[2][n + 1];
        for (int i = 0; i <= n; i ++) {
            dp[i & 1][0] = dp[i & 1][i] = 1;
            for (int j = 1; j < i; j ++) {
                dp[i & 1][j] = dp[i - 1 & 1][j - 1] + dp[i - 1 & 1][j];
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int t : dp[n & 1]) {
            res.add(t);
        }
        return res;
    }
}

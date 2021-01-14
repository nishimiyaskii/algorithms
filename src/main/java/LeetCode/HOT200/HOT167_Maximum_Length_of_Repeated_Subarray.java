package LeetCode.HOT200;

/**
 * 最长重复子数组
 * @Author cx
 * @Data 2021/1/14 17:30
 */
public class HOT167_Maximum_Length_of_Repeated_Subarray {

    public int findLength(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[][] dp = new int[n + 1][m + 1];
        int res = 0;
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= m; j ++) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }

}

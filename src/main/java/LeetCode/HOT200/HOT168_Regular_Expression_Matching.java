package LeetCode.HOT200;

/**
 * 正则表达式匹配
 * @Author cx
 * @Data 2021/1/15 14:33
 */
public class HOT168_Regular_Expression_Matching {

    public boolean isMatch (String s, String p) {
        int n = s.length(), m = p.length();
        s = " " + s;
        p = " " + p;
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for (int i = 0; i <= n; i ++) {
            for (int j = 1; j <= m; j ++) {
                if (j + 1 <= m && p.charAt(j + 1) == '*') continue;
                if (p.charAt(j) != '*' && i > 0) {
                    dp[i][j] = dp[i - 1][j - 1] && (Character.compare(s.charAt(i), p.charAt(j)) == 1 || p.charAt(j) == '.');
                }
                if (p.charAt(j) == '*') {
                    dp[i][j] = dp[i][j - 2] || i > 0 && dp[i - 1][j] && (Character.compare(s.charAt(i), p.charAt(j - 1)) == 1 || p.charAt(j - 1) == '.');
                }
            }
        }
        return dp[n][m];
    }

}

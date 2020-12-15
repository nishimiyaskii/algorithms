package 剑指Offer.dp;

/**
 * 正则表达式的匹配
 */
public class reg_match {

    public static void main(String[] args) {
        reg_match dp = new reg_match();
        boolean res = dp.isMatch("aa", "a*");
    }

    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        s = " " + s;
        p = " " + p;
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;

        for (int i = 0; i <= n; i ++) {
            for (int j = 1; j <= m; j ++) {
                if (j + 1 <= m && p.charAt(j + 1) == '*') continue;
                if (i > 0 && p.charAt(j) != '*') {
                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
                } else if (p.charAt(j) == '*') {
                    // 分别计算dp[i][j] 和 dp[i - 1][j]
                    dp[i][j] = dp[i][j - 2] || (i > 0 && dp[i - 1][j] && (s.charAt(i) == p.charAt(j - 1) || p.charAt(j - 1) == '.'));
                }
            }
        }
        return dp[n][m];
    }

}

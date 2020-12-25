package LeetCode.HOT200;

/**
 * 解码方法
 */
public class HOT055_Decode_Ways {

    public int numDecodings(String s) {
        int n = s.length();
        if (n < 1) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        s = " " + s;
        for (int i = 2; i <= n; i ++) {
            if (s.charAt(i) != '0') dp[i] = dp[i - 1];
            int num = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            if (num >= 10 && num <= 26) dp[i] += dp[i - 2];
        }
        return dp[n];
    }

}

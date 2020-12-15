package 剑指Offer.dp;

/**
 * 把数字翻译成字符串有几种方式
 */
public class kinds_of_trans_num_2_str {

    public static void main(String[] args) {
        kinds_of_trans_num_2_str t = new kinds_of_trans_num_2_str();
        System.out.println(t.translateNum(12258));
    }

    public int translateNum(int num) {
        String numStr = " " + num;
        int n = numStr.length() - 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i ++) {
            dp[i] = dp[i - 1];
            if (i >= 2) {
                int t = (numStr.charAt(i - 1) - '0') * 10 + (numStr.charAt(i) - '0');
                if (t > 9 && t < 26) dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

}

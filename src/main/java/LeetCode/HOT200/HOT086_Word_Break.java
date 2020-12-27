package LeetCode.HOT200;

import java.util.HashSet;
import java.util.List;

/**
 * 单词拆分
 *      1、字符串hash：把字符串转成一个数字
 *          将字符串看成一个P进制数，如"abcde"，则字符串的hash值为
 *          (a*P^4 + b*P^3 + c*P^2 + d*P + e) % Q
 *          因为结果可能很大，所以%Q
 *          其中根据经验，P=131或者13331；Q=2^64
 *      2、dp
 */
public class HOT086_Word_Break {

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<Long> set = new HashSet<>();
        final long P = 131, Q = Long.MAX_VALUE;
        for (String word : wordDict) {
            long h = 0L;
            for (int i = 0; i < word.length(); i ++) h = h * P + word.charAt(i);
            set.add(h % Q);
        }

        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        s = " " + s;
        dp[0] = true;
        for (int i = 1; i <= n; i ++) {
            if (dp[i - 1]) {
                long h = 0L;
                for (int j = i; j <= n; j ++) {
                    h = h * P + s.charAt(j);
                    if (set.contains(h % Q)) dp[j] = true;
                }
            }
        }
        return dp[n];
    }

}

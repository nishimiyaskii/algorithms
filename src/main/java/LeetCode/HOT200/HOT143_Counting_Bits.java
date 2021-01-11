package LeetCode.HOT200;

/**
 * 计算0<= i <= num的所有二进制中1的个数总数
 * @Author aimerrhythms
 * @Date 2021/1/11 15:24
 */
public class HOT143_Counting_Bits {

    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i = 1; i <= num; i ++) {
            dp[i] += dp[i >>> 1] + (i & 1);
        }
        return dp;
    }

}

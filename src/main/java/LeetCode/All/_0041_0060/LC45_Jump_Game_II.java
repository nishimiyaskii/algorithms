package LeetCode.All._0041_0060;

/**
 * 保证一定能跳到最后，求跳到最后需要的最少次数
 * @Author cx
 * @Data 2021/1/19 13:37
 */
public class LC45_Jump_Game_II {

    public int jump(int[] nums) {
        // 用k去遍历试探每个位置能不能跳到nums[i]
        int k = 0;
        // dp[i]表示跳到i需要用的最少次数
        int[] dp = new int[nums.length];
        // 省略 dp[0] = 0;
        for (int i = 1; i < nums.length; i ++) {
            // 由于保证一定能跳到最后
            // 所以只要找到最远的、且能跳到i的位置
            while (k + nums[k] < i) k ++;
            dp[i] = dp[k] + 1;
        }
        return dp[nums.length - 1];
    }

}

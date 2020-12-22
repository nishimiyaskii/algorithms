package LeetCode.HOT200;

/**
 * 跳跃游戏II：最少的步数跳到数组末尾
 *  前提假设是：一定能跳到
 */
public class HOT037_Jump_Game_II {

    public int jump(int[] nums) {
        // dp[i]表示跳到i位置需要的最少步数
        if (nums.length < 1) return 0;
        int[] dp = new int[nums.length];
        for (int i = 1, furthestIndex = 0; i < nums.length; i ++) {
            while (furthestIndex + nums[furthestIndex] < i) furthestIndex ++;
            dp[i] = dp[furthestIndex] + 1;
        }
        return dp[nums.length - 1];
    }

}

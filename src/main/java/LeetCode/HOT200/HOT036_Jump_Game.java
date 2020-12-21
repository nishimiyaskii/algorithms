package LeetCode.HOT200;

/**
 * 跳跃游戏：能不能跳到
 */
public class HOT036_Jump_Game {

    public boolean canJump(int[] nums) {
        if (nums.length < 1) return true;
        for (int i = 0, furthestIndex = 0; i < nums.length; i ++) {
            if (furthestIndex < i) return false;
            furthestIndex = Math.max(furthestIndex, i + nums[i]);
        }
        return true;
    }

}

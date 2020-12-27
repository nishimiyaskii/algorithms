package LeetCode.HOT200;

/**
 * 只出现一次的数字
 */
public class HOT084_Single_Number {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) res ^= num;
        return res;
    }

}

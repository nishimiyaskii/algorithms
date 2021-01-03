package LeetCode.HOT200;

/**
 * 丢失的数字：求和，然后减去数组中所有的数字
 * @Author aimerrhythms
 * @Date 2020/12/31 11:05
 */
public class HOT131_Missing_Number {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s = n * (n + 1) >> 1;
        for (int num : nums) s -= num;
        return s;
    }

}

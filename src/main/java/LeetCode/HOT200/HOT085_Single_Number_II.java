package LeetCode.HOT200;

/**
 * 只出现一次的数字II：都三次，只有1个数出现了一次
 *
 * 状态机模型：DFA
 *      按位统计
 *
 */
public class HOT085_Single_Number_II {

    public int singleNumber(int[] nums) {
        // 状态机起点
        int two = 0, one = 0;
        for (int num : nums) {
            one = (one ^ num) & ~two;
            two = (two ^ num) & ~one;
        }
        return one;
    }

}

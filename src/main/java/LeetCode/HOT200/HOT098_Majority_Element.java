package LeetCode.HOT200;

/**
 * 多数元素
 * @author aimerrhythms
 */
public class HOT098_Majority_Element {

    public int majorityElement(int[] nums) {
        int res = 0, votes = 0;
        for (int num : nums) {
            if (votes == 0) {
                res = num;
                votes ++;
            } else {
                votes += res == num ? 1 : -1;
            }
        }
        return res;
    }

}

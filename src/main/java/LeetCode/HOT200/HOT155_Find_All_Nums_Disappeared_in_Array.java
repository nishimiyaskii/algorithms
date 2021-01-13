package LeetCode.HOT200;

import java.util.LinkedList;
import java.util.List;

/**
 * 数组中消失的数组：要求不使用额外空间
 *
 * 使用原数组记录是否出现过
 * 遍历到x时，如果a_x如果是负数，说明x出现过；如果a_x是正数，那么把a_x变成负数
 * 最后在遍历一遍原数组，正的元素的下标+1就是没有出现过的数字
 *
 * @Author cx
 * @Data 2021/1/13 16:53
 */
public class HOT155_Find_All_Nums_Disappeared_in_Array {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new LinkedList<>();
        for (int i = 1; i <= nums.length; i ++) {
            int x = Math.abs(nums[i - 1]);
            if (nums[x - 1] > 0) nums[x - 1] *= -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) res.add(i + 1);
        }
        return res;
    }

}

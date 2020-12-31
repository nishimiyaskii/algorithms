package LeetCode.HOT200;

import java.util.HashSet;

/**
 * 存在重复元素
 * @Author aimerrhythms
 * @Date 2020/12/29 10:26
 */
public class HOT113_Contains_Duplicate {

    /**
     * 方法一：利用hashset的不重复性
     */
    public boolean containsDuplicate01(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }

    /**
     * 双循环
     */
    public boolean containsDuplicate02(int[] nums) {
        if (nums.length < 2) return false;
        // max记录以当前元素结尾的子数组的最大值
        int max = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            // 重复
            if (nums[i] == max) return true;
            // 需要更新max
            else if (nums[i] > max) max = nums[i];
            else {
                // 从子数组开头到i-1，看看是不是有重复的
                for (int j = 0; j < i; j ++) {
                    if (nums[j] == nums[i]) return true;
                }
            }
        }
        return false;
    }

}

package LeetCode.HOT200;

import java.util.HashMap;

/**
 * 存在重复元素II
 *
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]
 * 并且 i 和 j 的差的 绝对值 <= k。
 *
 * @Author aimerrhythms
 * @Date 2020/12/29 10:35
 */
public class HOT114_Contains_Duplicate_II {

    HashMap<Integer, Integer> map = new HashMap<>();

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i ++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                map.put(nums[i], i);
                if (Math.abs(j - i) <= k) return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

}

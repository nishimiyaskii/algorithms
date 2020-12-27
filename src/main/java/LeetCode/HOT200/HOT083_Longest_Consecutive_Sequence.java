package LeetCode.HOT200;

import java.util.HashSet;

/**
 * 最长连续序列
 */
public class HOT083_Longest_Consecutive_Sequence {

    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) return nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int res = 0;
        for (int num : nums) {
            // 说明num可以作为起点。
            // 1、即只枚举每一段的第一个数
            if (!set.contains(num - 1)) {
                int cnt = 1, curr = num;
                set.remove(num);
                while (set.contains(curr + 1)) {
                    cnt ++;
                    set.remove(++ curr);
                }
                res = Math.max(cnt, res);
                // 2、防止重复枚举
            }
        }
        return res;
    }

}

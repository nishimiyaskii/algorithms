package LeetCode.HOT200;

import java.util.*;

/**
 * 前k个高频元素
 * @Author aimerrhythms
 * @Date 2021/1/11 15:53
 */
public class HOT145_Top_K_Frequent_Elements {

    /**
     * 1、计算每个num出现的次数
     * 2、利用计数排序的思想
     *      bucket[index]表示出现了index次的数的个数
     * 3、遍历桶，找出下标为i时，前k个高频元素已经出现了
     * 4、再遍历map，找出前k个高频元素
     */
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int num : nums) {
            cnt.put(num, cnt.containsKey(num) ? cnt.get(num) + 1 : 1);
        }
        int[] bucket = new int[n + 1];
        cnt.forEach((key, value) -> {
            bucket[value] ++;
        });
        int t = 0, i = n;
        while (t < k) {
            t += bucket[i --];
        }
        int[] res = new int[k];
        int j = 0;
        Set<Integer> keys = cnt.keySet();
        for (int key : keys) {
            if (cnt.get(key) > i) {
                res[j ++] = key;
            }
        }
        return res;
    }

}

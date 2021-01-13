package LeetCode.HOT200;

import java.util.HashMap;

/**
 * 四数相加II
 *
 * 每个数组最多500个数，暴力是n^3的，会超时
 * 所以使用空间换时间，最终是n^2的 map记录-(c+d)的次数
 *
 * @Author cx
 * @Data 2021/1/13 16:57
 */
public class HOT156_Four_Sums_II {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int c : C) {
            for (int d : D) {
                int s = c + d;
                cnt.put(s, cnt.containsKey(s) ? cnt.get(s) + 1 : 1);
            }
        }
        int res = 0;
        for (int a : A) {
            for (int b : B) {
                int s = - a - b;
                if (cnt.containsKey(s)) res += cnt.get(s);
            }
        }
        return res;
    }

}

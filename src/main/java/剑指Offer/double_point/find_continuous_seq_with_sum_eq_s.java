package 剑指Offer.double_point;

import java.util.ArrayList;
import java.util.List;

/**
 * 和为s的连续整数序列
 */
public class find_continuous_seq_with_sum_eq_s {

    public int[][] findContinuousSequence(int s) {
        if (s < 3) return new int[][]{};
        List<int[]> list = new ArrayList<>();
        for (int i = 1, j = 1, t = 0; i < s; i ++) {
            while (t < s) t += j ++;
            if (t == s && i < j - 1) {
                int[] arr = new int[j - i];
                for (int k = i; k < j; k ++) arr[k - i] = k;
                list.add(arr);
            }
            t -= i;
        }
        return list.toArray(new int[list.size()][]);
    }

}

package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 合并区间
 */
public class HOT038_Merge_Intervals {

    public int[][] merge(int[][] matrix) {
        if (matrix.length < 1) return new int[][]{};
        Arrays.sort(matrix, Comparator.comparingInt(a -> a[0]));
        List<int[]> list = new ArrayList<>();
        int l = matrix[0][0], r = matrix[0][1];
        for (int[] interval : matrix) {
            if (r < interval[0]) {
                list.add(new int[]{l, r});
                l = interval[0];
                r = interval[1];
            } else r = Math.max(r, interval[1]);
        }
        list.add(new int[]{l, r});
        int[][] res = new int[list.size()][];
        for (int i = 0; i < list.size(); i ++) {
            res[i] = list.get(i);
        }
        return res;
    }

}

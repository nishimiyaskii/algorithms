package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.List;

/**
 * 所有子集
 */
public class HOT048_Subsets {

    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        if (arr.length < 1) return res;
        int n = arr.length, size = 1 << n;
        for (int i = 0; i < size; i ++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j ++) {
                if (((i >> j) & 1) == 1) list.add(arr[j]);
            }
            res.add(list);
        }
        return res;
    }

}

package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 组合总和：数组有重复，每个数字最多用一次
 */
public class HOT029_Combination_Sum_II {


    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] v = null;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length < 1) return res;
        Arrays.sort(candidates);
        v = new boolean[candidates.length];
        dfs(candidates, 0, target);
        return res;
    }

    void dfs(int[] arr, int u, int t) {
        if (t == 0) {
            res.add(new ArrayList<>(path));
        } else if (t > 0) {
            for (int i = u; i < arr.length; i ++) {
                if (v[i] || i > 0 && arr[i] == arr[i - 1] && !v[i - 1]) continue;
                path.addLast(arr[i]);
                v[i] = true;
                dfs(arr, i + 1, t - arr[i]);
                path.removeLast();
                v[i] = false;
            }
        }
    }

}

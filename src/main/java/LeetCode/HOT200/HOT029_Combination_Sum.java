package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 组合总和：数组无重复，每个数字可以用无数次
 */
public class HOT029_Combination_Sum {

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length < 1) return res;
        dfs(candidates, 0, target);
        return res;
    }

    void dfs(int[] arr, int u, int t) {
        if (t == 0) {
            res.add(new ArrayList<>(path));
        } else if (t > 0) {
            for (int i = u; i < arr.length; i++) {
                path.addLast(arr[i]);
                dfs(arr, i, t - arr[i]);
                path.removeLast();
            }
        }
    }

}

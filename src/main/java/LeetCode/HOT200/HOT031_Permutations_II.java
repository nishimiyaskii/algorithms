package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列：数组有重复元素
 */
public class HOT031_Permutations_II {

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] v = null;

    public List<List<Integer>> permuteUnique(int[] arr) {
        if (arr.length < 1) return res;
        Arrays.sort(arr);
        v = new boolean[arr.length];
        dfs(arr);
        return res;
    }

    void dfs(int[] arr) {
        if (path.size() == arr.length) {
            res.add(new ArrayList<>(path));
        } else {
            for (int i = 0; i < arr.length; i ++) {
                if (v[i] || i > 0 && arr[i] == arr[i - 1] && !v[i - 1]) continue;
                path.addLast(arr[i]);
                v[i] =true;
                dfs(arr);
                path.removeLast();
                v[i] = false;
            }
        }
    }

}

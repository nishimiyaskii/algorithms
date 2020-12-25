package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 子集II
 */
public class HOT054_Subsets_II {

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] v = null;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums.length < 1) return res;
        v = new boolean[nums.length];
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i ++) {
            dfs(nums, 0, i);
        }
        return res;
    }

    void dfs(int[] arr, int u, int k) {
        if (path.size() == k) res.add(new ArrayList<>(path));
        else {
            for (int i = u; i < arr.length; i ++) {
                if (v[i] || i > 0 && arr[i] == arr[i - 1] && !v[i - 1]) continue;
                path.addLast(arr[i]);
                v[i] = true;
                dfs(arr, i + 1, k);
                path.removeLast();
                v[i] = false;
            }
        }
    }

}

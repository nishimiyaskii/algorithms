package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列：数组无重复
 */
public class HOT030_Permutations {

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] v = null;

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length < 1) return res;
        v = new boolean[nums.length];
        dfs(nums);
        return res;
    }

    void dfs(int[] arr) {
        if (path.size() == arr.length) {
            res.add(new ArrayList<>(path));
        } else {
            for (int i = 0; i < arr.length; i ++) {
                if (v[i]) continue;
                path.addLast(arr[i]);
                v[i] = true;
                dfs(arr);
                path.removeLast();
                v[i] = false;
            }
        }
    }

}

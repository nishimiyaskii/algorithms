package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 子集
 */
public class HOT047_Combinations {

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (n < 1) return res;
        dfs(n, 1, k);
        return res;
    }

    void dfs(int n, int u, int k) {
        if (k == path.size()) {
            res.add(new ArrayList<>(path));
        } else {
            for (int i = u; i <= n; i++) {
                path.addLast(i);
                dfs(n, i + 1, k);
                path.removeLast();
            }
        }
    }

}

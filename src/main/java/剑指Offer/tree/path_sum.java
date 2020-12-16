package 剑指Offer.tree;


import pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树中和为s的路径(根->叶)
 */
public class path_sum {

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int s) {
        if (root == null) return res;
        dfs(root, s);
        return res;
    }

    private void dfs(TreeNode root, int s) {
        if (root == null) return;
        path.addLast(root.val);
        s -= root.val;
        if (root.left == null && root.right == null && s == 0) res.add(new ArrayList<>(path));
        dfs(root.left, s);
        dfs(root.right, s);
        path.removeLast();
    }

}

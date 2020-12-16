package 剑指Offer.tree;

import pojo.TreeNode;

/**
 * 平衡二叉树
 */
public class is_balance_tree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return dfs(root) != -1;
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;
        int l = dfs(root.left);
        if (l == -1) return -1;
        int r = dfs(root.right);
        if (r == -1) return -1;
        return Math.abs(l - r) > 1 ? -1 : Math.max(l, r) + 1;
    }

}

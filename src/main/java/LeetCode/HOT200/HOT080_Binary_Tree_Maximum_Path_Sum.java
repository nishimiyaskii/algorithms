package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 二叉树的最大路径和
 */
public class HOT080_Binary_Tree_Maximum_Path_Sum {

    int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    /**
     *
     * @return  以当前节点为root的树->叶的最大路径和
     *          为负数的话，则不考虑当前子树的路径和
     */
    int dfs(TreeNode root) {
        if (root == null) return 0;
        int l = Math.max(0, dfs(root.left));
        int r = Math.max(0, dfs(root.right));
        res = Math.max(res, l + r + root.val);
        return Math.max(l, r) + root.val;
    }

}

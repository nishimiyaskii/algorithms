package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 对称的二叉树
 */
public class HOT064_Symmetric_Tree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return dfs(root.left, root.right);
    }

    boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }

}

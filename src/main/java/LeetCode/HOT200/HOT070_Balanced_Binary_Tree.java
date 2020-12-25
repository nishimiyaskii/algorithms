package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 平衡二叉树
 */
public class HOT070_Balanced_Binary_Tree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return dfs(root) != -1;
    }

    int dfs(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = dfs(root.left);
        if (leftDepth == -1) return -1;
        int rightDepth = dfs(root.right);
        if (rightDepth == -1) return -1;
        return Math.abs(leftDepth - rightDepth) > 1 ? -1 : Math.max(leftDepth, rightDepth) + 1;
    }

}

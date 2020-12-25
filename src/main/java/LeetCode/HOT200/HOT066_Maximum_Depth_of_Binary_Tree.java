package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 二叉树最大深度
 */
public class HOT066_Maximum_Depth_of_Binary_Tree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}

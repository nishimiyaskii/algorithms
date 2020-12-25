package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 树的最小深度
 */
public class HOT071_Minimum_Depth_of_Binary_Tree {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int l = minDepth(root.left), r =minDepth(root.right);
        return l == 0 ? r + 1 : (r == 0 ? l + 1 : Math.min(l, r) + 1);
    }

}

package 剑指Offer.tree;

import pojo.TreeNode;

/**
 * 二叉树的深度
 */
public class depth_tree {

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}

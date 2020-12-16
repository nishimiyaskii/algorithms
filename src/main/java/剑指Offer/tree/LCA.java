package 剑指Offer.tree;

import pojo.TreeNode;

/**
 *
 */
public class LCA {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == q || root == p) return root;
        // 左子树存不存在pq的LCA
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // 右子树存不存在pq的LCA
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null) {
            if (right != null) {
                return root;
            } else {
                return left;
            }
        } else {
            return right;
        }
    }

}

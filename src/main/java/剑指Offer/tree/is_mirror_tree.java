package 剑指Offer.tree;


import 剑指Offer.offer_po.TreeNode;

/**
 * 对称的二叉树
 */
public class is_mirror_tree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode A, TreeNode B) {
        if (A == null && B == null) return true;
        if (A == null || B == null || A.val != B.val) return false;
        return dfs(A.left, B.right) && dfs(A.right, B.left);
    }

}

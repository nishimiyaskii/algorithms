package 剑指Offer.tree;


import 剑指Offer.offer_po.TreeNode;

public class isSymmetrical {

    public boolean isSymmetrical(TreeNode root) {
        if (root == null) return true;
        return dfs(root.left, root.right);
    }

    boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }

}

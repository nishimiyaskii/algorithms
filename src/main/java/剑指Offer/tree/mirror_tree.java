package 剑指Offer.tree;


import 剑指Offer.offer_po.TreeNode;

/**
 * 二叉树的镜像
 */
public class mirror_tree {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return root;
        dfs(root);
        return root;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        dfs(root.left);
        dfs(root.right);
    }

}

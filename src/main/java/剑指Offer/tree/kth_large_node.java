package 剑指Offer.tree;

import pojo.TreeNode;

/**
 * BST的第k大节点
 */
public class kth_large_node {

    int k = 0, res = 0;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        if (-- k == 0) res = root.val;
        dfs(root.left);
    }

}

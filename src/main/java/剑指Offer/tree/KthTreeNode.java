package 剑指Offer.tree;


import 剑指Offer.offer_po.TreeNode;

/**
 * 二处搜索树：第k大的节点
 */
public class KthTreeNode {

    TreeNode res = null;
    int k = 0;
    public TreeNode KthNode(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        if (-- k == 0) {
            res = root;
            return;
        }
        dfs(root.left);
    }

}

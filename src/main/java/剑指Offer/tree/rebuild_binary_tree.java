package 剑指Offer.tree;


import pojo.TreeNode;

/**
 * 前中序重建二叉树：普通二叉树
 *
 * 前：3 9 20 15 7
 * 中：9 3 15 20 7
 */
public class rebuild_binary_tree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length || preorder.length < 1 || inorder.length < 1) return null;
        return dfs(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode dfs(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        for (int i = inStart; i <= inEnd; i ++) {
            if (inorder[i] == root.val) {
                root.left = dfs(preorder, preStart + 1, preStart + i - inStart, inorder, inStart, i - 1);
                root.right = dfs(preorder, preStart + i - inStart + 1, preEnd, inorder, i + 1, inEnd);
                break;
            }
        }
        return root;
    }

}

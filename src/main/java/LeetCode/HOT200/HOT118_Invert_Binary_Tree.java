package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 翻转二叉树
 * @Author aimerrhythms
 * @Date 2020/12/31 9:09
 */
public class HOT118_Invert_Binary_Tree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        return root;
    }
}

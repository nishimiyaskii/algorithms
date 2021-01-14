package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 二叉树的直径
 * @Author cx
 * @Data 2021/1/14 14:39
 */
public class HOT160_Diameter_of_Binary_Tree {

    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    // 返回从当前节点出发，能达到的最远路径
    int dfs(TreeNode root) {
        if (root == null) return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        res = Math.max(res, l + r);
        return Math.max(l, r) + 1;
    }

}

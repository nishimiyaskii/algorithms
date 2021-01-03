package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 二叉搜索树中的第k小元素
 * @Author aimerrhythms
 * @Date 2020/12/31 9:46
 */
public class HOT120_Kth_Smallest_Element_in_BST {

    int res = 0, k = 0;
    boolean ret = false;

    public int kthSmallest(TreeNode root, int _k) {
        k = _k;
        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if (root == null || ret) return;
        dfs(root.left);
        if (-- k == 0) {
            res = root.val;
            ret = true;
        }
        dfs(root.right);
    }

}

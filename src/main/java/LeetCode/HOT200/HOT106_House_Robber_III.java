package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 打家劫舍III：家住树上
 */
public class HOT106_House_Robber_III {

    public int rob(TreeNode root) {
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }

    /**
     * @return  res[0]表示不抢当前节点能获得的最大收入
     *          res[1]表示抢当前节点能获得的最大收入
     */
    int[] dfs(TreeNode root) {
        if (root == null) return new int[]{0, 0};
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int[] res = new int[2];
        // !root
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        // root
        res[1] = root.val + left[0] + right[0];
        return res;
    }
}

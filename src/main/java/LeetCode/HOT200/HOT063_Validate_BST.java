package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 验证BST
 */
public class HOT063_Validate_BST {

    public boolean isValidBST(TreeNode root) {
        return m1(root) && m2(root);
    }

    /**
     * 中序遍历
     */
    long prev = Long.MIN_VALUE;
    private boolean m2(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.left) || prev >= root.val) return false;
        prev = root.val;
        return isValidBST(root.right);
    }

    /**
     * 定义
     */
    private boolean m1(TreeNode root) {
        if (root == null) return true;
        return dfs(root)[0] == 1;
    }

    /**
     *
     * @return  res[0]：以当前节点为root的树是不是BST
     *          res[1]：以当前节点为root的树的最小值
     *          res[2]：以当前节点为root的树的最大值
     */
    int[] dfs(TreeNode root) {
        int[] res = new int[]{1, root.val, root.val};
        if (root.left != null) {
            int[] l = dfs(root.left);
            if (l[0] == 0 || l[2] >= root.val) res[0] = 0;
            res[1] = Math.min(res[1], l[1]);
            res[2] = Math.max(res[2], l[2]);
        }
        if (root.right != null) {
            int[] r = dfs(root.right);
            if (r[0] == 0 || r[1] <= root.val) res[0] = 0;
            res[1] = Math.min(res[1], r[1]);
            res[2] = Math.max(res[2], r[2]);
        }
        return res;
    }


}

package LeetCode.All._0101_0120;

import pojo.TreeNode;

import java.util.LinkedList;

/**
 * 对称二叉树：dfs和iter
 * @Author cx
 * @Data 2021/1/20 15:57
 */
public class LC101_Symmetric_Tree {


    // iter
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return iter(root, root);
    }

    boolean iter(TreeNode A, TreeNode B) {
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(A); q.offer(B);
        while (!q.isEmpty()) {
            A = q.poll(); B = q.poll();
            if (A == null && B == null) return true;
            if (A == null || B == null || A.val != B.val) return false;
            q.offer(A.left); q.offer(B.right);
            q.offer(A.right); q.offer(B.left);
        }
        return true;
    }

    // dfs
    // public boolean isSymmetric(TreeNode root) {
    //     if (root == null) return true;
    //     return dfs(root.left, root.right);
    // }

    // boolean dfs(TreeNode left, TreeNode right) {
    //     if (left == null && right == null) return true;
    //     if (left == null || right == null || left.val != right.val) return false;
    //     return dfs(left.left, right.right) && dfs(left.right, right.left);
    // }

}

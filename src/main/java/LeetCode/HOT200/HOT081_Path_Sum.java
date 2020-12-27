package LeetCode.HOT200;

import pojo.TreeNode;

import java.util.LinkedList;

/**
 * 二叉树的路径之和：root->bottom
 */
public class HOT081_Path_Sum {

    public boolean hasPathSum_DFS(TreeNode root, int sum) {
        if (root == null) return false;
        return root.left == null && root.right == null && root.val == sum || (hasPathSum_DFS(root.left, sum - root.val) || hasPathSum_DFS(root.right, sum - root.val));
    }

    public boolean hasPathSum_BFS(TreeNode root, int sum) {
        if (root == null) return false;
        LinkedList<TreeNode> nodeq = new LinkedList<>();
        LinkedList<Integer> pathq = new LinkedList<>();
        nodeq.addLast(root);
        pathq.addLast(root.val);
        while (!nodeq.isEmpty()) {
            root = nodeq.removeFirst();
            int t = pathq.removeFirst();
            if (root.left == null && root.right == null && t == sum) {
                return true;
            }
            if (root.left != null) {
                nodeq.addLast(root.left);
                pathq.addLast(t + root.left.val);
            }
            if (root.right != null) {
                nodeq.addLast(root.right);
                pathq.addLast(t + root.right.val);
            }
        }
        return false;
    }

}

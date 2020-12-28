package LeetCode.HOT200;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的右视图
 */
public class HOT107_Binary_Tree_Right_Side_View {

    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return res;
        LinkedList<TreeNode> q  = new LinkedList<>();
        q.addLast(root);
        while (!q.isEmpty()) {
            int n = q.size();
            while (n -- != 0) {
                root = q.removeFirst();
                if (n == 0) res.add(root.val);
                if (root.left != null) q.addLast(root.left);
                if (root.right != null) q.addLast(root.right);
            }
        }
        return res;
    }

    public List<Integer> rightSideView_DFS(TreeNode root) {
        if (root == null) return res;
        dfs(root, 0);
        return res;
    }

    void dfs(TreeNode root, int depth) {
        if (root == null) return;
        if (depth == res.size()) res.add(root.val);
        dfs(root.right, depth + 1);
        dfs(root.left, depth + 1);
    }

}

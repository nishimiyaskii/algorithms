package LeetCode.HOT200;

import pojo.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 二叉树的中序遍历
 */
public class HOT058_Binary_Tree_Inorder_Traversal {

    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
//        dfs(root);
        iter(root);
        return res;
    }

    void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
    }

    void iter(TreeNode root) {
        if (root == null) return;
        // 栈相当于存储的是递归过程中的上一层。
        Deque<TreeNode> stk = new ArrayDeque<>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.addLast(root);
                root = root.left;
            }
            root = stk.removeLast();
            res.add(root.val);
            root = root.right;
        }
    }


}

package LeetCode.HOT200;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 前序遍历
 */
public class HOT059_Binary_Tree_Preorder_Traversal {

    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
//        iter(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        res.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    private void iter(TreeNode root) {
        if (root == null) return;
        LinkedList<TreeNode> stk = new LinkedList<>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                // 遍历当前节点
                res.add(root.val);
                // 当前节点加入栈 === 遍历当前节点的左子树
                // 弹栈 === 遍历完左子树了
                stk.addLast(root);
                root = root.left;
            }
            root = stk.removeLast().right;
        }
    }

}

package LeetCode.HOT200;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树层次遍历
 */
public class HOT065_Binary_Tree_Level_Order_Traversal {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return res;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            while (n -- > 0) {
                root = q.removeFirst();
                list.add(root.val);
                if (root.left != null) q.addLast(root.left);
                if (root.right != null) q.addLast(root.right);
            }
            res.add(list);
        }
        return res;
    }

}

package LeetCode.HOT200;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 锯齿形BFS
 */
public class HOT065_Binary_Tree_Zigzag_Level_Order_Traversal {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return res;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        while (!q.isEmpty()) {
            int n = q.size();
            LinkedList<Integer> list = new LinkedList<>();
            while (n -- > 0) {
                root = q.removeFirst();
                if ((res.size() & 1) == 0) {
                    list.addLast(root.val);
                } else {
                    list.addFirst(root.val);
                }
                if (root.left != null) q.addLast(root.left);
                if (root.right != null) q.addLast(root.right);
            }
            res.add(list);
        }
        return res;
    }

}

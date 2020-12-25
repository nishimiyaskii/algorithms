package LeetCode.HOT200;

import pojo.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class HOT060_Binary_Tree_Postorder_Traversal {

    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return res;
        LinkedList<TreeNode> stk = new LinkedList<>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                res.addFirst(root.val);
                stk.addLast(root);
                root = root.right;
            }
            root = stk.removeLast().left;
        }
        return res;
    }

}

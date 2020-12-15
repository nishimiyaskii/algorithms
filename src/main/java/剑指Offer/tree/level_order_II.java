package 剑指Offer.tree;


import 剑指Offer.offer_po.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * 按层打印II
 */
public class level_order_II {

    public List<List<Integer>> levelOrderII(TreeNode root) {
        if (root == null) return new ArrayList<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        List<List<Integer>> res = new ArrayList<>();
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i ++) {
                TreeNode t = q.poll();
                list.add(t.val);
                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);
            }
            res.add(list);
        }
        return res;
    }

}

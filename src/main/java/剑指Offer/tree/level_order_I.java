package 剑指Offer.tree;


import pojo.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 按层打印I
 */
public class level_order_I {

    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[]{};
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            list.add(t.val);
            if (t.left != null) q.offer(t.left);
            if (t.right != null) q.offer(t.right);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i ++) {
            res[i] = list.get(i);
        }
        return res;
    }

}

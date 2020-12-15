package 剑指Offer.tree;


import 剑指Offer.offer_po.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 按层打印III
 */
public class level_order_III {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < 3; i ++) {
            l.addFirst(i);
        }
        System.out.println(l);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int level = 1;
        while (!q.isEmpty()) {
            int n = q.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i ++) {
                TreeNode t = q.poll();
                if ((level & 1) == 0) {
                    list.addFirst(t.val);
                } else {
                    list.addLast(t.val);
                }
                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);
            }
            level ++;
            res.add(list);
        }
        return res;
    }

}

package 剑指Offer.tree;


import pojo.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 序列化二叉树与反序列化二叉树
 */
public class serialize_dserialize_tree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return dfs_s(root, "");
    }

    String dfs_s(TreeNode root, String s) {
        if (root == null) s += "null,";
        s += root.val + ",";
        s += dfs_s(root.left, s);
        s += dfs_s(root.right, s);
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodeArr = data.split(",");
        ArrayDeque<String> q = new ArrayDeque<>();
        for (String s : nodeArr) {
            q.offer(s);
        }
        return dfs_d(q);
    }

    private TreeNode dfs_d(Deque<String> q) {
        if (q.isEmpty()) return null;
        if ("null".equals(q.peek())) {
            q.poll();
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(q.poll()));
        root.left = dfs_d(q);
        root.right = dfs_d(q);
        return root;
    }

}

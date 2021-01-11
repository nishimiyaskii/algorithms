package LeetCode.HOT200;

import pojo.TreeNode;

import java.util.LinkedList;

/**
 * 二叉树的序列化于反序列化
 * @Author aimerrhythms
 * @Date 2021/1/3 15:56
 */
public class HOT136_Serialize_and_Deserialize_Binary_Tree {

    StringBuilder res = new StringBuilder();
    public String serialize(TreeNode root) {
        dfs_s(root);
        return res.toString();
    }

    void dfs_s(TreeNode root) {
        if (root == null) {
            res.append("*,");
        } else {
            res.append(root.val).append(",");
            dfs_s(root.left);
            dfs_s(root.right);
        }
    }

    public TreeNode deserialize(String data) {
        String[] nodeArr = data.split(",");
        LinkedList<String> q = new LinkedList<>();
        for (String nodeStr : nodeArr) q.addLast(nodeStr);
        return dfs_d(q);
    }

    TreeNode dfs_d(LinkedList<String> q) {
        if (q.isEmpty()) {
            return null;
        } else if ("*".equals(q.getFirst())){
            q.removeFirst();
            return null;
        } else {
            TreeNode root = new TreeNode(Integer.parseInt(q.removeFirst()));
            root.left = dfs_d(q);
            root.right = dfs_d(q);
            return root;
        }
    }

}

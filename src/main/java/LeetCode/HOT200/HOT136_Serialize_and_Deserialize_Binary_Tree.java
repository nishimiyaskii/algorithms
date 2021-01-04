package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 二叉树的序列化于反序列化
 * @Author aimerrhythms
 * @Date 2021/1/3 15:56
 */
public class HOT136_Serialize_and_Deserialize_Binary_Tree {

    StringBuilder res = new StringBuilder();
    public String serialize(TreeNode root) {
        if(root == null) {
            res.append("*,");
        } else {
            res.append(root.val).append(",");
            serialize(root.left);
            serialize(root.right);
        }
        return res.toString();
    }

    int u = 0;
    public TreeNode deserialize(String data) {
        if (data.charAt(u) == '*') {
            u += 2;
            return null;
        } else {
            TreeNode root = new TreeNode(get(data));
            root.left = deserialize(data);
            root.right = deserialize(data);
            return root;
        }
    }

    int get(String s) {
        boolean neg = false;
        if (s.charAt(u) == '-') {
            neg = true;
            u ++;
        }
        int k = u;
        while (u < s.length() && s.charAt(u) !=',') u ++;
        int num = Integer.parseInt(s.substring(k, u ++));
        return neg ? -num : num;
    }

}

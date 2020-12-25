package LeetCode.HOT200;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 不同的BST：求所有方案
 */
public class HOT061_Unique_BST {

    public List<TreeNode> generateTrees(int n) {
        return dfs(1, n);
    }

    List<TreeNode> dfs(int l, int r) {
        List<TreeNode> list = new ArrayList<>();
        if (l > r) {
            list.add(null);
        } else {
            for (int i = l; i <= r; i ++) {
                List<TreeNode> left = dfs(l, i - 1), right = dfs(i + 1, r);
                for (TreeNode t1 : left) {
                    for (TreeNode t2 : right) {
                        TreeNode root = new TreeNode(i);
                        root.left = t1;
                        root.right = t2;
                        list.add(root);
                    }
                }
            }
        }
        return list;
    }

}

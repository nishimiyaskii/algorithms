package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 最大二叉树
 * @Author cx
 * @Data 2021/1/14 17:01
 */
public class HOT165_Maximum_Binary_Tree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length < 1) return null;
        return dfs(nums, 0, nums.length - 1);
    }

    TreeNode dfs(int[] nums, int l, int r) {
        if (l > r) return null;
        if (l == r) return new TreeNode(nums[l]);
        int m = Integer.MIN_VALUE, index = l;
        for (int i = l; i <= r; i ++) {
            if (m < nums[i]) {
                m = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(nums[index]);
        root.left = dfs(nums, l, index - 1);
        root.right = dfs(nums, index + 1, r);
        return root;
    }

}

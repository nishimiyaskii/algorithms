package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 有序数组转AVL树
 */
public class HOT068_Convert_Sorted_Array_2_AVL {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length < 1) return null;
        return dfs(nums, 0, nums.length - 1);
    }

    TreeNode dfs(int[] nums, int l, int r) {
        if (l > r) return null;
        int rootIndex = l + r >> 1;
        TreeNode root = new TreeNode(nums[rootIndex]);
        root.left = dfs(nums, l, rootIndex - 1);
        root.right = dfs(nums, rootIndex + 1, r);
        return root;
    }

}

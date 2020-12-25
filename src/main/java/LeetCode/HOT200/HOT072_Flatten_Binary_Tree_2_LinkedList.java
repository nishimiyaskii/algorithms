package LeetCode.HOT200;

import pojo.TreeNode;

/**
 * 二叉树转单向链表
 */
public class HOT072_Flatten_Binary_Tree_2_LinkedList {

    public void flatten(TreeNode root) {
        if (root != null) {
            TreeNode curr = root;
            while (curr != null) {
                if (curr.left == null) {
                    curr = curr.right;
                } else {
                    TreeNode p = curr.left;
                    while (p.right != null) p = p.right;
                    TreeNode temp = curr.right;
                    curr.right = curr.left;
                    curr.left = null;
                    p.right = temp;
                }
            }
        }
    }

}

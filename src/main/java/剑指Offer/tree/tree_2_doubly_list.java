package 剑指Offer.tree;


import pojo.TreeNode;

/**
 * 二叉树转双向链表
 */
public class tree_2_doubly_list {

    public static void main(String[] args) {
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t2.right = t3;
        TreeNode res = new tree_2_doubly_list().treeToDoublyList(t2);
    }

    TreeNode prev = null, head = null, tail = null;
    public TreeNode treeToDoublyList(TreeNode root) {
//        return ldr(root);
        return recursion(root);
    }

    private TreeNode recursion(TreeNode root) {
        if (root == null) return root;
        TreeNode[] sides = recu(root);
        sides[0].left = sides[1];
        sides[1].right = sides[0];
        return sides[0];
    }

    private TreeNode[] recu(TreeNode root) {
        if (root.left == null && root.right == null) return new TreeNode[]{root, root};
        else if (root.left != null && root.right != null) {
            TreeNode[] lsides = recu(root.left);
            TreeNode[] rsides = recu(root.right);
            lsides[1].right = root;
            root.left = lsides[1];
            rsides[0].left = root;
            root.right = rsides[0];
            return new TreeNode[]{lsides[0], rsides[1]};
        } else if (root.left != null) {
            TreeNode[] lsides = recu(root.left);
            lsides[1].right = root;
            root.left = lsides[1];
            return new TreeNode[]{lsides[0], root};
        } else {
            TreeNode[] rsides = recu(root.right);
            rsides[0].left = root;
            root.right = rsides[0];
            return new TreeNode[]{root, rsides[1]};
        }
    }

    private TreeNode ldr(TreeNode root) {
        if (root == null) return root;
        dfs_ldr(root);
        head.left = tail;
        tail.right = head;
        return head;
    }

    private void dfs_ldr(TreeNode root) {
        if (root == null) return;
        dfs_ldr(root.left);
        if (prev == null) head = root;
        else prev.right = root;
        root.left = prev;
        prev = root;
        tail = prev;
        dfs_ldr(root.right);
    }

}

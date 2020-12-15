package 剑指Offer.tree;


import 剑指Offer.offer_po.TreeNode;

/**
 * 树的子结构
 */
public class is_sub_structure {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        // 1、都非空树
        return (A != null && B != null) && (dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    boolean dfs(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return dfs(A.left, B.left) && dfs(A.right, B.right);
    }

}

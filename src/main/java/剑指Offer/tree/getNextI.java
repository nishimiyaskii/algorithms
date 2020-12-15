package 剑指Offer.tree;


import 剑指Offer.offer_po.LinkedTreeNode;

/**
 * 二叉树中序的下一个节点（有父节点）
 */
public class getNextI {

    public LinkedTreeNode getNext(LinkedTreeNode p) {
        if (p.right != null) {
            p = p.right;
            while (p.left != null) {
                p = p.left;
            }
            return p;
        } else {
            while (p.father != null && p.father.right == p) {
                p = p.father;
            }
            return p.father;
        }
    }

}

package 剑指Offer.list;


import 剑指Offer.offer_po.ListNode;

/**
 * 删除链表的指定节点
 */
public class delete_node {

    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.next = node.next.next;
        node.val = next.val;
    }

}

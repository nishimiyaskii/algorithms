package 剑指Offer.list;


import pojo.ListNode;

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

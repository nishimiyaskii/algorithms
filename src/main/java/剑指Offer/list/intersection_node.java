package 剑指Offer.list;

import pojo.ListNode;

/**
 * 两个链表的第一个公共节点
 */
public class intersection_node {

    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        if (A == null || B == null) return null;
        ListNode a = A, b = B;
        while (a != b) {
            a = a == null ? B : a.next;
            b = b == null ? A : b.next;
        }
        return a;
    }

}

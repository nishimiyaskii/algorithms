package 剑指Offer.list;


import 剑指Offer.offer_po.ListNode;

/**
 * 翻转链表
 */
public class reverse_list_I {

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}

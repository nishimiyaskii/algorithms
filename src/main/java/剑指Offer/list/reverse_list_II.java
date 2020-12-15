package 剑指Offer.list;


import 剑指Offer.offer_po.ListNode;

/**
 * 俩个一组翻转链表
 */
public class reverse_list_II {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1), a = dummy;
        dummy.next = head;
        // 需要交换的2个节点都存在时，进行交换
        while (a.next != null && a.next.next != null) {
            ListNode b = a.next, c = b.next;
            a.next = c;
            b.next = c.next;
            c.next = b;
            a = b;
        }
        return dummy.next;
    }

}

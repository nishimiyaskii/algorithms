package 剑指Offer.list;


import 剑指Offer.offer_po.ListNode;

/**
 * 返回倒数第k个节点
 */
public class return_last_Kth_node {

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return head;
        ListNode f = head, s = head;
        while (k -- > 0) f = f.next;
        while (f != null) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

}

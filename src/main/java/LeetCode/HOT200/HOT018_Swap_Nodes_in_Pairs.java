package LeetCode.HOT200;

import pojo.ListNode;

public class HOT018_Swap_Nodes_in_Pairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1), p = dummy;
        dummy.next = head;
        while (p.next != null && p.next.next != null) {
            ListNode a = p.next, b = a.next;
            p.next = b;
            a.next = b.next;
            b.next = a;
            p = a;
        }
        return dummy.next;
    }

}

package LeetCode.HOT200;

import pojo.ListNode;

/**
 * k个一组翻转链表
 */
public class HOT019_Reverse_Nodes_in_kGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1), p = dummy;
        dummy.next = head;
        while (true) {
            ListNode curr = p;
            for (int i = 0; i < k && curr != null; i ++) curr = curr.next;
            if (curr == null) break;
            ListNode a = p.next, b = a.next;
            for (int i = 0; i < k - 1; i ++) {
                ListNode c = b.next;
                b.next = a;
                a = b;
                b = c;
            }
            ListNode c = p.next;
            p.next = a;
            c.next = b;
            p = c;
        }
        return dummy.next;
    }

}

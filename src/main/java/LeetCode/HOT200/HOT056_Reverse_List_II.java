package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 反转链表II：反转m-n的链表
 */
public class HOT056_Reverse_List_II {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1), prev = dummy;
        dummy.next = head;
        for (int i = 0; i < m - 1; i++) {
            prev = prev.next;
        }
        // System.out.println(prev.val);
        ListNode left = prev, curr = prev.next, right = curr;
        for (int i = 1; i <= n - m + 1; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        left.next = prev;
        right.next = curr;
        return dummy.next;
    }

}

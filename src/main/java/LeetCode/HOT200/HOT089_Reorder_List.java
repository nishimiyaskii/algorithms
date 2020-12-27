package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 重排链表
 */
public class HOT089_Reorder_List {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode s = head, f = head.next;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        ListNode right = f == null ? reverse(s) : reverse(s.next);
        ListNode dummy = new ListNode(-1), left = head, curr = dummy;
        int k = 1;
        while (left != null && right != null) {
            if ((k & 1) == 1) {
                curr = curr.next = left;
                left = left.next;
            } else {
                curr = curr.next = right;
                right = right.next;
            }
            k ++;
        }
    }

    ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;
        }
        return prev;
    }

}

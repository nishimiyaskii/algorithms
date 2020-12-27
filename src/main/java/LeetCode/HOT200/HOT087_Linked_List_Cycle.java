package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 环形链表
 */
public class HOT087_Linked_List_Cycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (s == f) return true;
        }
        return false;
    }

}

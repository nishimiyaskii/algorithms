package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 环形链表II：找出链表环入口
 */
public class HOT088_Linked_List_Cycle_II {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                s = head;
                while (s != f) {
                    s = s.next;
                    f = f.next;
                }
                return s;
            }
        }
        return null;
    }

}

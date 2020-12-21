package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 旋转链表：右旋转k个到链表头
 */
public class HOT040_Rotate_List {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int len = 0;
        ListNode curr = head, last = null;
        while (curr != null) {
            if (curr.next == null) last = curr;
            curr = curr.next;
            len ++;
        }
        k %= len;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        curr = dummy;
        for (int i = 0; i < len - k; i ++) curr = curr.next;
        last.next = dummy.next;
        dummy.next = curr.next;
        curr.next = null;
        return dummy.next;
    }

}

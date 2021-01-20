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
            // 判断剩下有没有k个节点
            ListNode curr = p;
            for (int i = 0; i < k && curr != null; i ++) curr = curr.next;
            if (curr == null) break;
            // 翻转k-1次即可
            ListNode a = p.next, b = a.next;
            for (int i = 0; i < k - 1; i ++) {
                // 翻转链表
                ListNode c = b.next;
                b.next = a;
                a = b;
                b = c;
            }
            // 整理翻转好的这一段
            ListNode c = p.next;
            p.next = a;
            c.next = b;
            p = c;
        }
        return dummy.next;
    }

}

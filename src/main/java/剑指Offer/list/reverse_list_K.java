package 剑指Offer.list;

import pojo.ListNode;

public class reverse_list_K {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1), p = dummy;
        dummy.next = head;
        while (true) {
            // 1、先计算p后面够不够k个节点
            ListNode curr = p;
            for (int i = 0; i < k && curr != null; i ++) curr = curr.next;
            if (curr == null) break;
            // 2、内部交换
            ListNode a = p.next, b = a.next;
            for (int i = 1; i < k; i ++) {
                ListNode next = b.next;
                b.next = a;
                a = b;
                b = next;
            }
            // 3、外部交换
            ListNode c = p.next;
            p.next = a;
            c.next = b;
            p = c;
        }
        return dummy.next;
    }

}
package 剑指Offer.list;


import pojo.ListNode;

/**
 * 删除排序链表中的重复节点II
 */
public class DeleteDuplicationII {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1), p = dummy;
        p.next = head;
        while (p != null && p.next != null) {
            ListNode l = p.next, r = l.next;
            while (r != null && r.val == l.val) r = r.next;
            if (l.next == r) {
                p = l;
            } else {
                p.next = r;
            }
        }
        return dummy.next;
    }

}

package 剑指Offer.list;


import pojo.ListNode;

/**
 * 删除排序链表中的重复节点II
 */
public class DeleteDuplicationII {

    public ListNode deleteDuplicationII(ListNode h) {
        if (h == null || h.next == null) return null;
        ListNode d = h, l = h;
        d.next = h;
        while (l.next != null) {
            ListNode r = l.next;
            while (r != null && l.next.val == r.val) r = r.next;
            if (l.next.next == r) l = l.next;
            else l.next = r;
        }
        return d.next;
    }

}

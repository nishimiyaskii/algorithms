package 剑指Offer.list;

import pojo.ListNode;

/**
 * 删除排序链表中的重复节点
 */
public class DeleteDuplication {

    public ListNode deleteDuplication(ListNode h) {
        if (h == null || h.next == null) return h;
        ListNode c = h;
        while (c != null && c.next != null) {
            if (c.val == c.next.val) c.next = c.next.next;
            else c = c.next;
        }
        return h;
    }

}

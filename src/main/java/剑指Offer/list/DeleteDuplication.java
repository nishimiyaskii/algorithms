package 剑指Offer.list;

import pojo.ListNode;

/**
 * 删除排序链表中的重复节点：只留一个
 */
public class DeleteDuplication {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        while (curr.next != null) {
            // 保留重复元素的第一个
            if (curr.val == curr.next.val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;
    }

}

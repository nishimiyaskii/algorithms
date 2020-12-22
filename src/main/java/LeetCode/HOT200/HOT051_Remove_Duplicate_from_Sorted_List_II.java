package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 从排序数组中删除重复元素II：一个不留
 */
public class HOT051_Remove_Duplicate_from_Sorted_List_II {

    // 1 -> 1 -> 1 -> 2 -> 3
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1), p = dummy;
        dummy.next = head;
        while (p.next != null) {
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

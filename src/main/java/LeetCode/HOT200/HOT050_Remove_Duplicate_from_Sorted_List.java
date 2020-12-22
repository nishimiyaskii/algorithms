package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 排序链表中删除重复项：只留一个（重复的节点中留第一个）
 */
public class HOT050_Remove_Duplicate_from_Sorted_List {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode l = head, r = head;
        while (r != null) {
            if (r.val == l.val) {
                r = l.next = r.next;
            } else {
                l = l.next;
                r = r.next;
            }
        }
        return head;
    }

}

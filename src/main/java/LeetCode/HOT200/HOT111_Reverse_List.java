package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 翻转链表
 * @Author aimerrhythms
 * @Date 2020/12/29 8:45
 */
public class HOT111_Reverse_List {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}

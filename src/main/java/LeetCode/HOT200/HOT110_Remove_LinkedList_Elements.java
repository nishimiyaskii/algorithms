package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 移出链表元素
 * @Author aimerrhythms
 * @Date 2020/12/29 8:40
 */
public class HOT110_Remove_LinkedList_Elements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1), curr = dummy;
        dummy.next = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return dummy.next;
    }

}

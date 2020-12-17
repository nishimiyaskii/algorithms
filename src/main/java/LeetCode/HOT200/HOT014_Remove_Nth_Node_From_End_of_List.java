package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 删除链表的倒数第N个节点
 */
public class HOT014_Remove_Nth_Node_From_End_of_List {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        n ++;
        ListNode dummy = new ListNode(-1), left = dummy, right = dummy;
        dummy.next = head;
        while (n -- != 0) {
            right = right.next;
        }
        while (right != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }

}

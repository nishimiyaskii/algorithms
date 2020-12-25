package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 分隔链表
 */
public class HOT052_Partition_List {

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode left = new ListNode(-1), right = new ListNode(-1),
                leftCurr = left, rightCurr = right,
                curr = head;
        while (curr != null) {
            if (curr.val < x) {
                leftCurr = leftCurr.next = curr;
            } else {
                rightCurr = rightCurr.next = curr;
            }
            curr = curr.next;
        }
        // 只需要将rightCurr.next=null即可
        // 因为leftCurr.next需要重新指向right.next
        rightCurr.next = null;
        leftCurr.next = right.next;
        return left.next;
    }

}

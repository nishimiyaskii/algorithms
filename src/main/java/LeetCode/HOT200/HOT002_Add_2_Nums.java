package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 链表模拟两数相加
 */
public class HOT002_Add_2_Nums {

    public ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1), curr = dummy;
        int sum = 0, carry = 0;
        while (l1 != null || l2 != null) {
            sum = carry + (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            curr = curr.next;
        }
        if (carry != 0) curr.next = new ListNode(carry);
        return dummy.next;
    }

}

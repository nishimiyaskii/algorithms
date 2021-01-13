package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 两数相加
 * @Author cx
 * @Data 2021/1/13 16:43
 */
public class HOT154_Add_Two_Nums {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1); l2 = reverse(l2);
        ListNode dummy = new ListNode(-1), curr = dummy;
        int t = 0;
        while (l1 != null || l2 != null) {
            t += (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            curr = curr.next = new ListNode(t % 10);
            t /= 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (t > 0) curr.next = new ListNode(t);
        return reverse(dummy.next);
    }

    ListNode reverse(ListNode head) {
        if (head == null) return null;
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;
        }
        return prev;
    }

}

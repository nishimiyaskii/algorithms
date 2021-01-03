package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 回文链表
 * @Author aimerrhythms
 * @Date 2020/12/31 10:03
 */
public class HOT122_Palindrome_LinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        int n = 0;
        for (ListNode p = head; p != null; p = p.next) n ++;
        ListNode prev = null, curr = head;
        for (int i = 0; i < n / 2; i ++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode a, b;
        a = prev;
        if ((n & 1) == 1) {
            b = curr.next;

        } else {
            b = curr;
        }
        while (a != null && b != null) {
            if (a.val != b.val) return false;
            a = a.next;
            b = b.next;
        }
        return a == null && b == null;
    }


}

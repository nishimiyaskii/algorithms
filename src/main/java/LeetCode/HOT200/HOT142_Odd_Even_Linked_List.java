package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 奇偶链表：按照节点个数来排列
 * @Author aimerrhythms
 * @Date 2021/1/11 15:22
 */
public class HOT142_Odd_Even_Linked_List {

    public ListNode oddEvenList(ListNode head) {
        int n = 1;
        ListNode d1 = new ListNode(-1), d2 = new ListNode(-1), odd = d1, even = d2, curr = head;
        while (curr != null) {
            if ((n & 1) == 1) {
                odd = odd.next = curr;
            } else {
                even = even.next = curr;
            }
            curr = curr.next;
            n ++;
        }
        odd.next = d2.next;
        even.next = null;
        return d1.next;
    }

}

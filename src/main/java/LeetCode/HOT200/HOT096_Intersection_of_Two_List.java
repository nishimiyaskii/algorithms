package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 相交链表
 * @author aimerrhythms
 */
public class HOT096_Intersection_of_Two_List {

    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        if (A == null || B == null) return null;
        ListNode a = A, b = B;
        while (a != b) {
            a = a == null ? B : a.next;
            b = b == null ? A : b.next;
        }
        return a;
    }

}

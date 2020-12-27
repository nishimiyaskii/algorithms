package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 排序链表
 * @author aimerrhythms
 */
public class HOT091_Sort_List {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int n = 0;
        for (ListNode p = head; p != null; p = p.next) {
            n ++;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 枚举每次归并，单个链表的长度
        for (int i = 1; i < n; i *= 2) {
            ListNode curr = dummy;
            // 枚举每次起点的下标
            for (int j = 0; j + i < n; j += i * 2) {
                ListNode l = curr.next, r = l;
                for (int k = 0; k < i; k ++) {
                    r = r.next;
                }
                int lcnt = 0, rcnt = 0;
                while (l != null && r != null && lcnt < i && rcnt < i) {
                    if (l.val < r.val) {
                        curr = curr.next = l;
                        l = l.next;
                        lcnt ++;
                    } else {
                        curr = curr.next = r;
                        r = r.next;
                        rcnt ++;
                    }
                }
                // 必须使用while循环，因为需要定位到下一部分的起点
                while (lcnt < i) {
                    curr = curr.next = l;
                    l = l.next;
                    lcnt ++;
                }
                while (rcnt < i && r != null) {
                    curr = curr.next = r;
                    r = r.next;
                    rcnt ++;
                }
                curr.next = r;
            }
        }
        return dummy.next;
    }

    public ListNode sortListMerge(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int n = 0;
        for (ListNode p = head; p != null; p = p.next) {
            n ++;
        }
        ListNode p = head;
        for (int i = 0; i < n - 1 >> 2; i ++) {
            p = p.next;
        }
        ListNode r = p.next;
        p.next = null;
        ListNode left = sortListMerge(head), right = sortListMerge(r), dummy = new ListNode(-1), curr = dummy;
        while (left != null && right != null) {
            if (left.val < right.val) {
                curr = curr.next = left;
                left = left.next;
            } else {
                curr = curr.next = right;
                right = right.next;
            }
        }
        if (left != null) {
            curr.next = left;
        }
        if (right != null) {
            curr.next = right;
        }
        return dummy.next;
    }

    public ListNode sortListQuick(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode A = new ListNode(-1), a = A,
                B = new ListNode(-1), b = B,
                C = new ListNode(-1), c = C,
                curr = head;
        int pivot = head.val;
        while (curr != null) {
            if (curr.val < pivot) {
                a = a.next = curr;
            } else if (curr.val > pivot) {
                c = c.next = curr;
            } else {
                b = b.next = curr;
            }
            curr = curr.next;
        }
        a.next = null;
        b.next = null;
        c.next = null;
        A.next = sortList(A.next);
        C.next = sortList(C.next);
        getLast(A).next = B.next;
        getLast(B).next = C.next;
        return A.next;
    }

    ListNode getLast(ListNode head) {
        while (head != null && head.next != null) {
            head = head.next;
        }
        return head;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "\t");
            head = head.next;
        }
    }

}

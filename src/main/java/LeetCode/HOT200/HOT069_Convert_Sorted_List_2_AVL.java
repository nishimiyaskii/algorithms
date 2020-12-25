package LeetCode.HOT200;

import pojo.ListNode;
import pojo.TreeNode;

/**
 * 有序链表转AVL树
 */
public class HOT069_Convert_Sorted_List_2_AVL {

    /**
     * 1、链表遍历求中点
     * 2、开O(n)数组，转换为上一题
     */
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        int n = 0;
        for (ListNode p = head; p != null; p = p.next) n ++;
        if (n == 1) return new TreeNode(head.val);
        ListNode curr = head;
        // 总共有n个节点
        // 奇数取第n/2+1个节点，偶数取第n/2个节点，所以总的是取n/2(上取整)个节点
        // 需要跳n/2-1(上取整)次，即跳(n-1)/2(上取整)次  保证了左边一定不是空的，好处理点
        // b/a(上取整) = (b + a - 1) / a
        for (int i = 0; i < n / 2 - 1; i ++) curr = curr.next;  // n/2-1是为了定位到中点的前一个点（因为是链表）
        TreeNode root = new TreeNode(curr.next.val);
        root.right = sortedListToBST(curr.next.next);
        curr.next = null;
        root.left = sortedListToBST(head);
        return root;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "\t");
            head = head.next;
        }
    }

}

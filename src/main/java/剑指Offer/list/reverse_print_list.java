package 剑指Offer.list;


import 剑指Offer.offer_po.ListNode;

/**
 * 逆序输出链表
 */
public class reverse_print_list {

    /**
     * 解法1：use Stack
     * 解法2：double loop
     * @param head
     * @return
     */
    public int[] reversePrintList(ListNode head) {
        // double loop
        if (head == null) return new int[]{};
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len ++;
            curr = curr.next;
        }
        int[] res = new int[len];
        while (head != null) {
            res[-- len] = head.val;
            head = head.next;
        }
        return res;
    }

}

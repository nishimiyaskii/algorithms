package LeetCode.HOT200;

import pojo.ListNode;

/**
 * 删除链表中的节点
 * @Author aimerrhythms
 * @Date 2020/12/31 10:14
 */
public class HOT123_Delete_Node_in_LinkedList {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}

package 剑指Offer.list;


import 剑指Offer.offer_po.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 带有随机指针的复杂链表复制
 */
public class random_list_copy {

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return head;
        // key=原,value=新
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode curr = head;
        while (curr != null) {
            map.put(curr, new RandomListNode(curr.val));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }

}

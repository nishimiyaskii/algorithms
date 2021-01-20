package 剑指Offer.stack_queue_priorityqueue;

import java.util.ArrayDeque;
import java.util.HashMap;

/**
 * 字符流中第一个只出现一次的字符
 * @Author cx
 * @Data 2021/1/17 19:21
 */
public class ACWing46 {

    HashMap<Character, Integer> cnt = new HashMap<>();
    ArrayDeque<Character> q = new ArrayDeque<>();

    public void insert(char c){
        cnt.put(c, cnt.containsKey(c) ? cnt.get(c) + 1 : 1);
        if (cnt.get(c) > 1) {
            while (!q.isEmpty() && cnt.get(q.getLast()) > 1) q.removeLast();
        } else {
            q.addFirst(c);
        }
    }
    public char firstAppearingOnce(){
        return q.isEmpty() ? '#' : q.getLast();
    }

}

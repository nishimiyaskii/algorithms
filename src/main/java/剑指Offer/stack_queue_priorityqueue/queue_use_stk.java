package 剑指Offer.stack_queue_priorityqueue;

import java.util.ArrayDeque;

public class queue_use_stk {

    ArrayDeque<Integer> stk1, stk2;

    public queue_use_stk() {
        stk1 = new ArrayDeque<>();
        stk2 = new ArrayDeque<>();
    }

    public void appendTail(int x) {
        stk1.push(x);
    }

    public int deleteHead() {
        if (!stk2.isEmpty()) return stk2.pop();
        if (!stk1.isEmpty()) {
            while (!stk1.isEmpty()) stk2.push(stk1.pop());
            return stk2.pop();
        }
        return -1;
    }

}

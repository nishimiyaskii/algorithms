package 剑指Offer.stack_queue_priorityqueue;

import java.util.ArrayDeque;

public class min_stk {

    ArrayDeque<Integer> stk1, stk2;

    public min_stk() {
        stk1 = new ArrayDeque<>();
        stk2 = new ArrayDeque<>();
    }

    public void push(int x) {
        stk1.push(x);
        if (stk2.isEmpty() || stk2.peek() >= x) {
            stk2.push(x);
        }
    }

    public void pop() {
        int t = stk1.pop();
        if (t == stk2.peek()) {
            stk2.pop();
        }
    }

    public int top() {
        return stk1.isEmpty() ? -1 : stk1.peek();
    }

    public int min() {
        return stk2.isEmpty() ? -1 : stk2.peek();
    }

}

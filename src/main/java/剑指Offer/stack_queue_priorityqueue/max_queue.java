package 剑指Offer.stack_queue_priorityqueue;

import java.util.ArrayDeque;

public class max_queue {

    ArrayDeque<Integer> q, max;

    public max_queue() {
        q = new ArrayDeque<>();
        max = new ArrayDeque<>();
    }

    public int max_value() {
        return max.isEmpty() ? -1 : max.getFirst();
    }

    // 单调队列
    public void insert(int x) {
        q.offer(x);
        if (max.isEmpty()) {
            max.addLast(x);
        } else {
            while (!max.isEmpty() && max.getLast() < x) max.removeLast();
            max.addLast(x);
        }
    }

    public int remove() {
        if (q.isEmpty()) return -1;
        else {
            int t = q.poll();
            if (t == max.getFirst()) {
                max.removeFirst();
            }
            return t;
        }
    }
}

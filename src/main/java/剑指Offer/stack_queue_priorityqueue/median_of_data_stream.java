package 剑指Offer.stack_queue_priorityqueue;

import java.util.PriorityQueue;

/**
 * 数据流的中位数
 */
public class median_of_data_stream {

    /**
     * 左边大顶堆，存储小数
     */
    PriorityQueue<Integer> left = new PriorityQueue<>((a, b) -> b - a);

    /**
     * 右边小顶堆，存储大数
     */
    PriorityQueue<Integer> right = new PriorityQueue<>();

    public void addNum(int x) {
        left.offer(x);
        if (!left.isEmpty() && !right.isEmpty()) {
            if (left.peek() > right.peek()) {
                int t = left.poll();
                left.offer(right.poll());
                right.offer(t);
            }
            if (left.size() >= right.size() + 2) {
                right.offer(left.poll());
            }
        }
    }

    public double getMedian() {
        if (((left.size() + right.size()) & 1) == 0) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return left.peek() / 1.0;
        }
    }
}

package 剑指Offer.stack_queue_priorityqueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 滑动窗口最大值
 */
public class max_sliding_window {

    /**
     * O(k)空间
     * 1、解决队列头出窗口问题
     * 2、解决队列尾与当前元素不满足单调性的问题
     * 3、将当前元素下标直接加入队列
     * 4、如果满足条件则将队列头加入结果数组
     */
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        if (n < 1) return new int[]{};
        Deque<Integer> q = new ArrayDeque<>();
        int[] res = new int[n - k + 1];
        for (int i = 0, index = 0; i < n; i ++) {
            while (!q.isEmpty() && q.getLast() < i - k + 1) q.removeLast();
            while (!q.isEmpty() && arr[q.getFirst()] < arr[i]) q.removeFirst();
            q.addFirst(i);
            if (i >= k - 1) res[index ++] = arr[q.getLast()];
        }
        return res;
    }
}

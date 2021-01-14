package template.monotonic;

import java.util.ArrayDeque;

/**
 * 单调队列：滑动窗口的最值
 *
 * LC234：滑动窗口的最大值
 *
 * @Author cx
 * @Data 2021/1/14 18:10
 */
public class MonotonicQueue {

    public int[] LC234(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int index = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i ++) {
            if (!q.isEmpty() && q.getLast() < i - k + 1) q.removeLast();
            while (!q.isEmpty() && nums[q.getFirst()] <= nums[i]) q.removeFirst();
            q.addFirst(i);
            if (i >= k - 1) {
                res[index ++] = nums[q.getLast()];
            }
        }
        return res;
    }

}

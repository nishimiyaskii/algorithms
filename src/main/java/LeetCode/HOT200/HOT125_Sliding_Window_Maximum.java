package LeetCode.HOT200;

import java.util.LinkedList;

/**
 * 滑动窗口最大值
 * @Author aimerrhythms
 * @Date 2020/12/31 10:19
 */
public class HOT125_Sliding_Window_Maximum {

    public int[] maxSlidingWindow(int[] nums ,int k) {
        int n = nums.length;
        LinkedList<Integer> q = new LinkedList<>();
        int[] res = new int[n - k + 1];
        int index = 0;
        for (int l = 0, r = 0; r < n; r ++) {
            if (!q.isEmpty() && q.getLast() < r - k + 1) q.removeLast();
            while (!q.isEmpty() && nums[r] >= nums[q.getFirst()]) q.removeFirst();
            q.addFirst(r);
            if (r + 1 >= k) {
                res[index ++] = nums[q.getLast()];
            }
        }
        return res;
    }

}

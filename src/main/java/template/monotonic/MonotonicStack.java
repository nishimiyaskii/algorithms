package template.monotonic;

import java.util.Stack;

/**
 * 单调栈：找出当前数左侧第一个比它小的数
 *
 * LC84：柱形图中的最大矩形面积
 * LC42：接雨水（二维）
 * LC739：每日温度
 *
 * @Author cx
 * @Data 2021/1/14 18:10
 */
public class MonotonicStack {

    // [2, 1, 5, 6, 2, 3]
    public int LC84 (int[] heights) {
        int n = heights.length;
        Stack<Integer> stk = new Stack<>();
        // 单调栈找出每个柱子左右两边最近的且比当前柱子矮的柱子
        int[] l = new int[n], r = new int[n];
        for (int i = 0; i < n; i ++) {
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) stk.pop();
            if (stk.isEmpty()) l[i] = -1;
            else l[i] = stk.peek();
            stk.push(i);
        }
        stk.clear();
        for (int i = n - 1; i >= 0; i --) {
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) stk.pop();
            if (stk.isEmpty()) r[i] = n;
            else r[i] = stk.peek();
            stk.push(i);
        }
        int res = 0;
        for (int i = 0 ; i < n; i ++) {
            res = Math.max(res, heights[i] * (r[i] - l[i] - 1));
        }
        return res;
    }

    public int LC42(int[] height) {
        int n = height.length;
        Stack<Integer> stk = new Stack<>();
        int res = 0;
        for (int i = 0; i < n; i ++) {
            int last = 0;
            while (!stk.isEmpty() && height[stk.peek()] <= height[i]) {
                int top = stk.pop();
                res += (i - top - 1) * (height[top] - last);
                last = height[top];
            }
            if (!stk.isEmpty()) res += (height[i] - last) * (i - stk.peek() - 1);
            stk.push(i);
        }
        return res;
    }

    // [73, 74, 75, 71, 69, 72, 76, 73]
    public int[] LC739 (int[] T) {
        int n = T.length;
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();
        for (int i = n - 1; i >= 0; i --) {
            while (!stk.isEmpty() && T[stk.peek()] <= T[i]) stk.pop();
            if (stk.isEmpty()) res[i] = 0;
            else res[i] = stk.peek() - i;
            stk.push(i);
        }
        return res;
    }

}

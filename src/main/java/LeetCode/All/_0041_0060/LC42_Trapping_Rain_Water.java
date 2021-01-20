package LeetCode.All._0041_0060;

import java.util.ArrayDeque;

/**
 * 接雨水
 * @Author cx
 * @Data 2021/1/19 12:55
 */
public class LC42_Trapping_Rain_Water {
    

    public int trap (int[] heights) {
        int res = 0;
        ArrayDeque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i < heights.length; i ++) {
            // 记录上一个栈顶的高度
            int last = 0;
            while (!stk.isEmpty() && heights[stk.peek()] <= heights[i]) {
                int curr = stk.pop();
                res += (heights[curr] - last) * (i - curr - 1);
                last = heights[curr];
            }
            if (!stk.isEmpty()) res += (heights[i] - last) * (i - stk.peek() - 1);
            stk.push(i);
        }
        return res;
    }

}

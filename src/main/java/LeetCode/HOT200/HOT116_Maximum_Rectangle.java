package LeetCode.HOT200;

import java.util.LinkedList;

/**
 * 最大矩形（类比最大正方形）
 *
 *  枚举下边界，然后用求单调栈的方式求最大矩形。
 *  可以用f[i,j]表示以matrix[i,j]为底的最高高度
 *
 * @Author aimerrhythms
 * @Date 2020/12/31 8:37
 */
public class HOT116_Maximum_Rectangle {

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length < 1 || matrix[0].length < 1) return 0;
        int n = matrix.length, m = matrix[0].length;
        int[][] h = new int[n][m];
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                if (i == 0) h[i][j] = matrix[i][j] - '0';
                else if (matrix[i][j] == '1') h[i][j] = h[i - 1][j] + 1;
            }
        }
        int res = 0;
        for (int i = 0; i < n; i ++) {
            res = Math.max(res, getMaxArea(h[i]));
        }
        return res;
    }

    int getMaxArea(int[] heights) {
        int n = heights.length;
        if (n < 1) return 0;
        int[] lmin = new int[n], rmin = new int[n];
        LinkedList<Integer> stk = new LinkedList<>();
        for (int i = 0; i < n; i ++) {
            while (!stk.isEmpty() && heights[stk.getLast()] >= heights[i]) stk.removeLast();
            lmin[i] = stk.isEmpty() ? -1 : stk.getLast();
            stk.addLast(i);
        }
        stk.clear();
        for (int i = n - 1; i >= 0; i --) {
            while (!stk.isEmpty() && heights[stk.getLast()] >= heights[i]) stk.removeLast();
            rmin[i] = stk.isEmpty() ? n : stk.getLast();
            stk.addLast(i);
        }
        int res = 0;
        for (int i = 0; i < n; i ++) {
            res = Math.max(res, (rmin[i] - lmin[i] - 1)* heights[i]);
        }
        return res;
    }

}

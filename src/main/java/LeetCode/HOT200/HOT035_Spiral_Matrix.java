package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.List;

/**
 * 螺旋矩阵
 */
public class HOT035_Spiral_Matrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length < 1 || matrix[0].length < 1) return res;
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        boolean[][] v = new boolean[matrix.length][matrix[0].length];
        int x = 0, y = 0, k = 1;
        for (int i = 0; i < matrix.length * matrix[0].length; i ++) {
            res.add(matrix[x][y]);
            v[x][y] = true;
            int nx = x + dx[k], ny = y + dy[k];
            if (nx < 0 || ny < 0 || nx >= matrix.length || ny >= matrix[0].length || v[nx][ny]) {
                k = (k + 1) % 4;
            }
            x += dx[k];
            y += dy[k];
        }
        return res;
    }

}

package 剑指Offer.arr_matrix;

/**
 * 顺时针蛇形打印矩阵
 */
public class print_matrix_clockwise {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length < 1 || matrix[0].length < 1) return new int[]{};
        int n = matrix.length, m = matrix[0].length;
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1}, res = new int[n * m];
        int k = 1, x = 0, y = 0;
        boolean[][] v = new boolean[n][m];
        for (int i = 0; i < res.length; i ++) {
            res[i] = matrix[x][y];
            v[x][y] = true;
            int nx = x + dx[k], ny = y + dy[k];
            if (nx < 0 || ny < 0 || nx >= n || ny >= m || v[nx][ny]) {
                k = (k + 1) % 4;
            }
            x = x + dx[k];
            y = y + dy[k];
        }
        return res;
    }

}

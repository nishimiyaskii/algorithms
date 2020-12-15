package 剑指Offer.arr_matrix;

/**
 * 二维数组的查找
 */
public class search_in_matrix {

    public boolean findNumberIn2DArray(int[][] matrix, int t) {
        if (matrix.length < 1 || matrix[0].length < 1) return false;
        int n = matrix.length, m = matrix[0].length, x = 0, y = m - 1;
        while (x < n && y >= 0) {
            if (t > matrix[x][y]) x ++;
            else if (t < matrix[x][y]) y --;
            else return true;
        }
        return false;
    }

}

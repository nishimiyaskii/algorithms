package LeetCode.HOT200;

/**
 * 搜索二维矩阵II
 * @Author aimerrhythms
 * @Date 2020/12/31 10:33
 */
public class HOT126_Search_2D_Matrix_II {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length < 1 || matrix[0].length < 1) return false;
        int n = matrix.length, m = matrix[0].length;
        int i = n - 1, j = 0;
        while (i >= 0 && j < m) {
            if (target < matrix[i][j]) i --;
            else if (target > matrix[i][j]) j ++;
            else return true;
        }
        return false;
    }

}

package LeetCode.HOT200;

/**
 * 旋转图像：顺时针90°
 */
public class HOT032_Rotate_Image {

    public void rotate(int[][] matrix) {
        // 先反对角线翻转
        for (int i = 1; i < matrix.length; i ++) {
            for (int j = 0; j < i; j ++) {
                swap(matrix, i, j, j, i);
            }
        }
        // 再竖向翻转
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[0].length / 2; j ++) {
                swap(matrix, i, j, i, matrix[0].length - j - 1);
            }
        }
    }

    void swap(int[][] matrix, int x1, int y1, int x2, int y2) {
        int t = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = t;
    }

}

package LeetCode.HOT200;

/**
 * 有序矩阵中底k小元素
 *
 * 1、二分：l=0,0，r=n-1,m-1
 * 2、判断<=mid的个数(可以使用On的算法实现)
 *      <= mid的个数如果是 >= k的，说明第k小的数在t的右边
 *      反之在t的左边
 *
 * @Author cx
 * @Data 2021/1/13 12:47
 */
public class HOT148_Kth_Smallest_Element_in_Sorted_Matrix {

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, m = matrix[0].length;
        int l = matrix[0][0], r = matrix[n - 1][m - 1];
        while (l < r) {
            int mid = l + r >> 1;
            int y = m - 1, cnt = 0;
            for (int x = 0; x < n; x ++) {
                while (y >= 0 && matrix[x][y] > mid) y --;
                cnt += y + 1;
            }
            if (cnt >= k) r = mid;
            else l = mid + 1;
        }
        return r;
    }

}

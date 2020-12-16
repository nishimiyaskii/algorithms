package LeetCode.HOT200;

/**
 * 俩个有序数组的中位数
 */
public class HOT004_Median_of_Two_Sorted_Arrays______ {

    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int tot = arr1.length + arr2.length;
        if ((tot & 1) == 1) return find(arr1, 0, arr2, 0, tot / 2 + 1) / 1.0;
        else return (find(arr1, 0, arr2, 0, tot / 2) + find(arr1, 0, arr2, 0, tot / 2 + 1)) / 2.0;
    }

    int find(int[] arr1, int u1, int[] arr2, int u2, int k) {
        if (arr1.length - u1 > arr2.length - u2) return find(arr2, u2, arr1, u1, k);
        if (k == 1) {
            if (arr1.length == u1) return arr2[u2];
            else return Math.min(arr1[u1], arr2[u2]);
        } else {
            if (arr1.length == u1) return arr2[u2 + k - 1];
            else {
                // i j表示下一次递归时每个数组的起点
                int i = Math.min(arr1.length, u1 + k / 2), j = u2 + k / 2;
                if (arr1[i - 1] > arr2[j - 1]) return find(arr1, u1, arr2, j, k - (j - u2));
                else return find(arr1, i, arr2, u2, k - (i - u1));
            }
        }
    }
}


package 剑指Offer.sort;

/**
 * 数组中的逆序对
 */
public class reverse_pairs {

    public int reversePairs(int[] arr) {
        if (arr.length < 2) return 0;
        return merge(arr, 0, arr.length - 1);
    }

    int merge (int[] arr, int l, int r) {
        if (l >= r) return 0;
        int mid = l + r >> 1;
        int res = merge(arr, l, mid) + merge(arr, mid + 1, r);
        int[] temp = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k ++] = arr[i ++];
            } else {
                temp[k ++] = arr[j ++];
                res += mid - i + 1;
            }
        }
        while (i <= mid) temp[k ++] = arr[i ++];
        while (j <= r) temp[k ++] = arr[j ++];
        for (i = l, k = 0; i <= r; i ++, k ++) arr[i] = temp[k];
        return res;
    }

}

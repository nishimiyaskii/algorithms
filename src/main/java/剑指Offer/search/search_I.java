package 剑指Offer.search;

/**
 * 统计数字在排序数组中出现的次数
 */
public class search_I {

    public int search(int[] arr, int k) {
        if (arr.length < 1) return 0;
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (k > arr[mid]) l = mid + 1;
            else r = mid;
        }
        if (arr[l] != k) return 0;
        int left = l;
        l = 0; r = arr.length - 1;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (k < arr[mid]) r = mid - 1;
            else l = mid;
        }
        return r - left + 1;
    }

}

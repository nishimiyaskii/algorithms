package LeetCode.HOT200;

/**
 * 搜索排序数组
 */
public class HOT025_Search_in_Rotated_Sorted_Array {

    public int search(int[] arr, int t) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (arr[mid] > arr[r]) l = mid + 1;
            else if (arr[mid] < arr[r]) r = mid;
            else r --;
        }
//        System.out.println(l + "   " + r);
        if (arr[arr.length - 1] < t) {
            // 搜左边
            return binary_search(arr, 0, l - 1, t);
        } else {
            // 搜右边
            return binary_search(arr, l, arr.length - 1, t);
        }
    }

    private int binary_search(int[] arr, int l, int r, int t) {
        while (l < r) {
            int mid = l + r >> 1;
            if (arr[mid] >= t) r = mid;
            else l = mid + 1;
        }
        return arr[l] == t ? l : -1;
    }

}

package 剑指Offer.search;

/**
 * 旋转数组的最小值
 */
public class min_in_rotate_arr {

    public int minArray(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (arr[mid] > arr[r]) l = mid + 1;
            else if (arr[mid] < arr[r]) r = mid;
            else r --;
        }
        return arr[l];
    }

}

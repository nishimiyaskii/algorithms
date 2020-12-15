package 剑指Offer.arr_matrix;

/**
 * 找出数组中任意重复的数字
 *      1 ~ n-1
 *      重复的可能不止一个且不止重复一次
 */
public class find_repeat_number {

    public int findRepeatNumber(int[] arr) {
        if (arr.length < 2) return -1;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == i) continue;
            if (arr[i] == arr[arr[i]]) return arr[i];
            swap(arr, i, arr[i]);
        }
        return -1;
    }

    private void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

}

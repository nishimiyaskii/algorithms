package LeetCode.HOT200;

/**
 * 数组中的第K大元素
 * @Author aimerrhythms
 * @Date 2020/12/29 8:55
 */
public class HOT112_Kth_Largest_Element_in_an_Array {

    /**
     * 快选O(n)时间
     */
    public int findKthLargest(int[] nums, int k) {
        // 这里是下标
        return quick(nums, 0, nums.length - 1, k - 1);
    }

    int quick (int[] arr, int l, int r, int k) {
        if (l >= r) return arr[k];
        int i = l - 1, j = r + 1, pivot = arr[l + r >> 1];
        while (i < j) {
            do i ++; while (arr[i] > pivot);
            do j --; while (arr[j] < pivot);
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        if (k <= j) return quick(arr, l, j, k);
        else return quick(arr, j + 1, r, k);
    }

}

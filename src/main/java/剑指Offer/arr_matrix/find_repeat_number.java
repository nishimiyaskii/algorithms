package 剑指Offer.arr_matrix;

/**
 * 找出数组中任意重复的数字
 *      1 ~ n-1
 *      重复的可能不止一个且不止重复一次
 */
public class find_repeat_number {

    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        for (int x : nums) {
            if (x < 0 || x >= n) return -1;
        }
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == i) continue;
            if (nums[i] == nums[nums[i]]) return nums[i];
            swap(nums, i, nums[i]);
        }
        return -1;
    }

    private void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
}

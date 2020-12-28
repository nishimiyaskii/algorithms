package LeetCode.HOT200;

/**
 * 旋转数组
 * @author aimerrhythms
 */
public class HOT103_Rotate_Array {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int t = arr[l];
            arr[l ++] = arr[r];
            arr[r --] = t;
        }
    }

}

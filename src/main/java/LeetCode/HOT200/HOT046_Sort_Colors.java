package LeetCode.HOT200;

/**
 * 颜色排序
 */
public class HOT046_Sort_Colors {

    public void sortColors(int[] nums) {
        if (nums.length < 2) return;
        int nextZero = 0, nextTwo = nums.length - 1;
        for (int i = 0; i <= nextTwo; ) {
            if (nums[i] == 0) swap(nums, nextZero ++, i ++);
            else if (nums[i] == 2) swap(nums, i, nextTwo --);
            else i ++;
        }
    }

    void swap(int[] nums, int l, int r) {
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
    }

}

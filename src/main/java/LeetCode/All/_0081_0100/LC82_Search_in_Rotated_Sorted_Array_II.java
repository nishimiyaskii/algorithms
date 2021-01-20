package LeetCode.All._0081_0100;

/**
 * @Author cx
 * @Data 2021/1/20 13:23
 */
public class LC82_Search_in_Rotated_Sorted_Array_II {

    // 主要是考虑如何排除相同元素的影响。
    // 如果左侧存在相同元素不影响
    // 如果右侧存在相同元素也不影响
    // 但是如果开头和结尾存在相同元素，那么数组就不再具有二分性
    // 所以可以先排除右侧(或左侧也可以)和nums[0]相同的元素
    // 由于是判断是否存在，删除部分重复的元素没影响
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if (n < 1) return false;
        // 删除右侧
        // int R = n - 1;
        // while (R >= 0 && nums[R] == nums[0]) R --;
        // if (R < 0) return target == nums[0];
        // int l = 0, r = R;
        // while (l < r) {
        //     int mid = l + r >> 1;
        //     if (nums[mid] > nums[r]) l = mid + 1;
        //     else if (nums[mid] < nums[r]) r = mid;
        //     else r --;
        // }
        // if (target > nums[R]) l = 0;
        // else r = R;
        // while (l < r) {
        //     int mid = l + r >> 1;
        //     if (nums[mid] >= target) r = mid;
        //     else l = mid + 1;
        // }
        // return nums[l] == target;

        // 删除左侧
        int L = 0;
        while (L < n && nums[L] == nums[n - 1]) L ++;
        if (L == n) return target == nums[n - 1];
        //和LC33一样
        int l = L, r = n - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] > nums[r]) l = mid + 1;
            else if (nums[mid] < nums[r]) r = mid;
            else r --;
        }
        if (target > nums[n - 1]) l = L;
        else r = n - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= target) r = mid;
            else l = mid + 1;
        }
        return nums[l] == target;
    }

}

package LeetCode.HOT200;

/**
 * @Author cx
 * @Data 2021/1/14 16:37
 */
public class HOT162_Shortest_Unsorted_Continuous_Subarray {

    // 另一种方法就是排序原数组，然后和原数组挨个比较 nlogn的算法
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l + 1 < n && nums[l] <= nums[l + 1]) l ++;
        if (l == r) return 0;
        while (r - 1 >= 0 && nums[r - 1] <= nums[r]) r --;
        for (int i = l + 1; i < n; i ++) {
            while (l >= 0 && nums[l] > nums[i]) l --;
        }
        for (int i = r - 1; i >= 0; i --) {
            while (r < n && nums[r] < nums[i]) r ++;
        }
        return r - l - 1;
    }

}

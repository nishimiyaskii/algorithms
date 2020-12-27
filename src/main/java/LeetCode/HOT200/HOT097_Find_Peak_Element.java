package LeetCode.HOT200;

/**
 * 寻找峰值：返回任意一个极值点
 */
public class HOT097_Find_Peak_Element {

    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            // 下取整
            int mid = l + r >> 1;
            // 只要mid+1出现下降趋势了，mid就是峰值
            // 或者mid-1出现下降趋势了，mid就是峰值
            // mid-1可能越界：如果mid-1越界，则说明l+r<2，此时可能存在l<r的，所以可能会越界
            // 但是mid+1就不会越界，因为如果mid+1越界，即mid=n，此时l=r=n,但是l=r不会进到循环中，所以mid+1不会越界
            if (nums[mid] < nums[mid + 1]) l = mid + 1;
            else r = mid;

        }
        return l;
    }

}

package template.sort;

/**
 * 归并排序
 * @Author cx
 * @Data 2021/1/17 17:52
 */
public class Merge {

    public void mergeSort(int[] nums) {
        int n = nums.length;
        if (n < 2) return;
        sort(nums, 0, n - 1);
    }

    void sort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = l + r >> 1;
        sort(nums, l, mid);
        sort(nums, mid + 1, r);
        int k = 0, i = l, j = mid + 1;
        int[] temp = new int[r - l + 1];
        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j]) temp[k ++] = nums[i ++];
            else temp[k ++] = nums[j ++];
        }
        while (i <= mid) temp[k ++] = nums[i ++];
        while (j <= r) temp[k ++] = nums[j ++];
        for (k = 0, i = l; i <= r; i ++) {
            nums[i] = temp[k ++];
        }
    }

}

package template.sort;

public class Quick {


    void quickSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1, p = nums[l + r >> 1];
        while (i < j) {
            do i ++; while (nums[i] < p);
            do j --; while (nums[j] > p);
            if (i < j) swap(nums, i, j);
        }
        quickSort(nums, l, j);
        quickSort(nums, j + 1, r);
    }

    void swap(int[] nums, int l, int r) {
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
    }

}

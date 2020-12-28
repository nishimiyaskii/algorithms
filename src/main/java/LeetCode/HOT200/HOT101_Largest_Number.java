package LeetCode.HOT200;

/**
 * 最大数
 *
 * @author aimerrhythms
 */
public class HOT101_Largest_Number {

    public static void main(String[] args) {
        System.out.println(new HOT101_Largest_Number().largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    public String largestNumber(int[] nums) {
        sort(nums, 0, nums.length - 1);
        StringBuilder res = new StringBuilder();
        for (int num : nums) {
            res.append(num);
        }
        return res.toString().startsWith("0")? "0" : res.toString();
    }

    void sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1, pivot = arr[l + r >> 1];
        while (i < j) {
            do i ++; while (check(arr[i], pivot));
            do j --; while (check(pivot, arr[j]));
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        sort(arr, l, j);
        sort(arr, j + 1, r);
    }

    boolean check(int x, int y) {
        return Long.parseLong("" + x + y) - Long.parseLong("" + y + x) > 0;
    }

}

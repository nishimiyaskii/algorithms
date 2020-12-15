package 剑指Offer.sort;

/**
 * 把数组排成最小的数
 */
public class sort_arr_2_min_num {

    public String minNumber(int[] arr) {
        quick(arr, 0, arr.length -  1);
        StringBuilder res = new StringBuilder();
        for (int a : arr) {
            res.append(a);
        }
        return res.toString();
    }

    private void quick(int[] arr, int l, int r) {
        if (l >= r) return;
        int pivot = arr[l + r >> 1], i = l - 1, j = r + 1;
        while (i < j) {
            do i ++; while (compare(arr[i], pivot));
            do j --; while (compare(pivot, arr[j]));
            if (i < j) swap(arr, i, j);
        }
        quick(arr, l, j);
        quick(arr, j + 1, r);
    }

    boolean compare(int x, int y) {
        return Long.parseLong("" + x + y) - Long.parseLong("" + y + x) < 0;
    }

    void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

}

package 模板.sort;

import java.util.Arrays;

public class Quick {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1};
        new Quick().sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr) {
        quick_sort(arr, 0, arr.length - 1);
    }

    void quick_sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1, p = arr[l + r >> 1];
        while (i < j) {
            do i ++; while (arr[i] < p);
            do j --; while (arr[j] > p);
            if (i < j) swap(arr, i, j);
        }
        quick_sort(arr, l, j);
        quick_sort(arr, j + 1, r);
    }

    void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

}

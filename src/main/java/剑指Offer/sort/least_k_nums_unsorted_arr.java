package 剑指Offer.sort;

import java.util.PriorityQueue;

/**
 * 无序数组中最小的k个数
 */
public class least_k_nums_unsorted_arr {

    /**
     * 大顶堆
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length < 1 || k > arr.length) return new int[]{};
        PriorityQueue<Integer> pq = new PriorityQueue<>((x1, x2) -> x2 - x1);
        for (int i = 0; i < k; i ++) {
            pq.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i ++) {
            if (!pq.isEmpty() && arr[i] < pq.peek()) {
                pq.poll();
                pq.offer(arr[i]);
            }
        } 
        int[] res = new int[k];
        while (!pq.isEmpty()) {
            res[-- k] = pq.poll();
        }
        return res;
    }

    /**
     * 快速选择算法
     */
    public int[] quick(int[] arr, int k) {
        quick_select(arr, 0, arr.length - 1, k);
        int[] res = new int[k];
        if (k >= 0) System.arraycopy(arr, 0, res, 0, k);
        return res;
    }

    void quick_select(int[] arr, int l, int r, int k) {
        if (l >= r) return;
        int i = l - 1, j = r + 1, pivot = arr[l + r >> 1];
        while (i < j) {
            do i ++; while (arr[i] < pivot);
            do j --; while (arr[j] > pivot);
            if (i < j) swap(arr, i, j);
        }
        if (k <= j) quick_select(arr, l, j, k);
        else quick_select(arr, j + 1, r, k);
    }

    void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

}

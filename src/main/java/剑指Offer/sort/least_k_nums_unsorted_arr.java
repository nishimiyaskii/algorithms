package 剑指Offer.sort;

import java.util.PriorityQueue;

/**
 * 无序数组中最小的k个数
 */
public class least_k_nums_unsorted_arr {

    /**
     * 大顶堆
     */
    public int[] getLeastNumbers_pq(int[] arr, int k) {
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
     * 快速选择算法：O(n)的时间
     */
    int quick(int[] arr, int l, int r, int k) {
        if (l >= r) return k;
        int i = l - 1, j = r + 1, p = arr[l + r >> 1];
        while (i < j) {
            do i ++; while (arr[i] < p);
            do j --; while (arr[j] > p);
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        if (k <= j) return quick(arr, l, j, k);
        else return quick(arr, j + 1, r, k);
    }

    public int[] getLeastNumbers_quick(int[] arr, int k) {
        k = quick(arr, 0, arr.length - 1, k - 1);
        int[] res = new int[k + 1];
        System.arraycopy(arr, 0, res, 0, k + 1);
        return res;
    }

    void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

}

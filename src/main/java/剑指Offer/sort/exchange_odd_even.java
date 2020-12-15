package 剑指Offer.sort;

/**
 * 调整奇数在偶数前面
 */
public class exchange_odd_even {

    public static void main(String[] args) {

    }

    public int[] exchange(int[] arr) {
        if (arr.length < 1) return arr;
        // int i = l - 1, j = r + 1;
        int l = -1, r = arr.length, pivot = arr[l + r >> 1];
        while (l < r) {
            do l ++; while (l < arr.length && isOdd(arr[l]));
            do r --; while (r >= 0 && !isOdd(arr[r]));
            if (l < r) swap(arr, l, r);
        }
        return arr;
    }

    boolean isOdd(int x) {
        return (x & -x) == 1;
    }

    void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

}

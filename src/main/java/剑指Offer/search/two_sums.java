package 剑指Offer.search;

/**
 * 递增数组的两数之和：递增数组的话可以用二分
 */
public class two_sums {

    public int[] twoSums(int[] arr, int t) {
        if (arr.length < 1) return new int[]{};
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int s = arr[l] + arr[r];
            if (s < t) l ++;
            else if (s > t) r --;
            else return new int[]{arr[l], arr[r]};
        }
        return new int[]{};
    }

}

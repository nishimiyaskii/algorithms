package 剑指Offer.math;

import java.util.Arrays;

/**
 * 扑克牌是不是顺子
 */
public class poker_is_straight {

    public static void main(String[] args) {
        System.out.println(new poker_is_straight().isStraight(new int[]{0, 0, 2, 2, 5}));
    }

    public boolean isStraight(int[] arr) {
        if (arr.length < 5) return false;
        Arrays.sort(arr);
        int k = 0;
        while (arr[k] == 0) k++;
        for (int i = k; i < arr.length; i ++) {
            if (i > 0 && arr[i] == arr[i - 1]) return false;
        }
        return arr[arr.length - 1] - arr[k] < 5;
    }

}

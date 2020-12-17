package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数之和
 */
public class HOT013_Four_Sum {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> fourSum(int[] arr, int target) {
        if (arr.length < 4) return res;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i ++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < arr.length; j ++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                for (int l = j + 1, r = arr.length - 1; l < r; l ++) {
                    if (l > j + 1 && arr[l] == arr[l - 1]) continue;
                    while (r - 1 > l && arr[i] + arr[j] + arr[l] + arr[r - 1] >= target) r --;
                    if (arr[i] + arr[j] + arr[l] + arr[r] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[l]);
                        list.add(arr[r]);
                        res.add(list);
                    }
                }
            }
        }
        return res;
    }

}

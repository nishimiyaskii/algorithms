package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 */
public class HOT010_Three_Sum {

    public static void main(String[] args) {
        System.out.println(new HOT010_Three_Sum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int len = arr.length;
        if (len < 3) return res;
        Arrays.sort(arr);
        for (int i = 0; i < len; i ++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1, k = len - 1; j < k; j ++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                while (k - 1 > j && arr[i] + arr[j] + arr[k - 1] >= 0) k --;
                if (arr[i] + arr[j] + arr[k] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    res.add(list);
                }
            }
        }
        return res;
    }

}

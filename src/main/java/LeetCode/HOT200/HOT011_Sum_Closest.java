package LeetCode.HOT200;

import java.util.Arrays;

/**
 * 最接近的三数之和
 */
public class HOT011_Sum_Closest {

    public static void main(String[] args) {
        System.out.println(new HOT011_Sum_Closest().threeSumClosest(new int[]{1, 1, 0, 1}, 1));
    }

    public int threeSumClosest(int[] arr, int target) {
        int res = 0, min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i ++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1, k = arr.length - 1; j < k; j ++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                while (k - 1 > j && arr[i] + arr[j] + arr[k - 1] >= target) k --;
                int s = arr[i] + arr[j] + arr[k - 1];
                if (Math.abs(s - target) < min) {
                    res = s;
                    min = Math.abs(s - target);
                }
                if (k - 1 > j) {
                    int tot = arr[i] + arr[j] + arr[k - 1];
                    if (target - tot < min) {
                        res = tot;
                        min = target - tot;
                    }
                }
            }
        }
        return res;
    }

}

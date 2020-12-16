package LeetCode.HOT200;

import java.util.HashMap;
import java.util.Map;

/**
 * Offer：排序数组的两数之和
 * HOT010：三数之和
 * HOT013：四数之和
 */
public class HOT001_Two_Sum {

    public int[] twoSum(int[] arr, int s) {
        if (arr.length < 2) return new int[]{};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i ++) {
            if (map.containsKey(s - arr[i])) {
                return new int[]{i, map.get(s - arr[i])};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }

}

package LeetCode.HOT200;

import java.util.*;

/**
 * 两个数组的交集II：res中包含元素重复次数的最小个数
 *
 * 思考题
 *  1、两个排序数组：双指针
 *  2、某个数组的长度>>另一个数组：小数组存在map中
 *  3、某个数组过长，且存在内存限制
 *      1)、如果存在一个数组很小，可以读进内存，那么就把小的放入map，然后while循环读取大数组的文件
 *      2)、如果两个都很大，那么对两个数组排序，然后用双指针
 *          大数组排序的话使用**外部排序**
 *          外部排序的话就是把大文件的一部分读到内存中排序，然后输出到一个小文件中
 *          这样一个大文件就变成了**多个有序的小文件**，小文件再进行归并即可
 *
 * @Author cx
 * @Data 2021/1/12 11:35
 */
public class HOT147_Intersection_of_Two_Arrays_II {

    /**
     * 两个无序数组
     * hashmap
     */
    public int[] intersect_hashmap(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums1) {
            map.put(x, map.containsKey(x) ? map.get(x) + 1 : 1);
        }
        for (int x : nums2) {
            if (map.containsKey(x) && map.get(x) > 0) {
                list.add(x);
                map.put(x, map.get(x) - 1);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i ++) {
            res[i] = list.get(i);
        }
        return res;
    }


    /**
     * 双指针：适用于两个排序的数组
     *
     * 两个指针指向数组的开头
     *  如果2个数相同，则添加到结果中，指针同时后移；
     *  否则，小数的指针后移1位
     *
     * O(N+M)的时间复杂度（如果是排序数组的话）
     * O(1)的空间
     */
    public int[] intersect_double_point(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) i ++;
            else if (nums1[i] > nums2[j]) j ++;
            else {
                list.add(nums1[i]);
                i ++; j ++;
            }
        }
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k ++) {
            res[k] = list.get(k);
        }
        return res;
    }

}

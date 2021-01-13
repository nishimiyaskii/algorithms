package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author cx
 * @Data 2021/1/12 11:54
 */
public class HOT146_Intersection_of_Two_Arrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int x : nums1) set.add(x);
        for (int x : nums2) {
            if (set.contains(x)) {
                list.add(x);
                set.remove(x);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i ++) {
            res[i] = list.get(i);
        }
        return res;
    }

}

package 剑指Offer.arr_matrix;

import java.util.HashSet;

/**
 * 不修改数组找出重复元素
 */
public class find_repeat_number_with_no_change {

    public int duplicateInArray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : arr) {
            if (set.contains(a)) return a;
            else set.add(a);
        }
        return -1;
    }

}

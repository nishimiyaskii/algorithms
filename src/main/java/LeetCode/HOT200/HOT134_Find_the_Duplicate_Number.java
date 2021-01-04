package LeetCode.HOT200;

import java.util.Arrays;

/**
 * 寻找重复数字
 *
 * 类比剑指Offer中的寻找重复数字
 * @Author aimerrhythms
 * @Date 2021/1/3 15:28
 */
public class HOT134_Find_the_Duplicate_Number {

    public int findDuplicate(int[] nums) {
        int s = 0, f = 0;
        while (true) {
            s = nums[s];
            f = nums[nums[f]];
            if (s == f) {
                s = 0;
                while (s != f) {
                    s = nums[s];
                    f = nums[f];
                }
                return s;
            }
        }
    }

}

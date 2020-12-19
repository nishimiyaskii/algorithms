package LeetCode.HOT200;

/**
 * 无序数组删除指定元素
 *
 * 题目的要求
 *  1、原地算法，返回新数组的长度
 *  2、不需要考虑新数组后面的元素
 *  3、输出可以原顺序不同
 *
 */
public class HOT020_Remove_Element {

    public int removeElement(int[] nums, int x) {
        if (nums.length < 1) return 0;
        int k = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != x) {
                nums[k ++] = nums[i];
            }
        }
        return k;
    }

}

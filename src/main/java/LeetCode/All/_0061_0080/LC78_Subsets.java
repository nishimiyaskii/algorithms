package LeetCode.All._0061_0080;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 * @Author cx
 * @Data 2021/1/20 13:11
 */
public class LC78_Subsets {

    /*
     * 1、大小为n的集合的子集个数为2^n：牛顿二项式定理可证明
     * 2、可以将子集分为多个更小的子集：0个数的集合、1个数的集合、2个数的集合、...、n个数的集合
     * 3、从二进制的角度看2中的划分：表示0~2^n-1中1bit存在的个数：1个、2个、3个、..
     * 4、同样的，每种不同1bit的个数也存在多种情况
     *      如[1,2,3]的子集可以表示成0~2^3-1中1bit的个数
     *      0个1bit的情况为000
     *      1个1bit的情况为100 010 001
     *      2个1bit的情况为110 101 011
     *      3个1bit的情况为111
     *      其中1bit所在的位置i就表示nums[i]可选
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if (n < 1) return res;
        int k = 1 << n;
        for (int i = 0; i < k; i ++) {
            List<Integer> list = new ArrayList<>();
            int index = 0, j = i;
            while (j > 0) {
                if ((j & 1) == 1) list.add(nums[index]);
                index ++;
                j >>= 1;
            }
            res.add(list);
        }
        return res;
    }

}

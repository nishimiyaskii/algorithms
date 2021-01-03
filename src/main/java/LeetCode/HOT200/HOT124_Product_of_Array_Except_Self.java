package LeetCode.HOT200;

/**
 * 除自身以外的数组乘积
 * @Author aimerrhythms
 * @Date 2020/12/31 10:15
 */
public class HOT124_Product_of_Array_Except_Self {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        if (n < 1) return res;
        for (int i = 0,p = 1; i < n; i ++) {
            res[i] = p;
            p *= nums[i];
        }
        for (int i = n - 1, p = 1; i >= 0; i --) {
            res[i] *= p;
            p *= nums[i];
        }
        return res;
    }

}

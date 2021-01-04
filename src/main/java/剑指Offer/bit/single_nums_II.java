package 剑指Offer.bit;

/**
 * 一个出现了1次，其他都出现了3次
 * 状态机DP
 */
public class single_nums_II {

    public int singleNumber(int[] arr) {
        int a = 0, b = 0;
        for (int n : arr) {
            a = (a ^ n) & ~b;
            b = (b ^ n) & ~a;
        }
        return a;
    }

}

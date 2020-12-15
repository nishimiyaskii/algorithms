package 剑指Offer.math;

/**
 * 剪绳子：结果可能越界，%1000000007
 */
public class cut_rope_II {

    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int res = 1;
        if (n % 3 == 1) {
            res = 4;
            n -= 4;
        } else if (n % 3 == 2) {
            res = 2;
            n -= 2;
        }
        while (n > 0) {
            res = (int) (((long) res * 3) % 1000000007);
            n -= 3;
        }
        return res;
    }

}
